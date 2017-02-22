package com.example.com.tourapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by Vishal Bhati on 2/21/2017.
 */

public class CustomAdapter extends ArrayAdapter<Location> {
    int color;
    public CustomAdapter(Context context, List<Location> objects,int color) {
        super(context, 0, objects);
        this.color=color;
    }
    public CustomAdapter(Context context, List<Location> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View eachItemView= convertView;
        if(eachItemView==null)
        {
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            eachItemView = inflater.inflate(R.layout.each_item_view, null);
        }
        Location current=getItem(position);

        TextView textView=(TextView)eachItemView.findViewById(R.id.numbers);
        textView.setText(String.valueOf(current.getRank()));

        TextView textView1=(TextView)eachItemView.findViewById(R.id.location_name);
        textView1.setText(current.getName());

        TextView textView2=(TextView)eachItemView.findViewById(R.id.location_address);
        textView2.setText(current.getAddress());
        RatingBar ratingBar= (RatingBar) eachItemView.findViewById(R.id.rating_bar);
        ratingBar.setNumStars(current.getRating());
       // toColor.setBackgroundColor(ContextCompat.getColor(getContext(),mColorResourceId));
        textView.setBackgroundColor(ContextCompat.getColor(getContext(),color));
        textView1.setBackgroundColor(ContextCompat.getColor(getContext(),color));
        textView2.setBackgroundColor(ContextCompat.getColor(getContext(),color));
        ratingBar.setBackgroundColor(ContextCompat.getColor(getContext(),color));


        ImageView imageView= (ImageView) eachItemView.findViewById(R.id.image_id);
        if(current.hasImage())
        {
            imageView.setImageResource(current.getImageResource());
            imageView.setVisibility(View.VISIBLE);
        }else
        {
            imageView.setVisibility(View.GONE);
        }
        return eachItemView;
    }
}
