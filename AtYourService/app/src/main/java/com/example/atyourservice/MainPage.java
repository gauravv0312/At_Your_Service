package com.example.atyourservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;

public class MainPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
    }
    public void logout(View view)
    {
        FirebaseAuth.getInstance().signOut(); // logout
        startActivity(new Intent(getApplicationContext(),Login.class));
    }
}