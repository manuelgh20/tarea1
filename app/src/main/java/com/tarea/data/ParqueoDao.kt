package com.tarea.data

import androidx.lifecycle.LiveData
import androidx.room.*
import com.tarea.model.Parqueo

@Dao
interface ParqueoDao {

    @Query("SELECT *FROM parqueo")
    fun getAllData(): LiveData<List<Parqueo>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addParqueo(parqueo: Parqueo)

    @Update(onConflict = OnConflictStrategy.IGNORE)
    suspend fun updateParqueo(parqueo: Parqueo)

    @Delete
    suspend fun deleteParqueo(parqueo: Parqueo)
}