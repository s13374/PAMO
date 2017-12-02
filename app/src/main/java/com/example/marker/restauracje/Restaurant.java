package com.example.marker.restauracje;

/**
 * Created by Marker on 02.12.2017.
 */

public class Restaurant {
    //private variables
    int _id;
    String _name;
    String _description;


    public Restaurant(){}

    public Restaurant(int id, String name, String description){
        this._id = id;
        this._name = name;
        this._description = description;
    }

    public Restaurant(String name, String description){
        this._name = name;
        this._description = description;
    }

    public int getID(){
        return this._id;
    }

    public void setID(int id){
        this._id = id;
    }

    public String getName(){
        return this._name;
    }

    public void setName(String name){
        this._name = name;
    }

    public String getDescription(){
        return this._description;
    }

    public void setDescription(String description){ this._description = description; }
}
