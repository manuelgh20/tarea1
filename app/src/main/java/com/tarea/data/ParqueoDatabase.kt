package com.tarea.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.tarea.model.Parqueo

@Database(entities = [Parqueo::class], version = 1, exportSchema = false)
abstract class ParqueoDatabase: RoomDatabase() {
    abstract  fun parqueoDao():ParqueoDao

    companion object{
        @Volatile
        private var INSTANCE: ParqueoDatabase?=null

        fun getDatabase(context: android.content.Context):ParqueoDatabase{
            val tempInstance = INSTANCE
            if(tempInstance!= null){
                return tempInstance
            }
            synchronized(this){
                val instance = androidx.room.Room.databaseBuilder(
                    context.applicationContext,
                    ParqueoDatabase::class.java,
                    "parqueo_database"
                ).build()
                INSTANCE=instance
                return instance
            }
        }
    }
}