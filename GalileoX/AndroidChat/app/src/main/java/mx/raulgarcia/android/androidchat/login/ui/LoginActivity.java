package mx.raulgarcia.android.androidchat.login.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import mx.raulgarcia.android.androidchat.R;
import mx.raulgarcia.android.androidchat.contactlist.ui.ContactListActivity;
import mx.raulgarcia.android.androidchat.login.LoginPresenter;
import mx.raulgarcia.android.androidchat.login.LoginPresenterImpl;
import mx.raulgarcia.android.androidchat.signup.ui.SignUpActivity;

public class LoginActivity extends AppCompatActivity implements LoginView {

    @Bind(R.id.btnSignIn)
    Button btnSignIn;
    @Bind(R.id.btnSignUp)
    Button btnSignUp;
    @Bind(R.id.editTxtEmail)
    EditText inputEmail;
    @Bind(R.id.editTxtPassword)
    EditText inputPassword;
    @Bind(R.id.progressBar)
    ProgressBar progressBar;
    @Bind(R.id.layoutMainContainer)
    RelativeLayout container;

    private LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        loginPresenter = new LoginPresenterImpl(this);
    }

    @Override
    protected void onPause() {
        loginPresenter.onPause();
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();

        loginPresenter.onResume();
        loginPresenter.checkForAuthenticatedUser();
    }

    @Override
    protected void onDestroy() {
        loginPresenter.onDestroy();
        super.onDestroy();
    }

    @Override
    public void navigateToMainScreen() {
        Intent intent = new Intent(this, ContactListActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }

    @Override
    public void loginError(String error) {
        inputPassword.setText("");
        String msgError = String.format(getString(R.string.login_error_msg_signin), error);
        inputPassword.setError(msgError);
    }

    @Override
    public void newUserSuccess() {
        throw new UnsupportedOperationException("Operation is not valid in SignUpActivity");
    }

    @Override
    public void newUserError(String error) {
        throw new UnsupportedOperationException("Operation is not valid in SignUpActivity");
    }

    @Override
    public void enableInputs() {
        setInputs(true);
    }

    @Override
    public void disableInputs() {
        setInputs(false);
    }

    @Override
    public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        progressBar.setVisibility(View.GONE);
    }

    @OnClick(R.id.btnSignUp)
    @Override
    public void handleSignUp() {
        startActivity(new Intent(this, SignUpActivity.class));
    }

    @OnClick(R.id.btnSignIn)
    @Override
    public void handleSignIn() {
        loginPresenter.validateLogin(
                inputEmail.getText().toString(),
                inputEmail.getText().toString()
        );
    }

    private void setInputs(boolean enabled) {
        inputEmail.setEnabled(enabled);
        inputPassword.setEnabled(enabled);
        btnSignIn.setEnabled(enabled);
        btnSignUp.setEnabled(enabled);
    }
}
