package mx.raulgarcia.android.androidchat.contactlist;

/**
 * Created by rraulg5 on 20/07/2016.
 */
public interface ContactListRepository {

    void signOff();
    String getCurrentUserEmail();
    void removeContact(String email);
    void destroyListener();
    void suscribeToContactListEvents();
    void unsuscribeToContactListEvents();
    void changeConnectionStatus(boolean online);
}
