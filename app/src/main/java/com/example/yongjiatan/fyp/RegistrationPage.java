package com.example.yongjiatan.fyp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class RegistrationPage extends AppCompatActivity {

    private EditText userid, password, cpassword, name, contactno, date, email;
    private Button submitBtn, backBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_page);
    }
    public void jumpToHome(View view){
        Intent goToHome = new Intent (Login.this,Homepage.class);
        startActivity(goToHome);

}