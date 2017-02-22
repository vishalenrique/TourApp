package com.example.com.tourapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class AmusementParks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amusement_parks);
        ArrayList<Location> Locations=new ArrayList<>();
        Locations.add(new Location(1,"Ramoji Film City","Anaspur Village",R.drawable.ramoji,5));
        Locations.add(new Location(2,"Wonderla Amusement Park","Outer Ring Road, Exit No 13 | Ravirala Post",R.drawable.ramoji,5));
        Locations.add(new Location(3,"Jalavihar","Necklace Road",R.drawable.ramoji,5));
        Locations.add(new Location(4,"Snow World","Near Indira Park",R.drawable.ramoji,4));
        Locations.add(new Location(5,"Ocean Park","Gandipet",R.drawable.ramoji,4));
        Locations.add(new Location(6,"Mount Opera","Batasingaram",R.drawable.ramoji,3));
        Locations.add(new Location(7,"Leo Splash","Leonia Holistic Destination, Bommaraspet, | Shameerpet",R.drawable.ramoji,2));

        ListView listView=(ListView)findViewById(R.id.list_view);
//chang
        CustomAdapter arrayAdapter=new CustomAdapter(AmusementParks.this,Locations,R.color.amusement_parks);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                setContentView(R.layout.image_each);
                Location current= (Location) parent.getItemAtPosition(position);
                ((ImageView)findViewById(R.id.full_image)).setImageResource(R.drawable.rsz);

            }
        });
    }
}
