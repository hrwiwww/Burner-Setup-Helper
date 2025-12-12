package com.example.burnersetuphelper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class DataResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_result)

        val btnToInitialInput: Button = findViewById(R.id.btn_to_input_data)
        val btnToInputWorkDots: Button = findViewById(R.id.btn_to_input_work_dots)
        val wNormalV: TextView = findViewById(R.id.vNormalV)
        val wWorkV: TextView = findViewById(R.id.vWorkV)
        val wTimeOfChange: TextView = findViewById(R.id.vTimeOfChange)
        val wRashod: TextView = findViewById(R.id.vRashod)
        val wPowerOfGas: TextView = findViewById(R.id.vPowerOfGas)
        val wKoef: TextView = findViewById(R.id.vKoef)
        val wPowerOfGasWithHeight: TextView = findViewById(R.id.vPowerOfGasWithHeight)
        val wProcentOfPower: TextView = findViewById(R.id.vProcentOfPower)
        val wGazaBaro: TextView = findViewById(R.id.vGazaBaro)
        val wPowerOfGasPart: TextView = findViewById(R.id.vPowerOfGasPart)
        val wPowerOfGasPartWithHeight: TextView = findViewById(R.id.vPowerOfGasPartWithHeight)
        val wWorkVPartPower: TextView = findViewById(R.id.vWorkVPartPower)
        val wTimeOfChangePartPower: TextView = findViewById(R.id.vTimeOfChangePartPower)
        val wRashodPartPower: TextView = findViewById(R.id.vRashodPartPower)

        wNormalV.setText(DataStorageSession.getData("NormalV").toString())
        wWorkV.setText(DataStorageSession.getData("WorkW").toString())
        wTimeOfChange.setText(DataStorageSession.getData("TimeOfChange").toString())
        wRashod.setText(DataStorageSession.getData("Rashod").toString())
        wPowerOfGas.setText(DataStorageSession.getData("PowerOfGas").toString())
        wKoef.setText(DataStorageSession.getData("Koef").toString())
        wPowerOfGasWithHeight.setText(DataStorageSession.getData("PowerOfGasWithHeight").toString())
        wProcentOfPower.setText(DataStorageSession.getData("ProcentOfPower").toString())
        wGazaBaro.setText(DataStorageSession.getData("GazaBaro").toString())
        wPowerOfGasPart.setText(DataStorageSession.getData("PowerOfGasPart").toString())
        wPowerOfGasPartWithHeight.setText(DataStorageSession.getData("PowerOfGasPartWithHeight").toString())
        wWorkVPartPower.setText(DataStorageSession.getData("WorkVPartPower").toString())
        wTimeOfChangePartPower.setText(DataStorageSession.getData("TimeOfChangePartPower").toString())
        wRashodPartPower.setText(DataStorageSession.getData("RashodPartPower").toString())

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