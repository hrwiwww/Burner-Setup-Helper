package com.example.burnersetuphelper

import android.util.Log

object DataStorageSession {
    private val dataBaz = mutableMapOf<String, Any>()

    fun saveData(key: String, value: Any) {
        Log.i("MYTEST", value.toString())
        dataBaz[key] = value
    }

    fun getData(key: String): Any? {
        return dataBaz[key]
    }

    fun clearData() {
        dataBaz.clear()
    }

    fun doNumericMagic() {
        val h1 = getData("PowerOfBurner").toString().toDouble()
        val h2 = getData("KpdOfBurner").toString().toDouble()
        val h3 = getData("ResistanceOfBurner").toString().toDouble()
        val h5 = getData("HeathOfBurn").toString().toDouble()
        val h8 = getData("PressureOfGas").toString().toDouble()
        val h9 = getData("TemperatureOfGas").toString().toDouble()
        val h10 = getData("AltAboveSeaLevel").toString().toDouble()
        val h12 = getData("AirPressureAboveSeaLevel").toString().toDouble()
        val h15 = getData("PartLoad").toString().toDouble()

        var powerOfGas = h1 / (h2 / 100) //h4
        var koef = ((h12 + h8) / 1013) * (273 / (273 + h9)) //h6
        var procentOfPower = h10 / 100 //h11
        var powerOfGasWithHeight = (powerOfGas * procentOfPower) / (100 + powerOfGas) //h7
        var gazaBaro = h12 + h8 //h13
        var powerOfGasPart = powerOfGas * (h15 / 100) //h16
        var powerOfGasPartWithHeight = (powerOfGasPart * procentOfPower) / (100 + powerOfGasPart)
        var normalV = h1 / ((h2 / 100) * h5) //c1
        var workV = normalV / koef //c4
        var timeOfChange = 3600 / workV //c7
        var rashod = workV * 1000 / 60
        var m5 = (h1 * (h15 / 100)) / ((h2 / 100) * h5)
        var workVPartPower = m5 / koef
        var timeOfChangePartPower = 3600 / m5
        var rashodPartPower = m5 * 1000 / 60

        saveData("PowerOfGas", powerOfGas)
        saveData("Koef", koef)
        saveData("ProcentOfPower", procentOfPower)
        saveData("PowerOfGasWithHeight", powerOfGasWithHeight)
        saveData("GazaBaro", gazaBaro)
        saveData("PowerOfGasPart", powerOfGasPart)
        saveData("PowerOfGasPartWithHeight", powerOfGasPartWithHeight)
        saveData("NormalV", normalV)
        saveData("WorkV", workV)
        saveData("TimeOfChange", timeOfChange)
        saveData("Rashod", rashod)
        saveData("WorkVPartPower", workVPartPower)
        saveData("TimeOfChangePartPower", timeOfChangePartPower)
        saveData("RashodPartPower", rashodPartPower)

    }
}