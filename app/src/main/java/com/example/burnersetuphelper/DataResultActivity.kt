package com.example.burnersetuphelper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

fun formatResult(value: Any?): String {
    return when (value) {
        null -> "Нет данных"
        is Double -> {
            if (value.isNaN() || value.isInfinite() || value == 0.0) {
                "Нет данных"
            } else {
                "%.2f".format(value)
            }
        }
        is Float -> {
            if (value.isNaN() || value.isInfinite() || value == 0.0f) {
                "Нет данных"
            } else {
                "%.2f".format(value)
            }
        }
        is String -> {
            when {
                value == "Нет данных" -> value
                value.isBlank() -> "Нет данных"
                value.toDoubleOrNull() == 0.0 -> "Нет данных"
                else -> value
            }
        }
        else -> {
            val str = value.toString()
            if (str == "0" || str == "0.0") "Нет данных" else str
        }
    }
}

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
        val wPowerOfGasPartWithHeight: TextView =
            findViewById(R.id.vPowerOfGasPartWithHeight)
        val wWorkVPartPower: TextView = findViewById(R.id.vWorkVPartPower)
        val wTimeOfChangePartPower: TextView =
            findViewById(R.id.vTimeOfChangePartPower)
        val wRashodPartPower: TextView =
            findViewById(R.id.vRashodPartPower)

        wNormalV.text =
            formatResult(DataStorageSession.getData("NormalV"))

        wWorkV.text =
            formatResult(DataStorageSession.getData("WorkV"))

        wTimeOfChange.text =
            formatResult(DataStorageSession.getData("TimeOfChange"))

        wRashod.text =
            formatResult(DataStorageSession.getData("Rashod"))

        wPowerOfGas.text =
            formatResult(DataStorageSession.getData("PowerOfGas"))

        wKoef.text =
            formatResult(DataStorageSession.getData("Koef"))

        wPowerOfGasWithHeight.text =
            formatResult(DataStorageSession.getData("PowerOfGasWithHeight"))

        wProcentOfPower.text =
            formatResult(DataStorageSession.getData("ProcentOfPower"))

        wGazaBaro.text =
            formatResult(DataStorageSession.getData("GazaBaro"))

        wPowerOfGasPart.text =
            formatResult(DataStorageSession.getData("PowerOfGasPart"))

        wPowerOfGasPartWithHeight.text =
            formatResult(DataStorageSession.getData("PowerOfGasPartWithHeight"))

        wWorkVPartPower.text =
            formatResult(DataStorageSession.getData("WorkVPartPower"))

        wTimeOfChangePartPower.text =
            formatResult(DataStorageSession.getData("TimeOfChangePartPower"))

        wRashodPartPower.text =
            formatResult(DataStorageSession.getData("RashodPartPower"))
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