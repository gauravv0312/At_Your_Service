package com.example.atyourservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    TextView name,sologun;
    Animation topanim,bottomanim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        imageView=findViewById(R.id.imageView);
        name=findViewById(R.id.textView);
        sologun=findViewById(R.id.textView2);
//        Animation
        topanim= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.top_animation);
        bottomanim=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.bottom_animation);
        imageView.setAnimation(topanim);
        name.setAnimation(bottomanim);
        sologun.setAnimation(bottomanim);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(),Login.class));
                finish();
            }
        }, 5000);

    }
}