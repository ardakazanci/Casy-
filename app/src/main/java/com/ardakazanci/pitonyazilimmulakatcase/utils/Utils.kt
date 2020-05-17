package com.ardakazanci.pitonyazilimmulakatcase.utils

import java.text.SimpleDateFormat
import java.util.*

object Utils {


    fun laterDate(laterType: String): String {

        val calendar = Calendar.getInstance()

        if (laterType == "Month") {
            calendar.add(Calendar.MONTH, 1)
        } else if (laterType == "Week") {
            calendar.add(Calendar.DAY_OF_YEAR, 7)
        } else if (laterType == "Day") {
            calendar.add(Calendar.DAY_OF_YEAR, 1)
        } else {
            calendar.add(Calendar.DAY_OF_YEAR, 1)
        }

        val date = calendar.time
        val format = SimpleDateFormat("yyyy MM dd")
        val laterTime = format.format(date)
        return laterTime

    }

    fun nowDate(): String {
        val calendar = Calendar.getInstance()
        val date = calendar.time
        val format = SimpleDateFormat("yyyy MM dd")
        val nowDate = format.format(date)
        return nowDate
    }


}