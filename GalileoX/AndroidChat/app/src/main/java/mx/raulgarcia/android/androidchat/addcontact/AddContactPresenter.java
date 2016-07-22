package mx.raulgarcia.android.androidchat.addcontact;

import mx.raulgarcia.android.androidchat.addcontact.events.AddContactEvent;

/**
 * Created by rraulg5 on 22/07/2016.
 */
public interface AddContactPresenter {

    void onShow();
    void onDestroy();

    void addContact(String email);
    void onEventMainThread(AddContactEvent event);
}
