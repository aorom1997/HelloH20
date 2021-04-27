package com.example.waterapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import kotlinx.android.synthetic.main.activity_home.*

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val buttonInfo= findViewById<ImageButton>(R.id.infoButton)
        buttonInfo.setOnClickListener {
            val i = Intent( this , InfoTab::class.java)
            startActivity(i);
        }

        val buttonSettings= findViewById<ImageButton>(R.id.settingButton)
        buttonSettings.setOnClickListener {
            val i = Intent( this , AppSetting::class.java)
            startActivity(i);
        }

        val buttonWorkOut= findViewById<Button>(R.id.workout)
        buttonWorkOut.setOnClickListener {
            val i = Intent( this , Workout::class.java)
            startActivity(i);
        }

        val buttonWeather= findViewById<Button>(R.id.weatherbtn)
        buttonWeather.setOnClickListener {
            val i = Intent( this , Weather::class.java)
            startActivity(i);
        }

        var counter = 0;
        val buttonPitcher= findViewById<Button>(R.id.button_pitcher)
        buttonPitcher.setOnClickListener {
            counter++;
            when (counter){
                1 -> buttonPitcher.setBackgroundResource(R.drawable.cp1);
                2 -> buttonPitcher.setBackgroundResource(R.drawable.cp2);
                3 -> buttonPitcher.setBackgroundResource(R.drawable.cp3);
                4 -> buttonPitcher.setBackgroundResource(R.drawable.cp4);
                5 -> buttonPitcher.setBackgroundResource(R.drawable.cp5);
                6 -> buttonPitcher.setBackgroundResource(R.drawable.cp6);
                7 -> buttonPitcher.setBackgroundResource(R.drawable.cp7);
            }

        }

    }
}