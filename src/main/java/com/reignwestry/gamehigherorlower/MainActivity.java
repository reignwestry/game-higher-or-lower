package com.reignwestry.gamehigherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    // Initialized rNumber
    int rNumber;

    public void guess(View view) {
        //Logs button pressed
        Log.i("Info", "button pressed");
        Log.i("Info", "Random Number: " + Integer.toString(rNumber));



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Generate instance of Random Number object on Load
        Random rand = new Random();
        int rNumber = rand.nextInt(20) + 1;

        //Logs random number
//        System.out.println("Random Number is: " + rNumber);

    }
    

}