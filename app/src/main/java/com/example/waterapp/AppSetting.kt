package com.example.waterapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class AppSetting : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app_setting)

        val buttonBack1= findViewById<ImageButton>(R.id.imageButton)
        buttonBack1.setOnClickListener {
            val i = Intent( this , DailyProgress::class.java)
            startActivity(i);

        }


        
    }
}