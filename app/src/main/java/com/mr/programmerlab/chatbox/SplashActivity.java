package com.mr.programmerlab.chatbox;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
    public static int SPLASH_SCREEN_TIME_OUT=2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (!AppConfig.activity) {
                    Intent intent = new Intent();
                    intent.setClass(SplashActivity.this, StartupActivity.class);
                    startActivity(intent);
                    SplashActivity.this.finish();
                }
                if (AppConfig.activity) {

                    Intent intent = new Intent();
                    intent.setClass(SplashActivity.this, LoginActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        }, SPLASH_SCREEN_TIME_OUT);
//        Boolean isFirstRun = getSharedPreferences("PREFERENCE", MODE_PRIVATE)
//                .getBoolean("isFirstRun", true);
//
//        if (isFirstRun) {
//            //show start activity
//            new Handler().postDelayed(new Runnable() {
//                @Override
//                public void run() {
//                    Intent i=new Intent(SplashActivity.this,
//                            ChatActivity.class);
//                    //Intent is used to switch from one activity to another.
//
//                    startActivity(i);
//                    //invoke the SecondActivity.
//                    Toast.makeText(SplashActivity.this, "First Run", Toast.LENGTH_LONG)
//                            .show();
//                    finish();
//                    //the current activity will get finished.
//                }
//            }, SPLASH_SCREEN_TIME_OUT);
////            startActivity(new Intent(SplashActivity.this, StartupActivity.class));
//            getSharedPreferences("PREFERENCE", MODE_PRIVATE).edit()
//                    .putBoolean("isFirstRun", false).commit();
//        }
//
//
//
//        else{
//            new Handler().postDelayed(new Runnable() {
//                @Override
//                public void run() {
//                    Intent i=new Intent(SplashActivity.this,
//                            ChatActivity.class);
//                    //Intent is used to switch from one activity to another.
//
//                    startActivity(i);
//                    //invoke the SecondActivity.
//                    Toast.makeText(SplashActivity.this, "First Run", Toast.LENGTH_LONG)
//                            .show();
//                    finish();
//                    //the current activity will get finished.
//                }
//            }, SPLASH_SCREEN_TIME_OUT);
//        }
//
    }
}
