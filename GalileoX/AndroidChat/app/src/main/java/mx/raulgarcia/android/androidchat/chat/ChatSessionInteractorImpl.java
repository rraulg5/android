package mx.raulgarcia.android.androidchat.chat;

/**
 * Created by rraulg5 on 22/07/2016.
 */
public class ChatSessionInteractorImpl implements ChatSessionInteractor {

    ChatRepository repository;

    public ChatSessionInteractorImpl() {
        this.repository = new ChatRepositoryImpl();
    }

    @Override
    public void changeConnectionStatus(boolean online) {

    }
}
