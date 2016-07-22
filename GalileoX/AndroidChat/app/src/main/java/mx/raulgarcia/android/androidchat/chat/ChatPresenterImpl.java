package mx.raulgarcia.android.androidchat.chat;

import mx.raulgarcia.android.androidchat.chat.events.ChatEvent;
import mx.raulgarcia.android.androidchat.chat.ui.ChatView;
import mx.raulgarcia.android.androidchat.entities.User;
import mx.raulgarcia.android.androidchat.lib.EventBus;
import mx.raulgarcia.android.androidchat.lib.GreenRobotEventBus;

/**
 * Created by rraulg5 on 22/07/2016.
 */
public class ChatPresenterImpl implements ChatPresenter {

    private EventBus eventBus;
    private ChatView view;
    private ChatInteractor interactor;
    private ChatSessionInteractor sessionInteractor;

    public ChatPresenterImpl(ChatView view) {
        this.view = view;
        this.eventBus = GreenRobotEventBus.getInstance();
        this.interactor = new ChatInteractorImpl();
        this.sessionInteractor = new ChatSessionInteractorImpl();
    }

    @Override
    public void onPause() {
        interactor.unsuscribe();
        sessionInteractor.changeConnectionStatus(User.OFFLINE);
    }

    @Override
    public void onResume() {
        interactor.suscribe();
        sessionInteractor.changeConnectionStatus(User.ONLINE);
    }

    @Override
    public void onCreate() {
        eventBus.register(this);
    }

    @Override
    public void onDestroy() {
        eventBus.unregister(this);
        interactor.destroyListener();
        view = null;
    }

    @Override
    public void setChatRecipient(String recipient) {
        interactor.setRecipient(recipient);
    }

    @Override
    public void sendMessage(String msg) {
        interactor.sendMessage(msg);
    }

    @Override
    public void onEventMainThread(ChatEvent event) {
        if (view != null) {
            view.onMessageReceived(event.getMessage());
        }
    }
}
