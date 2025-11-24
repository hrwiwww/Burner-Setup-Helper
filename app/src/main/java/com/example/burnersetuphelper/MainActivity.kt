package com.example.burnersetuphelper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnToPasportOfObject: Button = findViewById(R.id.btn_to_pasport_of_object)
        val btnToHistoryActivity: Button = findViewById(R.id.btn_to_history)
        val btnToDbOfInfo: Button = findViewById(R.id.btn_to_db_info)
        val btnToCalculer: Button = findViewById(R.id.btn_calculer)
        val btnGoToDots: Button = findViewById(R.id.btn_go_to_dots)

        btnToDbOfInfo.setOnClickListener {
            val intent = Intent(this, DbOfInfoActivity::class.java)
            startActivity(intent)
        }

        btnToCalculer.setOnClickListener {
            val intent = Intent(this, DbOfInfoActivity::class.java)
            startActivity(intent)
        }

        btnGoToDots.setOnClickListener {
            val intent = Intent(this, DbOfInfoActivity::class.java)
            startActivity(intent)
        }

        btnToPasportOfObject.setOnClickListener {
            val intent = Intent(this, PasportInputActivity::class.java)
            startActivity(intent)
        }

        btnToHistoryActivity.setOnClickListener {
            val intent = Intent(this, HistoryActivity::class.java)
            startActivity(intent)
        }
    }
}