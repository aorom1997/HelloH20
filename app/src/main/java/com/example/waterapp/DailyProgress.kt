package com.example.waterapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import kotlinx.android.synthetic.main.activity_daily_progress.*
import kotlinx.android.synthetic.main.activity_main.*

class DailyProgress : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daily_progress)

        val Name = NameView;
        val name: String = intent.getStringExtra("name");

        val cityInput = findViewById<EditText>(R.id.cityInput)
        val stateInput = findViewById<EditText>(R.id.stateInput)

        val i2 = Intent( this , Weather::class.java)


        Name.text = "Hello $name!";

        val buttonNext= findViewById<ImageButton>(R.id.NextButton)
        buttonNext.setOnClickListener {
            if (cityInput.text.toString() == ("") || stateInput.text.toString() == ("")){
                Toast.makeText(this, "Please input City or State.", Toast.LENGTH_SHORT).show();
            }
            else{
                val city = cityInput.text.toString();
                val state = stateInput.text.toString();

                val i2 = Intent( this , Weather::class.java)
                i2.putExtra("city", city);
                i2.putExtra("state", state);
                startActivityForResult(i2,1);

                val intent1 = Intent( this , Home::class.java)
                startActivity(intent1);
            }

        }
    }
}