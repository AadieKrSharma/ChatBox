package com.mr.programmerlab.chatbox;


import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputEditText;
import com.mr.programmerlab.chatbox.R.layout;


public class ChatActivity extends AppCompatActivity {
    public static LoginActivity la = new LoginActivity();
    public TextInputEditText terminal;
    public static String un = la.name;


    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(layout.activity_chat);
        btn = findViewById(R.id.sndButton);
        terminal = findViewById(R.id.terminaltext);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String host = "localhost";
                int port = la.portnum;
                new ChatClient(host,port);
            }
        });
    }
}