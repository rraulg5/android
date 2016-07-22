package mx.raulgarcia.android.androidchat.addcontact.events;

/**
 * Created by rraulg5 on 22/07/2016.
 */
public class AddContactEvent {

    boolean error = false;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }
}
