package com.example.burnersetuphelper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ///val btnToScreen2: Button = findViewById(R.id.btn_to_screen2)
        val btnToInitialSetup: Button = findViewById(R.id.btn_to_initial_setup)
        val btnToScreen3: Button = findViewById(R.id.btn_to_screen3)

        ///btnToScreen2.setOnClickListener {
        ///    val intent = Intent(this, Screen2Activity::class.java)
        ///    startActivity(intent)
        ///}

        btnToInitialSetup.setOnClickListener {
            val intent = Intent(this, Screen2Activity::class.java)
            startActivity(intent)
        }

        btnToScreen3.setOnClickListener {
            val intent = Intent(this, Screen3Activity::class.java)
            startActivity(intent)
        }
    }
}