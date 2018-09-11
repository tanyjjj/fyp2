package com.example.yongjiatan.fyp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Reservation extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation);

            setContentView(R.layout.activity_reservation);
            final TextView parkingstructure = (TextView) findViewById(R.id.parkingstructure);
           parkingstructure.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    Intent parkingstructureIntent = new Intent(Reservation.this, ParkingStructure.class);
                    startActivity(parkingstructureIntent);

                }
            });
        }
    }
