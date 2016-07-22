package mx.raulgarcia.android.androidchat.chat;

import mx.raulgarcia.android.androidchat.chat.events.ChatEvent;

/**
 * Created by rraulg5 on 22/07/2016.
 */
public interface ChatPresenter {

    void onPause();
    void onResume();
    void onCreate();
    void onDestroy();

    void setChatRecipient(String recipient);
    void sendMessage(String msg);
    void onEventMainThread(ChatEvent event);
}
