package com.example.burnersetuphelper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Screen5Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen5)

        val btnToResultData: Button = findViewById(R.id.btn_to_result_data)
        val btnToEndAndSave: Button = findViewById(R.id.btn_to_end_and_save)

        btnToResultData.setOnClickListener {
            val intent = Intent(this, Screen4Activity::class.java)
            startActivity(intent)
        }

        btnToEndAndSave.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}