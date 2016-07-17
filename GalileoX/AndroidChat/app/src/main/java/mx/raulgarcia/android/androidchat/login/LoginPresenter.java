package mx.raulgarcia.android.androidchat.login;

/**
 * Created by rraulg5 on 17/07/16.
 */
public interface LoginPresenter {
    void onDestroy();
    void checkForAuthenticatedUser();
    void validateLogin(String email, String password);
    void registerNewUser(String email, String password);
}
