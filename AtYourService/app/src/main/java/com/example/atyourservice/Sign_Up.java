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

public class Sign_Up extends AppCompatActivity {
    ImageView imageView3;
    Button signup;
    TextView header,welcome,name,user_name,spassword,email,number;
    Animation bottomanim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_sign_up);
        imageView3=findViewById(R.id.imageView3);
        header=findViewById(R.id.header);
        welcome=findViewById(R.id.welcome);
        name=findViewById(R.id.name);
        user_name=findViewById(R.id.user_name);
        spassword=findViewById(R.id.user_name);
        email=findViewById(R.id.email);
        number=findViewById(R.id.number);
        signup=findViewById(R.id.signup);
        bottomanim= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.bottom_animation);
        imageView3.setAnimation(bottomanim);
        header.setAnimation(bottomanim);
        welcome.setAnimation(bottomanim);
        name.setAnimation(bottomanim);
        user_name.setAnimation(bottomanim);
        spassword.setAnimation(bottomanim);
        email.setAnimation(bottomanim);
        number.setAnimation(bottomanim);
        signup.setAnimation(bottomanim);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainActivity2.class));
            }
        });

    }
}