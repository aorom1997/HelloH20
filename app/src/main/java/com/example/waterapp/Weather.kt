package com.example.waterapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_daily_progress.*
import kotlinx.android.synthetic.main.activity_weather.*

class Weather : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weather)

        /*
              val cityView = NameView;
              val city= intent.getStringExtra("city");

              val cityView = ViewCity;
              val dataIntent = intent;
              val city: String = dataIntent.getStringExtra("city");

              cityView.text = "City: $city!";
        */
        
        val buttonBack4= findViewById<ImageButton>(R.id.backBtn4)
        buttonBack4.setOnClickListener {
            val i = Intent( this , Home::class.java)
            startActivity(i);
        }
    }
}