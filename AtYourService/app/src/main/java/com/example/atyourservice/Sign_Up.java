package com.example.atyourservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Sign_Up extends AppCompatActivity {
    ImageView imageView3;
    Button signup;
    TextView name,address,spassword,email,number;
    FirebaseAuth mUth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_sign_up);
        name=findViewById(R.id.name);
        address=findViewById(R.id.address);
        spassword=findViewById(R.id.password);
        email=findViewById(R.id.email);
        number=findViewById(R.id.number);
        signup=findViewById(R.id.signup);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Hello There!", Toast.LENGTH_SHORT).show();
                userregister(email.getText().toString(),number.getText().toString(),spassword.getText().toString());

            }
        });

    }

    public void userregister(String email,  String password,String mobile) {
        String name = "not applicable";
        String address = "not applicable";

        Call<signup_response_model> call = apicontroller.getInstance()
                .getapi()
                .getregister(name, email, password, mobile, address);

        call.enqueue(new Callback<signup_response_model>() {
            @Override
            public void onResponse(Call<signup_response_model> call, Response<signup_response_model> response) {
                signup_response_model obj = response.body();
                String result = obj.getMessage().trim();
                if (result.equals("inserted")) {
                     startActivity(new Intent(getApplicationContext(),MainActivity2.class));
                }
                if (result.equals("exist")) {
                    Toast.makeText(getApplicationContext(), "Account is already exist", Toast.LENGTH_SHORT).show();
                }

            }

            @Override
            public void onFailure(Call<signup_response_model> call, Throwable t) {
                Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
