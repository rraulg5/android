package mx.raulgarcia.android.androidchat.login;

/**
 * Created by rraulg5 on 17/07/16.
 */
public interface LoginRepository {
    void singUp(String email, String password);
    void singIn(String email, String password);
    void checkSession();
}
