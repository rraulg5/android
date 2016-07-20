package mx.raulgarcia.android.androidchat.contactlist;

/**
 * Created by rraulg5 on 20/07/2016.
 */
public interface ContactListInteractor {

    void suscribe();
    void unsuscribe();
    void destroyListener();
    void removeContact(String email);
}
