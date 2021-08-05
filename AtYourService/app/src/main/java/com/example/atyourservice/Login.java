package com.example.atyourservice;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import org.jetbrains.annotations.NotNull;

public class Login extends AppCompatActivity {
    Button button;
    TextView email,password,newuser;
    FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);
        button=findViewById(R.id.login);
        email=findViewById(R.id.email);
        password=findViewById(R.id.password);
        newuser=findViewById(R.id.newuser);
        mAuth=FirebaseAuth.getInstance();
        newuser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Sign_Up.class));
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String eMail= email.getText().toString().trim();
                String Password= password.getText().toString();
                if (TextUtils.isEmpty(eMail))
                {
                    email.setError("Email is Required");
                }
                if (TextUtils.isEmpty(Password))
                {
                    password.setError("Password is Required");
                }
                mAuth.signInWithEmailAndPassword(eMail,Password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull @NotNull Task<AuthResult> task) {
                       if (task.isSuccessful())
                       {
                           startActivity(new Intent(getApplicationContext(),MainActivity2.class));
                       }
                       else {
                           Toast.makeText(Login.this, "Error !"+task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                       }
                    }
                });
            }
        });
    }
}