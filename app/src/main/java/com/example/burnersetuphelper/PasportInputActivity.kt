package com.example.burnersetuphelper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class PasportInputActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pasport_input)

        val btnToHome: Button = findViewById(R.id.btn_to_home)
        val btnToInputData: Button = findViewById(R.id.btn_to_input_data)

        val fields = mapOf(
            "WorkerName" to findViewById<EditText>(R.id.edWorkerName),
            "Date" to findViewById(R.id.edDate),
            "ObjName" to findViewById(R.id.edObjName),
            "ObjNumber" to findViewById(R.id.edObjNumber),
            "TypeCompetition" to findViewById(R.id.edTypeCompetition),
            "YearMade" to findViewById(R.id.edYearMade),
            "Type" to findViewById(R.id.edType),
            "GenNumber" to findViewById(R.id.edGenNumber),
            "MadedBy" to findViewById(R.id.edMadedBy),
            "CodeName" to findViewById(R.id.edCodeName),
            "GenYearOfMade" to findViewById(R.id.edGenYearOfMade),
            "GenPower" to findViewById(R.id.edGenPower),
            "DiamertBurn" to findViewById(R.id.edDiamertBurn),
            "LenBurn" to findViewById(R.id.edLenBurn),
            "TypeBurn" to findViewById(R.id.edTypeBurn),
            "LgwType" to findViewById(R.id.edLgwType),
            "LgwValue" to findViewById(R.id.edLgwValue),
            "GasMinType" to findViewById(R.id.edGasMinType),
            "GasMinValue" to findViewById(R.id.edGasMinValue),
            "GasMaxType" to findViewById(R.id.edGasMaxType),
            "GasMaxValue" to findViewById(R.id.edGasMaxValue),
            "ContrGermType" to findViewById(R.id.edContrGermType),
            "ContrGermValue" to findViewById(R.id.edContrGermValue),
            "PskType" to findViewById(R.id.edPskType),
            "PskValue" to findViewById(R.id.edPskValue),
            "PzkType" to findViewById(R.id.edPzkType),
            "PzkValue" to findViewById(R.id.edPzkValue),
            "ControlGermArm" to findViewById(R.id.edControlGermArm)
        )

        btnToHome.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        btnToInputData.setOnClickListener {

            fields.forEach { (key, editText) ->
                saveIfNotBlank(key, editText)
            }

            startActivity(Intent(this, DataInputActivity::class.java))
        }
    }

    private fun saveIfNotBlank(key: String, editText: EditText) {
        val value = editText.text.toString().trim()
        if (value.isNotEmpty()) {
            DataStorageSession.saveData(key, value)
        }
    }
}