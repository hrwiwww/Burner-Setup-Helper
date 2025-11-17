package com.example.burnersetuphelper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Screen4Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen4)

        val btnToInitialInput: Button = findViewById(R.id.btn_to_initial_input)
        val btnToResult: Button = findViewById(R.id.btn_to_result)

        btnToInitialInput.setOnClickListener {
            val intent = Intent(this, Screen3Activity::class.java)
            startActivity(intent)
        }

        btnToResult.setOnClickListener {
            val intent = Intent(this, Screen5Activity::class.java)
            startActivity(intent)
        }
    }
}