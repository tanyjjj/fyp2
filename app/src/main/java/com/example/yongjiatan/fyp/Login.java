package com.example.yongjiatan.fyp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void jumpToHome(View view){
        Intent goToHome = new Intent (Login.this,Homepage.class);
        startActivity(goToHome);
    }
    public void jumpToRegistration(View view){
        Intent goToRegistration = new Intent (Login.this,RegistrationPage.class);
        startActivity(goToRegistration);
    }
}
