package com.example.marker.restauracje;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseHandler db = new DatabaseHandler(this);

        /**
         * CRUD Operations
         * */
        // Inserting Restaurants
        Log.d("Insert: ", "Inserting ..");
        db.addRestaurant(new Restaurant("Ravi", "9100000000"));
        db.addRestaurant(new Restaurant("Srinivas", "9199999999"));
        db.addRestaurant(new Restaurant("Tommy", "9522222222"));
        db.addRestaurant(new Restaurant("Karthik", "9533333333"));

        // Reading all restaurants
        Log.d("Reading: ", "Reading all restaurants..");
        List<Restaurant> restaurants = db.getAllRestaurants();

        for (Restaurant cn : restaurants) {
            String log = "Id: "+cn.getID()+" ,Name: " + cn.getName() + " ,Description: " + cn.getDescription();
            // Writing Restaurants to log
            Log.d("Name: ", log);
        }
    }
}
