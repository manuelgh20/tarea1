package com.tarea.model

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize
import java.sql.Time

@Parcelize
@Entity(tableName = "parqueo")
data class Parqueo(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    @ColumnInfo(name = "zona")
    val zona:String,
    @ColumnInfo(name = "espacio")
    val espacio:String,
    @ColumnInfo(name = "tipo")
    val tipo:String,
    @ColumnInfo(name = "placa")
    val placa:String,
    @ColumnInfo(name = "color")
    val color:String,
    @ColumnInfo(name = "ingreso")
    val ingreso:Time


): Parcelable
