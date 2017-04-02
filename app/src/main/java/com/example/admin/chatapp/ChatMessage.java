package com.example.admin.chatapp;

import android.net.Uri;
import android.util.Log;
import android.widget.Toast;

import java.util.Date;

public class ChatMessage {

    private String messageText;
    private String messageUser;
    private long messageTime;
    private Uri messageUserPic;

    public ChatMessage(String messageText, String messageUser) {
        this.messageText = messageText;
        this.messageUser = messageUser;

        // Initialize to current time
        messageTime = new Date().getTime();
    }

    public ChatMessage(String messageText, String messageUser, Uri messageUserPic) {
        this.messageText = messageText;
        this.messageUser = messageUser;
        this.messageUserPic = messageUserPic;

        // Initialize to current time
        messageTime = new Date().getTime();
    }

    public ChatMessage(){

    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public String getMessageUser() {
        return messageUser;
    }

    public void setMessageUser(String messageUser) {
        this.messageUser = messageUser;
    }

    public long getMessageTime() {
        return messageTime;
    }

    public void setMessageTime(long messageTime) {
        this.messageTime = messageTime;
    }

    public Uri getMessageUserPic() { return messageUserPic; }
}