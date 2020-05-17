package com.ardakazanci.pitonyazilimmulakatcase.ui.list

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ardakazanci.pitonyazilimmulakatcase.data.model.Task
import com.ardakazanci.pitonyazilimmulakatcase.data.repository.MainRepository
import kotlinx.coroutines.launch

class ListViewModel(val repository: MainRepository) : ViewModel() {

    init {
        Log.i("Info", "ListViewModule Initiazlie")
        getTaskList()
    }

    val tasks = MutableLiveData<List<Task>>()

    fun getTaskList() {
        viewModelScope.launch {
            tasks.value = repository.getTaskList().value
        }
    }




}