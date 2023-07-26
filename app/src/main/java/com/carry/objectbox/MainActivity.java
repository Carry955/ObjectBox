package com.carry.objectbox;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import io.objectbox.Box;
import io.objectbox.BoxStore;

public class MainActivity extends AppCompatActivity {
    private String TAG = "ObjectBox application";

    private static BoxStore boxStore;
    private static Box<ChatSession> chatSessionBox;
    private static Box<ChatMsg> chatMsgBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // init
        boxStore = MyObjectBox.builder()
                .initialDbFile(() -> this.getResources().openRawResource(R.raw.data))
                .androidContext(this.getApplicationContext())
                .build();

        chatSessionBox = boxStore.boxFor(ChatSession.class);
        List<ChatSession> sessionList = chatSessionBox.getAll();
        Log.d(TAG, "session size: " + sessionList.size());

        chatMsgBox = boxStore.boxFor(ChatMsg.class);
        List<ChatMsg> msgList = chatMsgBox.getAll();
        Log.d(TAG, "msg size: " + msgList.size());
    }
}