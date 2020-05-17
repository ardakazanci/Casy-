package com.ardakazanci.pitonyazilimmulakatcase.data.repository

import android.content.Context
import android.util.Log
import androidx.lifecycle.LiveData
import com.ardakazanci.pitonyazilimmulakatcase.data.local.Dao
import com.ardakazanci.pitonyazilimmulakatcase.data.model.Task
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.withContext

class MainRepository(var dao: Dao) {


    suspend fun insert(task: Task) {

        withContext(Dispatchers.IO) {
            dao.insert(task)
        }

    }


    suspend fun getTaskList(): LiveData<List<Task>> {

        return withContext(Dispatchers.IO) {

            dao.taskList()

        }

    }


    init {
        Log.i("Info", "Main Repository Initialize")
    }


}