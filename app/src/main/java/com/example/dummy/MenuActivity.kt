package com.example.dummy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val ledButton = findViewById<Button>(R.id.button)
        ledButton.setOnClickListener {
            val intent = Intent(this, LedActivity::class.java)
            startActivity(intent)
        }

        val sensorsButton = findViewById<Button>(R.id.button2)
        sensorsButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }



    }
}