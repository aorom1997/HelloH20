package com.example.waterapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_daily_progress.*
import kotlinx.android.synthetic.main.activity_main.*

class DailyProgress : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daily_progress)
        

        val Name = NameView;
        val name: String = intent.getStringExtra("name");
        Name.text = "Hello $name!";

        val buttonNext= findViewById<ImageButton>(R.id.NextButton)
        buttonNext.setOnClickListener {
            //val city = cityInput.text.toString();
            //val state = stateInput.text.toString();

            val intent1 = Intent( this , Home::class.java)
            //intent1.putExtra("city", city);
            //intent1.putExtra("state", state);
            startActivity(intent1);

        }

    }
}