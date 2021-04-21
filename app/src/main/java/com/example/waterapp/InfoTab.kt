package com.example.waterapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class InfoTab : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_tab)

        val buttonBack= findViewById<ImageButton>(R.id.BackBtn)
        buttonBack.setOnClickListener {
            val i = Intent( this , Home::class.java)
            startActivity(i);
        }

    }
}