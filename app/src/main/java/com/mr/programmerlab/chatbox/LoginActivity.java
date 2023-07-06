package com.mr.programmerlab.chatbox;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity{
    public Button btn2 ;
    public EditText uname;
    public EditText pnum;
    public static int portnum;
    public static String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btn2 = findViewById(R.id.lgnbutton);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chat = new Intent(LoginActivity.this,ChatActivity.class);
                uname = findViewById(R.id.username);
                pnum = findViewById(R.id.portnum);
                name = uname.getText().toString();
                String pnumt = pnum.getText().toString();
                portnum = Integer.parseInt(pnumt);
                startActivity(chat);
            }
        });
    }
}
