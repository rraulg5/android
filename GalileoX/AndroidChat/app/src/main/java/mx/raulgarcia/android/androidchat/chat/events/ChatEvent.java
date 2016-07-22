package mx.raulgarcia.android.androidchat.chat.events;

import mx.raulgarcia.android.androidchat.entities.ChatMessage;

/**
 * Created by rraulg5 on 22/07/2016.
 */
public class ChatEvent {

    private ChatMessage message;

    public ChatMessage getMessage() {
        return message;
    }

    public void setMessage(ChatMessage message) {
        this.message = message;
    }
}
