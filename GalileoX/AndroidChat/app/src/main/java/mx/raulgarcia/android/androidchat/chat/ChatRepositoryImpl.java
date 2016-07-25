package mx.raulgarcia.android.androidchat.chat;

import com.firebase.client.ChildEventListener;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;

import mx.raulgarcia.android.androidchat.chat.events.ChatEvent;
import mx.raulgarcia.android.androidchat.domain.FirebaseHelper;
import mx.raulgarcia.android.androidchat.entities.ChatMessage;
import mx.raulgarcia.android.androidchat.lib.EventBus;
import mx.raulgarcia.android.androidchat.lib.GreenRobotEventBus;

/**
 * Created by rraulg5 on 24/07/16.
 */
public class ChatRepositoryImpl implements ChatRepository {

    private String receiver;
    private FirebaseHelper helper;
    private EventBus eventBus;
    private ChildEventListener childEventListener;

    public ChatRepositoryImpl() {
        this.helper = FirebaseHelper.getInstance();
        this.eventBus = GreenRobotEventBus.getInstance();
    }

    @Override
    public void sendMessage(String msg) {
        ChatMessage chatMessage = new ChatMessage();
        chatMessage.setSender(helper.getAuthUserEmail());
        chatMessage.setMsg(msg);

        Firebase chatReference = helper.getChatsReference(receiver);
        chatReference.push().setValue(chatMessage);
    }

    @Override
    public void setRecipient(String recipient) {
        this.receiver = recipient;
    }

    @Override
    public void suscribe() {
        if (childEventListener == null) {
            childEventListener = new ChildEventListener() {
                @Override
                public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                    ChatMessage chatMessage = dataSnapshot.getValue(ChatMessage.class);
                    String msgSender = chatMessage.getSender();

                    chatMessage.setSentByMe(msgSender.equals(helper.getAuthUserEmail()));

                    ChatEvent chatEvent = new ChatEvent();
                    chatEvent.setMessage(chatMessage);
                    eventBus.post(chatEvent);
                }

                @Override
                public void onChildChanged(DataSnapshot dataSnapshot, String s) {

                }

                @Override
                public void onChildRemoved(DataSnapshot dataSnapshot) {

                }

                @Override
                public void onChildMoved(DataSnapshot dataSnapshot, String s) {

                }

                @Override
                public void onCancelled(FirebaseError firebaseError) {

                }
            };
        }
        helper.getChatsReference(receiver).addChildEventListener(childEventListener);
    }

    @Override
    public void unsuscribe() {
        if (childEventListener != null) {
            helper.getChatsReference(receiver).removeEventListener(childEventListener);
        }
    }

    @Override
    public void destroyListener() {
        childEventListener = null;
    }

    @Override
    public void changeConnectionStatus(boolean online) {
        helper.changeUserConnectionStatus(online);
    }
}
