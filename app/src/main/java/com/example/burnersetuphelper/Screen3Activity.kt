package com.example.burnersetuphelper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Screen3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen3)

        val btnToScreen1: Button = findViewById(R.id.btn_to_screen1)
        val btnToScreen5: Button = findViewById(R.id.btn_to_screen5)

        btnToScreen1.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        btnToScreen5.setOnClickListener {
            val intent = Intent(this, Screen5Activity::class.java)
            startActivity(intent)
        }
    }
}