package com.example.yongjiatan.fyp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        final TextView reservehomepage = (TextView) findViewById(R.id.reservehomepage);
        reservehomepage.setOnClickListener(new View.OnClickListener() {
@Override
            public void onClick(View view) {
                Intent reservehomepageIntent = new Intent(Homepage.this, Reservation.class);
                startActivity(reservehomepageIntent);
            }
        } );
    }
}