package mx.raulgarcia.android.androidchat.contactlist;

import mx.raulgarcia.android.androidchat.contactlist.events.ContactListEvent;

/**
 * Created by rraulg5 on 20/07/2016.
 */
public interface ContactListPresenter {
    void onPause();
    void onResume();
    void onCreate();
    void onDestroy();

    void signOff();
    String getCurrentUserEmail();
    void removeContact(String email);
    void onEventMainThread(ContactListEvent event);
}
