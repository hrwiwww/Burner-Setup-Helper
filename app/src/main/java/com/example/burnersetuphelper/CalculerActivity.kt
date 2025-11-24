package com.example.burnersetuphelper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CalculerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculer)

        val btnTohome: Button = findViewById(R.id.btn_to_home)
        val btnResult: Button = findViewById(R.id.btn_result)

        btnTohome.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        btnResult.setOnClickListener {
            ///val intent = Intent(this, Screen3Activity::class.java)
            ///startActivity(intent)

        }
    }
}