package mx.raulgarcia.android.androidchat.chat.ui;

import mx.raulgarcia.android.androidchat.entities.ChatMessage;

/**
 * Created by rraulg5 on 22/07/2016.
 */
public interface ChatView {

    void onMessageReceived(ChatMessage msg);
}
