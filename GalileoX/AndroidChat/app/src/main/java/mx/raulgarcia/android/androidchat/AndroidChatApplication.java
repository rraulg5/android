package mx.raulgarcia.android.androidchat;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by rraulg5 on 15/07/2016.
 */
public class AndroidChatApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        setupFirebase();
    }

    private void setupFirebase() {
        Firebase.setAndroidContext(this);
        Firebase.getDefaultConfig().setPersistenceEnabled(true);
    }


}
