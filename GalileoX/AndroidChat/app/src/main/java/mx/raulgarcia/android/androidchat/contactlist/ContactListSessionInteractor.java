package mx.raulgarcia.android.androidchat.contactlist;

/**
 * Created by rraulg5 on 20/07/2016.
 */
public interface ContactListSessionInteractor {

    void signOff();
    String getCurrentUserEmail();
    void changeConnectionStatus(boolean online);
}
