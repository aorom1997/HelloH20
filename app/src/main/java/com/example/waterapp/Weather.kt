package com.example.waterapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Weather : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weather)

        val buttonBack4= findViewById<ImageButton>(R.id.backBtn4)
        buttonBack4.setOnClickListener {
            val i = Intent( this , Home::class.java)
            startActivity(i);
        }
    }
}