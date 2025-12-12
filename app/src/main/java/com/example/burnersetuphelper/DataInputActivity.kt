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

        val btnToPasportOfObject: Button = findViewById(R.id.btn_to_pasport_of_object)
        val btnToResultData: Button = findViewById(R.id.btn_to_result_data)
        val ePowerOfBurner: EditText = findViewById(R.id.edPowerOfBurner)
        val eKpdOfBurner: EditText = findViewById(R.id.edKpdOfBurner)
        val eResistanceOfBurner: EditText = findViewById(R.id.edResistanceOfBurner)
        val eHeathOfBurn: EditText = findViewById(R.id.edHeathOfBurn)
        val ePressureOfGas: EditText = findViewById(R.id.edPressureOfGas)
        val eTemperatureOfGas: EditText = findViewById(R.id.edTemperatureOfGas)
        val eAltAboveSeaLevel: EditText = findViewById(R.id.edAltAboveSeaLevel)
        val eAirPressureAboveSeaLevel: EditText = findViewById(R.id.edAirPressureAboveSeaLevel)
        val ePartLoad: EditText = findViewById(R.id.edPartLoad)


        btnToPasportOfObject.setOnClickListener {
            val intent = Intent(this, PasportInputActivity::class.java)
            startActivity(intent)
        }

        btnToResultData.setOnClickListener {
  //          var nPowerOfGas = (ePowerOfBurner.getText() / (eKpdOfBurner.getText()))
            DataStorageSession.saveData("PowerOfBurner", ePowerOfBurner.getText().toString())
            DataStorageSession.saveData("KpdOfBurner", eKpdOfBurner.getText().toString())
            DataStorageSession.saveData("ResistanceOfBurner", eResistanceOfBurner.getText().toString())
            DataStorageSession.saveData("HeathOfBurn", eHeathOfBurn.getText().toString())
            DataStorageSession.saveData("PressureOfGas", ePressureOfGas.getText().toString())
            DataStorageSession.saveData("TemperatureOfGas", eTemperatureOfGas.getText().toString())
            DataStorageSession.saveData("AltAboveSeaLevel", eAltAboveSeaLevel.getText().toString())
            DataStorageSession.saveData("AirPressureAboveSeaLevel", eAirPressureAboveSeaLevel.getText().toString())
            DataStorageSession.saveData("PartLoad", ePartLoad.getText().toString())
            DataStorageSession.doNumericMagic()
            val intent = Intent(this, DataResultActivity::class.java)
            startActivity(intent)
        }
    }
}