package mx.raulgarcia.android.androidchat.chat;

/**
 * Created by rraulg5 on 22/07/2016.
 */
public interface ChatRepository {

    void sendMessage(String msg);
    void setRecipient(String recipient);

    void suscribe();
    void unsuscribe();
    void destroyListener();
    void changeConnectionStatus(boolean online);
}
