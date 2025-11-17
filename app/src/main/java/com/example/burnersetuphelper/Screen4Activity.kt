package com.example.burnersetuphelper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Screen4Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen4)

        val btnToScreen2: Button = findViewById(R.id.btn_to_screen2)
        val btnToScreen5: Button = findViewById(R.id.btn_to_screen5)

        btnToScreen2.setOnClickListener {
            val intent = Intent(this, Screen2Activity::class.java)
            startActivity(intent)
        }

        btnToScreen5.setOnClickListener {
            val intent = Intent(this, Screen5Activity::class.java)
            startActivity(intent)
        }
    }
}