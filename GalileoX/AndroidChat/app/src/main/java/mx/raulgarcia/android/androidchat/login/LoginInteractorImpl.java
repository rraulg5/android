package mx.raulgarcia.android.androidchat.login;

/**
 * Created by rraulg5 on 18/07/2016.
 */
public class LoginInteractorImpl implements LoginInteractor{

    private LoginRepository loginRepository;

    public LoginInteractorImpl() {
        this.loginRepository = new LoginRepositoryImpl();
    }

    @Override
    public void checkSession() {
        loginRepository.checkSession();
    }

    @Override
    public void doSignUp(String email, String password) {
        loginRepository.singUp(email, password);
    }

    @Override
    public void doSignIn(String email, String password) {
        loginRepository.singIn(email, password);
    }
}
