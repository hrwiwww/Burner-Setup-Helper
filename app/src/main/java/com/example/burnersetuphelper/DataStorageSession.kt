package com.example.burnersetuphelper

import android.util.Log

object DataStorageSession {

    private val dataBaz = mutableMapOf<String, Any>()

    fun saveData(key: String, value: Any) {
        Log.i("MYTEST", "$key = $value")
        dataBaz[key] = value
    }

    fun getData(key: String): Any? =
        dataBaz[key]

    fun clearData() {
        dataBaz.clear()
    }

    private fun getDouble(key: String): Double? {
        return when (val value = getData(key)) {
            is Number -> value.toDouble()
            is String -> value.toDoubleOrNull()
            else -> null
        }
    }

    private inline fun calcIfPossible(
        vararg values: Double?,
        block: () -> Double
    ): Double? {
        return if (values.all { it != null }) block() else null
    }

    fun doNumericMagic() {

        val h1 = getDouble("PowerOfBurner")
        val h2 = getDouble("KpdOfBurner")
        val h3 = getDouble("ResistanceOfBurner") // если понадобится
        val h5 = getDouble("HeathOfBurn")
        val h8 = getDouble("PressureOfGas")
        val h9 = getDouble("TemperatureOfGas")
        val h10 = getDouble("AltAboveSeaLevel")
        val h12 = getDouble("AirPressureAboveSeaLevel")
        val h15 = getDouble("PartLoad")

        val powerOfGas = calcIfPossible(h1, h2) {
            h1!! / (h2!! / 100)
        }

        val koef = calcIfPossible(h12, h8, h9) {
            ((h12!! + h8!!) / 1013) * (273 / (273 + h9!!))
        }

        val procentOfPower = calcIfPossible(h10) {
            h10!! / 100
        }

        val powerOfGasWithHeight = calcIfPossible(powerOfGas, procentOfPower) {
            (powerOfGas!! * procentOfPower!!) / (100 + powerOfGas)
        }

        val gazaBaro = calcIfPossible(h12, h8) {
            h12!! + h8!!
        }

        val powerOfGasPart = calcIfPossible(powerOfGas, h15) {
            powerOfGas!! * (h15!! / 100)
        }

        val powerOfGasPartWithHeight = calcIfPossible(powerOfGasPart, procentOfPower) {
            (powerOfGasPart!! * procentOfPower!!) / (100 + powerOfGasPart)
        }

        val normalV = calcIfPossible(h1, h2, h5) {
            h1!! / ((h2!! / 100) * h5!!)
        }

        val workV = calcIfPossible(normalV, koef) {
            normalV!! / koef!!
        }

        val timeOfChange = calcIfPossible(workV) {
            3600 / workV!!
        }

        val rashod = calcIfPossible(workV) {
            workV!! * 1000 / 60
        }

        val m5 = calcIfPossible(h1, h2, h5, h15) {
            (h1!! * (h15!! / 100)) / ((h2!! / 100) * h5!!)
        }

        val workVPartPower = calcIfPossible(m5, koef) {
            m5!! / koef!!
        }

        val timeOfChangePartPower = calcIfPossible(m5) {
            3600 / m5!!
        }

        val rashodPartPower = calcIfPossible(m5) {
            m5!! * 1000 / 60
        }

        powerOfGas?.let { saveData("PowerOfGas", it) }
        koef?.let { saveData("Koef", it) }
        procentOfPower?.let { saveData("ProcentOfPower", it) }
        powerOfGasWithHeight?.let { saveData("PowerOfGasWithHeight", it) }
        gazaBaro?.let { saveData("GazaBaro", it) }
        powerOfGasPart?.let { saveData("PowerOfGasPart", it) }
        powerOfGasPartWithHeight?.let { saveData("PowerOfGasPartWithHeight", it) }
        normalV?.let { saveData("NormalV", it) }
        workV?.let { saveData("WorkV", it) }
        timeOfChange?.let { saveData("TimeOfChange", it) }
        rashod?.let { saveData("Rashod", it) }
        workVPartPower?.let { saveData("WorkVPartPower", it) }
        timeOfChangePartPower?.let { saveData("TimeOfChangePartPower", it) }
        rashodPartPower?.let { saveData("RashodPartPower", it) }
    }
}