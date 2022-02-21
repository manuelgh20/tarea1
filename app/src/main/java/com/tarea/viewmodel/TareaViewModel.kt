package com.tarea.viewmodel

import android.app.Application
import androidx.lifecycle.*
import com.tarea.data.ParqueoDatabase
import com.tarea.model.Parqueo
import com.tarea.repository.ParqueoRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class TareaViewModel(application: Application) : AndroidViewModel(application) {

    val getAllData: LiveData<List<Parqueo>>
    private  val repository: ParqueoRepository

    init {
        val parqueoDao=ParqueoDatabase.getDatabase(application).parqueoDao()
        repository= ParqueoRepository(parqueoDao)
        getAllData=repository.getAllData
    }
    fun addParqueo(parqueo: Parqueo){
        viewModelScope.launch (Dispatchers.IO) {repository.addParqueo(parqueo)}
    }

    fun updateParqueo(parqueo: Parqueo){
        viewModelScope.launch (Dispatchers.IO) {repository.updateParqueo(parqueo)}
    }

    fun deleteParqueo(parqueo: Parqueo){
        viewModelScope.launch (Dispatchers.IO) {repository.delteParqueo(parqueo)}
    }

}