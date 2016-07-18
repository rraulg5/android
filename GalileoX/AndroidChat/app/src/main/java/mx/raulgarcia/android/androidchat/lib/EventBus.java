package mx.raulgarcia.android.androidchat.lib;

/**
 * Created by rraulg5 on 18/07/2016.
 */
public interface EventBus {
    void register(Object suscriber);
    void unregister(Object suscriber);
    void post(Object event);
}
