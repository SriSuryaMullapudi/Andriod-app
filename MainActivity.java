package com.example.grupee;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {

    ImageButton button,button2;
    ImageView image;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addListenerOnButton();

    }
    public void addListenerOnButton() {

        image = (ImageView) findViewById(R.id.image);


        button = (ImageButton) findViewById(R.id.dislike);
        button2 = (ImageButton) findViewById(R.id.like);
        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {


                image.setImageResource(R.drawable.cow);
            }

        });
        button2.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                image.setImageResource(R.drawable.dog2);
            }

        });

    }

}