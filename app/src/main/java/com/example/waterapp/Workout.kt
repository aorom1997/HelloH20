package com.example.waterapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Workout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_workout)

        val buttonBack3= findViewById<ImageButton>(R.id.backBtn3)
        buttonBack3.setOnClickListener {
            val i = Intent( this , Home::class.java)
            startActivity(i);
        }

        val buttonNext= findViewById<ImageButton>(R.id.button10)
        buttonNext.setOnClickListener {
            //val Time = time.text.toString();

            val intent2 = Intent( this , Home::class.java)
            //intent2.putExtra("time", time);
            startActivity(intent2);

        }
    }
}