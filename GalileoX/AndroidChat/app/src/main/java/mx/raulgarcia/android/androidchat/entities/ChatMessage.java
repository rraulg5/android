package mx.raulgarcia.android.androidchat.entities;

import com.shaded.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by rraulg5 on 22/07/2016.
 */
@JsonIgnoreProperties({"senByMe"})
public class ChatMessage {

    String msg;
    String sender;
    boolean sentByMe;

    public ChatMessage() {
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public boolean isSentByMe() {
        return sentByMe;
    }

    public void setSentByMe(boolean sentByMe) {
        this.sentByMe = sentByMe;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ChatMessage) {
            ChatMessage chatMessage = (ChatMessage)obj;
            return this.sender.equals(chatMessage.getSender())
                    && this.msg.equals(chatMessage.getMsg())
                    && this.sentByMe == chatMessage.sentByMe;
        }

        return false;
    }
}
