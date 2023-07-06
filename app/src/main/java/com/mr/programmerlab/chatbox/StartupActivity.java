package com.mr.programmerlab.chatbox;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class StartupActivity extends AppCompatActivity {

    public ImageView mImageView;
    public TextView mNameView;
    public TextView mAboutText;
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting);

        mImageView =  findViewById(R.id.imageView3);
        mNameView =  findViewById(R.id.textView5);
        mAboutText =  findViewById(R.id.textView7);
        mButton =  findViewById(R.id.startButton);


        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent load = new Intent(StartupActivity.this,LoginActivity.class);

                Pair[] pairs = new Pair[4];
                pairs[0] = new Pair<View, String>(mImageView, "imageTransition");
                pairs[1] = new Pair<View, String>(mNameView, "nameTransition");
                pairs[2] = new Pair<View, String>(mAboutText, "aboutTransition");
                pairs[3] = new Pair<View , String>(mButton, "buttonTransition");

                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(StartupActivity.this, pairs);

                startActivity(load, options.toBundle());
            }
        });

    }
}
