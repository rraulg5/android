package mx.raulgarcia.android.androidchat.contactlist.ui;

import mx.raulgarcia.android.androidchat.entities.User;

/**
 * Created by rraulg5 on 20/07/2016.
 */
public interface ContactListView {
    void onContactAdded(User user);
    void onContactChanged(User user);
    void onContactRemoved(User user);
}
