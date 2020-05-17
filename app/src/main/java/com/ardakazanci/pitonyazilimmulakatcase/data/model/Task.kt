package com.ardakazanci.pitonyazilimmulakatcase.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "task_table")
data class Task(
    @PrimaryKey()
    var _id: Int = 0,
    @ColumnInfo(name = "content")
    var content: String,
    @ColumnInfo(name = "startTime")
    var startTime: String,
    @ColumnInfo(name = "finishTime")
    var finishTime: String,
    @ColumnInfo(name = "type")
    var type: String

)