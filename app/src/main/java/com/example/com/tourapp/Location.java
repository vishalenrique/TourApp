package com.example.com.tourapp;

/**
 * Created by Vishal Bhati on 2/21/2017.
 */

public class Location {
    private int rank;
    private String name;
    private String address;
    private int imageResource=-1;
    private int rating;

    public Location(int rank, String name, String address,int imageResource,int rating) {
        this.rank = rank;
        this.name = name;
        this.address = address;
        this.imageResource=imageResource;
        this.rating=rating;
    }
    public Location(int rank, String name, String address,int rating) {
        this.rank = rank;
        this.name = name;
        this.address = address;
        this.rating=rating;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public int getRank() {
        return rank;
    }

    public int getImageResource() {
        return imageResource;
    }

    public int getRating() {
        return rating;
    }

    public boolean hasImage(){
        return imageResource!=-1;
    }

    @Override
    public String toString() {
        return getName();
    }

}
