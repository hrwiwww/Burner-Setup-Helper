package com.example.burnersetuphelper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DataInputActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_input)

        val btnToPasportOfObject: Button = findViewById(R.id.btn_to_pasport_of_object)
        val btnToResultData: Button = findViewById(R.id.btn_to_result_data)

        btnToPasportOfObject.setOnClickListener {
            val intent = Intent(this, PasportInputActivity::class.java)
            startActivity(intent)
        }

        btnToResultData.setOnClickListener {
            val intent = Intent(this, DataResultActivity::class.java)
            startActivity(intent)
        }
    }
}