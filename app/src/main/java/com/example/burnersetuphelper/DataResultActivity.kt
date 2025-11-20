package com.example.burnersetuphelper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DataResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_result)

        val btnToInitialInput: Button = findViewById(R.id.btn_to_input_data)
        val btnToInputWorkDots: Button = findViewById(R.id.btn_to_input_work_dots)

        btnToInitialInput.setOnClickListener {
            val intent = Intent(this, DataInputActivity::class.java)
            startActivity(intent)
        }

        btnToInputWorkDots.setOnClickListener {
            val intent = Intent(this, DotsRequestActivity::class.java)
            startActivity(intent)
        }
    }
}