package com.example.waterapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_daily_progress.*
import kotlinx.android.synthetic.main.activity_main.*

class DailyProgress : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daily_progress)


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