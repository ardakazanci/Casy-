package com.ardakazanci.pitonyazilimmulakatcase.ui.input

import android.content.Context
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ardakazanci.pitonyazilimmulakatcase.R
import com.ardakazanci.pitonyazilimmulakatcase.data.model.Task
import com.ardakazanci.pitonyazilimmulakatcase.data.repository.MainRepository
import com.ardakazanci.pitonyazilimmulakatcase.utils.Utils
import kotlinx.coroutines.launch


class InputViewModel(var repository: MainRepository) : ViewModel() {

    init {
        Log.i("Info", "Input View Module Initialize")
    }


    var listTaskContent = MutableLiveData<String>()

    var listTaskTypeTime = MutableLiveData<Int>()

    var listStartTime = MutableLiveData<String>()

    var listStopTime = MutableLiveData<String>()


    fun saveTask() {

        if (!listTaskContent.value.isNullOrEmpty()) {

            when (listTaskTypeTime.value) {

                R.id.rdb_month -> {
                    listStartTime.value = Utils.nowDate()
                    listStopTime.value = Utils.laterDate("Month")
                    val task = Task(
                        content = listTaskContent.value!!,
                        startTime = listStartTime.value!!,
                        finishTime = listStopTime.value!!,
                        type = "M"
                    )
                    viewModelScope.launch {
                        repository.insert(task)
                    }
                }

                R.id.rdb_day -> {

                    listStartTime.value = Utils.nowDate()
                    listStopTime.value = Utils.laterDate("Day")
                    val task = Task(
                        content = listTaskContent.value!!,
                        startTime = listStartTime.value!!,
                        finishTime = listStopTime.value!!,
                        type = "D"
                    )
                    viewModelScope.launch {
                        repository.insert(task)
                    }

                }

                R.id.rdb_week -> {

                    listStartTime.value = Utils.nowDate()
                    listStopTime.value = Utils.laterDate("Week")
                    val task = Task(
                        content = listTaskContent.value!!,
                        startTime = listStartTime.value!!,
                        finishTime = listStopTime.value!!,
                        type = "W"
                    )
                    viewModelScope.launch {
                        repository.insert(task)
                    }

                }

            }


        } else {
            Log.i("Info", "Content Empty")
        }


    }


}

