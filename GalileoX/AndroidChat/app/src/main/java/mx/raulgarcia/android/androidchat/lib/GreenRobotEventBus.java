package mx.raulgarcia.android.androidchat.lib;

/**
 * Created by rraulg5 on 18/07/2016.
 */
public class GreenRobotEventBus implements EventBus {

    de.greenrobot.event.EventBus eventBus;

    private static class SingletonHolder {
        private static final GreenRobotEventBus INSTANCE = new GreenRobotEventBus();
    }

    public static GreenRobotEventBus getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public GreenRobotEventBus() {
        this.eventBus = de.greenrobot.event.EventBus.getDefault();
    }

    @Override
    public void register(Object suscriber) {
        eventBus.register(suscriber);
    }

    @Override
    public void unregister(Object suscriber) {
        eventBus.unregister(suscriber);
    }

    @Override
    public void post(Object event) {
        eventBus.post(event);
    }
}
