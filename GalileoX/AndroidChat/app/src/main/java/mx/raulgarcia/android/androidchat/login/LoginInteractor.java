package mx.raulgarcia.android.androidchat.login;

/**
 * Created by rraulg5 on 17/07/16.
 */
public interface LoginInteractor {
    void checkSession();
    void doSignUp(String email, String password);
    void doSignIn(String email, String password);
}
