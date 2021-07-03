package com.example.atyourservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Login extends AppCompatActivity {
    Button button;
    ImageView imageView2;
    Animation topanim;
    TextView textView4,textView5,username,password,forget,newuser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);
        button=findViewById(R.id.login);
        imageView2=findViewById(R.id.imageView2);
        textView4=findViewById(R.id.textView4);
        username=findViewById(R.id.username);
        textView5=findViewById(R.id.textView5);
        password=findViewById(R.id.password);
        forget=findViewById(R.id.forget);
        newuser=findViewById(R.id.newuser);

        newuser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Sign_Up.class));
            }
        });
        topanim= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.top_animation);
        button.setAnimation(topanim);
        imageView2.setAnimation(topanim);
        textView4.setAnimation(topanim);
        username.setAnimation(topanim);
        textView5.setAnimation(topanim);
        password.setAnimation(topanim);
        forget.setAnimation(topanim);
        newuser.setAnimation(topanim);


    }
}