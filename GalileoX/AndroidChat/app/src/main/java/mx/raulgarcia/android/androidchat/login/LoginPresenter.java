package mx.raulgarcia.android.androidchat.login;

import mx.raulgarcia.android.androidchat.login.events.LoginEvent;

/**
 * Created by rraulg5 on 17/07/16.
 */
public interface LoginPresenter {
    void onCreate();
    void onDestroy();
    void onResume();
    void onPause();
    void checkForAuthenticatedUser();
    void validateLogin(String email, String password);
    void registerNewUser(String email, String password);
    void onEventMainThread(LoginEvent event);
}
