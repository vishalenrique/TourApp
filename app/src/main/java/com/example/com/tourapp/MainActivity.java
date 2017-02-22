package com.example.com.tourapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView mustVisitTextView=(TextView)findViewById(R.id.must_visit);
        mustVisitTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,MustVisit.class);
                startActivity(i);

            }
        });
        TextView amusementParksTextView=(TextView)findViewById(R.id.amusement_park);
        amusementParksTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,AmusementParks.class);
                startActivity(i);
            }
        });
        TextView religiousSitesTextView =(TextView)findViewById(R.id.religious_sites);
        religiousSitesTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Religious.class);
                startActivity(i);

            }
        });
        TextView gardensTextView =(TextView)findViewById(R.id.gardens);
        gardensTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Gardens.class);
                startActivity(i);
            }
        });
        TextView lakesTextView=(TextView)findViewById(R.id.lakes);
        lakesTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
