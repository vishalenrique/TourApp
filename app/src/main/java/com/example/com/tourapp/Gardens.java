package com.example.com.tourapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class Gardens extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gardens);
        final ArrayList<Location> Locations=new ArrayList<>();
        Locations.add(new Location(1,"Ramoji Film City","Anaspur Village",5));
        Locations.add(new Location(2,"Wonderla Amusement Park","Outer Ring Road, Exit No 13 | Ravirala Post",5));
        Locations.add(new Location(3,"Jalavihar","Necklace Road",5));
        Locations.add(new Location(4,"Snow World","Near Indira Park",4));
        Locations.add(new Location(5,"Ocean Park","Gandipet",4));
        Locations.add(new Location(6,"Mount Opera","Batasingaram",3));
        Locations.add(new Location(7,"Leo Splash","Leonia Holistic Destination, Bommaraspet, | Shameerpet",2));

        Spinner listView=(Spinner) findViewById(R.id.activity_gardens);

        ArrayAdapter<Location> arrayAdapter=new ArrayAdapter<Location>(Gardens.this,android.R.layout.simple_list_item_1,Locations);
        listView.setAdapter(arrayAdapter);

        //Spinner does not support oonItemClickEvents
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Location current=Locations.get(position);
//                ((TextView)findViewById(R.id.show_view)).setText(current.getName());
//            }
//        });
    }
}
