package com.example.com.tourapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class Religious extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_religious);
        ArrayList<Location> Locations=new ArrayList<>();
        Locations.add(new Location(1,"Ramoji Film City","Anaspur Village",5));
        Locations.add(new Location(2,"Wonderla Amusement Park","Outer Ring Road, Exit No 13 | Ravirala Post",5));
        Locations.add(new Location(3,"Jalavihar","Necklace Road",5));
        Locations.add(new Location(4,"Snow World","Near Indira Park",4));
        Locations.add(new Location(5,"Ocean Park","Gandipet",4));
        Locations.add(new Location(6,"Mount Opera","Batasingaram",3));
        Locations.add(new Location(7,"Leo Splash","Leonia Holistic Destination, Bommaraspet, | Shameerpet",2));

        GridView listView=(GridView) findViewById(R.id.activity_religious);

        CustomAdapter arrayAdapter=new CustomAdapter(Religious.this,Locations,R.color.religious_sites);
        listView.setAdapter(arrayAdapter);

    }
}
