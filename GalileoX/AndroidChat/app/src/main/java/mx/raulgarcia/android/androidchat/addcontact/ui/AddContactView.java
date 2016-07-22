package mx.raulgarcia.android.androidchat.addcontact.ui;

/**
 * Created by rraulg5 on 22/07/2016.
 */
public interface AddContactView {

    void showInput();
    void hideInput();
    void showProgress();
    void hideProgress();

    void contactAdded();
    void contactNotAdded();
}
