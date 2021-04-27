package com.example.waterapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nameInput = findViewById<EditText>(R.id.nameInput)
        val ageInput = findViewById<EditText>(R.id.ageInput)
        val weightInput = findViewById<EditText>(R.id.weightInput)



        val buttonDailyProgress= findViewById<ImageButton>(R.id.StartButton)
        buttonDailyProgress.setOnClickListener {
            if (nameInput.text.toString() == ("") || ageInput.text.toString() == ("") || weightInput.text.toString() == ("")){
                Toast.makeText(this, "Please input correct data.", Toast.LENGTH_SHORT).show();
            }
            else {
                val name = nameInput.text.toString();
                val age = ageInput.text.toString();
                val weight = weightInput.text.toString();
                val intent = Intent(this, DailyProgress::class.java)
                intent.putExtra("name", name);
                intent.putExtra("age", age);
                intent.putExtra("weight", weight);

                startActivity(intent);
            }
        }
    }
}