package mx.raulgarcia.android.androidchat;

import com.firebase.client.AuthData;
import com.firebase.client.Firebase;

import java.util.Map;

/**
 * Created by garcluis on 15/07/2016.
 */
public class FirebaseHelper {

    private Firebase dataReference;
    private final static String SEPARATOR = "___";
    private final static String CHATS_PATH = "chats";
    private final static String USERS_PATH = "users";
    private final static String CONTACTS_PATH = "contacs";
    private final static String FIREBASE_URL = "https://android-chat-example.firebaseio.com";

    private static class SingletonHolder {
        private static final FirebaseHelper INSTANCE = new FirebaseHelper();
    }

    public static FirebaseHelper getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public FirebaseHelper() {
        this.dataReference = new Firebase(FIREBASE_URL);
    }

    public Firebase getDataReference() {
        return dataReference;
    }

    public String getAuthUserEmail() {
        AuthData authData = dataReference.getAuth();

        if (authData != null) {
            Map<String, Object> providerData = authData.getProviderData();
            return providerData.get("email").toString();
        }

        return null;
    }
}
