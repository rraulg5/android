package mx.raulgarcia.android.androidchat.chat;

/**
 * Created by rraulg5 on 22/07/2016.
 */
public class ChatInteractorImpl implements ChatInteractor {

    ChatRepository repository;

    public ChatInteractorImpl() {
        this.repository = new ChatRepositoryImpl();
    }

    @Override
    public void sendMessage(String msg) {
        repository.sendMessage(msg);
    }

    @Override
    public void setRecipient(String recipient) {
        repository.setRecipient(recipient);
    }

    @Override
    public void suscribe() {
        repository.suscribe();
    }

    @Override
    public void unsuscribe() {
        repository.unsuscribe();
    }

    @Override
    public void destroyListener() {
        repository.destroyListener();
    }
}
