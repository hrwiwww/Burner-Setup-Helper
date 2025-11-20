package com.example.burnersetuphelper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DbOfInfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_db_of_info)

        val btnTohome: Button = findViewById(R.id.btn_to_home)
        val btnLoadData: Button = findViewById(R.id.btn_load_data)

        btnTohome.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        btnLoadData.setOnClickListener {
            ///val intent = Intent(this, Screen3Activity::class.java)
            ///startActivity(intent)

        }
    }
}