package com.example.atyourservice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Sign_Up extends AppCompatActivity {
    ImageView imageView3;
    TextView header,welcome,name,user_name,spassword,email,number;
    Animation bottomanim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        imageView3=findViewById(R.id.imageView3);
        header=findViewById(R.id.header);
        welcome=findViewById(R.id.welcome);
        name=findViewById(R.id.name);
        user_name=findViewById(R.id.user_name);
        spassword=findViewById(R.id.user_name);
        email=findViewById(R.id.email);
        number=findViewById(R.id.number);
        bottomanim= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.bottom_animation);
        imageView3.setAnimation(bottomanim);
        header.setAnimation(bottomanim);
        welcome.setAnimation(bottomanim);
        name.setAnimation(bottomanim);
        user_name.setAnimation(bottomanim);
        spassword.setAnimation(bottomanim);
        email.setAnimation(bottomanim);
        number.setAnimation(bottomanim);
    }
}