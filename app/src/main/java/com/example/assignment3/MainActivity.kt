package com.example.assignment3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button //button widget import
import android.widget.TextView
import android.widget.Toast //toast widget import


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btn_click_me = findViewById(R.id.button) as Button   // getting reference to button
        var myTextView = findViewById(R.id.textView) as TextView // getting reference to textview
        var timesClicked = 0 // Counts from 0 to ++

        // set on-click listener
        btn_click_me.setOnClickListener {

            timesClicked = timesClicked + 1 // It sum up with one when you click the button
            myTextView.text = timesClicked.toString() // Shows the text on the screen as string
            Toast.makeText(this@MainActivity, "You clicked the button!.", Toast.LENGTH_SHORT).show() // That text is what you see below the screen
        }

    }
}