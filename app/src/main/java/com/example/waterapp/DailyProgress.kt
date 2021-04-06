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

        val buttonInfo= findViewById<ImageButton>(R.id.InfoButton)
        buttonInfo.setOnClickListener {
            val i = Intent( this , InfoTab::class.java)
            startActivity(i);
        }
        val buttonSettings= findViewById<ImageButton>(R.id.SettingButton)
        buttonSettings.setOnClickListener {
            val i = Intent( this , AppSetting::class.java)
            startActivity(i);
        }

        val Name = NameView;
        val Age = AgeView;
        val Weight = WeightView;

        val name: String = intent.getStringExtra("name");
        val age: String = intent.getStringExtra("age");
        val weight: String = intent.getStringExtra("weight");

        Name.text = "Hello $name!";
        Age.text = age;
        Weight.text = weight;
    }
}