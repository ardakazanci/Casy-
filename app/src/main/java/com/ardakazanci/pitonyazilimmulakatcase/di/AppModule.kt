package com.ardakazanci.pitonyazilimmulakatcase.di

import android.app.Application
import androidx.room.Room
import com.ardakazanci.pitonyazilimmulakatcase.data.local.Dao
import com.ardakazanci.pitonyazilimmulakatcase.data.local.TaskDatabase
import com.ardakazanci.pitonyazilimmulakatcase.data.repository.MainRepository
import com.ardakazanci.pitonyazilimmulakatcase.ui.input.InputViewModel
import com.ardakazanci.pitonyazilimmulakatcase.ui.list.ListViewModel
import org.koin.android.ext.koin.androidApplication
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module


val appModule = module {

    fun provideDatabase(application: Application): TaskDatabase {
        return Room.databaseBuilder(application, TaskDatabase::class.java, "task.database")
            .fallbackToDestructiveMigration()
            .allowMainThreadQueries()
            .build()
    }


    fun provideDao(database: TaskDatabase): Dao {
        return database.getDao()
    }

    single { provideDatabase(androidApplication()) }
    single { provideDao(get()) }
    factory { MainRepository(get()) }
    viewModel { InputViewModel(get()) }
    viewModel { ListViewModel(get()) }
}