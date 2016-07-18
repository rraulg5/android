package mx.raulgarcia.android.androidchat.login;

import android.util.Log;

import mx.raulgarcia.android.androidchat.domain.FirebaseHelper;

/**
 * Created by rraulg5 on 18/07/2016.
 */
public class LoginRepositoryImpl implements LoginRepository {

    private FirebaseHelper helper;

    public LoginRepositoryImpl() {
        this.helper = FirebaseHelper.getInstance();
    }

    @Override
    public void singUp(String email, String password) {
        Log.e("LoginRepositoryImpl", "signup");
    }

    @Override
    public void singIn(String email, String password) {
        Log.e("LoginRepositoryImpl", "signin");
    }

    @Override
    public void checkSession() {
        Log.e("LoginRepositoryImpl", "check session");
    }
}
