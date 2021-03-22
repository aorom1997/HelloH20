package com.example.waterapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonDailyProgress= findViewById<ImageButton>(R.id.StartButton)
        buttonDailyProgress.setOnClickListener {
            val intent = Intent( this , DailyProgress::class.java)
            startActivity(intent);
        }
    }
}