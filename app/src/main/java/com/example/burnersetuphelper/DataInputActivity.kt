package com.example.burnersetuphelper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class DataInputActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_input)

        val btnToPasportOfObject: Button =
            findViewById(R.id.btn_to_pasport_of_object)

        val btnToResultData: Button =
            findViewById(R.id.btn_to_result_data)

        val fields = mapOf(
            "PowerOfBurner" to findViewById<EditText>(R.id.edPowerOfBurner),
            "KpdOfBurner" to findViewById(R.id.edKpdOfBurner),
            "ResistanceOfBurner" to findViewById(R.id.edResistanceOfBurner),
            "HeathOfBurn" to findViewById(R.id.edHeathOfBurn),
            "PressureOfGas" to findViewById(R.id.edPressureOfGas),
            "TemperatureOfGas" to findViewById(R.id.edTemperatureOfGas),
            "AltAboveSeaLevel" to findViewById(R.id.edAltAboveSeaLevel),
            "AirPressureAboveSeaLevel" to findViewById(R.id.edAirPressureAboveSeaLevel),
            "PartLoad" to findViewById(R.id.edPartLoad)
        )

        btnToPasportOfObject.setOnClickListener {
            startActivity(Intent(this, PasportInputActivity::class.java))
        }

        btnToResultData.setOnClickListener {

            fields.forEach { (key, editText) ->
                saveIfNotBlank(key, editText)
            }

            DataStorageSession.doNumericMagic()

            startActivity(Intent(this, DataResultActivity::class.java))
        }
    }
    private fun saveIfNotBlank(key: String, editText: EditText) {
        val value = editText.text.toString().trim()
        if (value.isNotEmpty()) {
            DataStorageSession.saveData(key, value)
        }
    }
}
