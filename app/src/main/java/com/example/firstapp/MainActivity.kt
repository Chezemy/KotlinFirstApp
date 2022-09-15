package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clickMeButton = findViewById<Button>(R.id.myButton)
        val myTextView = findViewById<TextView>(R.id.clickCountTextView)
        var countOfClicks: Int = 0

        clickMeButton.setOnClickListener {
            myTextView.text = "Clicked " + ++countOfClicks + " times"
        }


    }
}