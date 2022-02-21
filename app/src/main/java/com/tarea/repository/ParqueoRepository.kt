package com.tarea.repository

import androidx.lifecycle.LiveData
import com.tarea.data.ParqueoDao
import com.tarea.model.Parqueo

class ParqueoRepository(private val parqueoDao: ParqueoDao) {
    val getAllData: LiveData<List<Parqueo>> = parqueoDao.getAllData()

    suspend fun addParqueo(parqueo: Parqueo){
        parqueoDao.addParqueo(parqueo)
    }
    suspend fun updateParqueo(parqueo: Parqueo){
        parqueoDao.updateParqueo(parqueo)
    }
    suspend fun delteParqueo(parqueo: Parqueo){
        parqueoDao.deleteParqueo(parqueo)
    }
}