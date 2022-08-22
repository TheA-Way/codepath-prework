package com.example.hello_worldbytj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView


//this kotlin file is where we're going to be handling user interaction
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // show this layout file: activity_main
        setContentView(R.layout.activity_main)

        //Display customized to show 'Hello from {name}
        //user can tap a button to change the text colour of the label.
        //1. Add a button to our layout

        // Get a reference to a button
        //2. set up a logic to know when user has tapped on button
        findViewById<Button>(R.id.button).setOnClickListener {
            //handles button tap
            //2. change the colour of the text
            Log.i("Tejiri", "Tapped on button")

            // 1. Get a reference to the text view
            // 2. Set the color of the text view
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.bloodorange))

        }






    }
}

