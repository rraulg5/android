package mx.raulgarcia.android.androidchat.contactlist.ui.adapters;

import mx.raulgarcia.android.androidchat.entities.User;

/**
 * Created by rraulg5 on 20/07/2016.
 */
public interface OnItemClickListener {

    void onItemClick(User user);
    void onItemLongClick(User user);
}
