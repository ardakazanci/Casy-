package com.ardakazanci.pitonyazilimmulakatcase.data.local

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.ardakazanci.pitonyazilimmulakatcase.data.model.Task

@Dao
interface Dao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(task: Task)

    @Query("SELECT * FROM task_table")
    fun taskList(): LiveData<List<Task>>
}