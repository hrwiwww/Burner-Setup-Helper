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

        val btnTohome: Button = findViewById(R.id.btn_to_home)
        val btnToInputData: Button = findViewById(R.id.btn_to_input_data)
        val eWorkerName: EditText = findViewById(R.id.edWorkerName)
        val eDate : EditText = findViewById(R.id.edDate)
        val eObjName : EditText = findViewById(R.id.edObjName)
        val eObjNumber : EditText = findViewById(R.id.edObjNumber)
        val eTypeCompetition : EditText = findViewById(R.id.edTypeCompetition)
        val eYearMade : EditText = findViewById(R.id.edYearMade)
        val eType : EditText = findViewById(R.id.edType)
        val eGenNumber : EditText = findViewById(R.id.edGenNumber)
        val eMadedBy : EditText = findViewById(R.id.edMadedBy)
        val eCodeName : EditText = findViewById(R.id.edCodeName)
        val eGenYearOfMade : EditText = findViewById(R.id.edGenYearOfMade)
        val eGenPower : EditText = findViewById(R.id.edGenPower)
        val eDiamertBurn : EditText = findViewById(R.id.edDiamertBurn)
        val eLenBurn : EditText = findViewById(R.id.edLenBurn)
        val eTypeBurn : EditText = findViewById(R.id.edTypeBurn)
        val eLgwType : EditText = findViewById(R.id.edLgwType)
        val eLgwValue : EditText = findViewById(R.id.edLgwValue)
        val eGasMinType : EditText = findViewById(R.id.edGasMinType)
        val eGasMinValue : EditText = findViewById(R.id.edGasMinValue)
        val eGasMaxType : EditText = findViewById(R.id.edGasMaxType)
        val eGasMaxValue : EditText = findViewById(R.id.edGasMaxValue)
        val eContrGermType : EditText = findViewById(R.id.edContrGermType)
        val eContrGermValue : EditText = findViewById(R.id.edContrGermValue)
        val ePskType : EditText = findViewById(R.id.edPskType)
        val ePskValue : EditText = findViewById(R.id.edPskValue)
        val ePzkType : EditText = findViewById(R.id.edPzkType)
        val ePzkValue : EditText = findViewById(R.id.edPzkValue)
        val eControlGermArm : EditText = findViewById(R.id.edControlGermArm)

        btnTohome.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        btnToInputData.setOnClickListener {
            DataStorageSession.saveData("WorkerName", eWorkerName.getText().toString())
            DataStorageSession.saveData("Date", eDate.getText().toString())
            DataStorageSession.saveData("ObjName", eObjName.getText().toString())
            DataStorageSession.saveData("ObjNumber", eObjNumber.getText().toString())
            DataStorageSession.saveData("TypeCompetition", eTypeCompetition.getText().toString())
            DataStorageSession.saveData("YearMade", eYearMade.getText().toString())
            DataStorageSession.saveData("Type", eType.getText().toString())
            DataStorageSession.saveData("GenNumber", eGenNumber.getText().toString())
            DataStorageSession.saveData("MadedBy", eMadedBy.getText().toString())
            DataStorageSession.saveData("CodeName", eCodeName.getText().toString())
            DataStorageSession.saveData("GenYearOfMade", eGenYearOfMade.getText().toString())
            DataStorageSession.saveData("GenPower", eGenPower.getText().toString())
            DataStorageSession.saveData("DiamertBurn", eDiamertBurn.getText().toString())
            DataStorageSession.saveData("LenBurn", eLenBurn.getText().toString())
            DataStorageSession.saveData("TypeBurn", eTypeBurn.getText().toString())
            DataStorageSession.saveData("LgwType", eLgwType.getText().toString())
            DataStorageSession.saveData("LgwValue", eLgwValue.getText().toString())
            DataStorageSession.saveData("GasMinType", eGasMinType.getText().toString())
            DataStorageSession.saveData("GasMinValue", eGasMinValue.getText().toString())
            DataStorageSession.saveData("GasMaxType", eGasMaxType.getText().toString())
            DataStorageSession.saveData("GasMaxValue", eGasMaxValue.getText().toString())
            DataStorageSession.saveData("ContrGermType", eContrGermType.getText().toString())
            DataStorageSession.saveData("ContrGermValue", eContrGermValue.getText().toString())
            DataStorageSession.saveData("PskType", ePskType.getText().toString())
            DataStorageSession.saveData("PskValue", ePskValue.getText().toString())
            DataStorageSession.saveData("PzkType", ePzkType.getText().toString())
            DataStorageSession.saveData("PzkValue", ePzkValue.getText().toString())
            DataStorageSession.saveData("ControlGermArm", eControlGermArm.getText().toString())

            val intent = Intent(this, DataInputActivity::class.java)
            startActivity(intent)
        }
    }
}