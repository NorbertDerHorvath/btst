package com.boktransporte.btst.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "work_sessions")
data class WorkSession(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val company: String,
    val carPlateStart: String,
    val carPlateEnd: String?,
    val startTime: Long,
    val endTime: Long?,
    val breakMinutes: Float?,
    val startKm: Int,
    val endKm: Int?,
    val startLocation: String?,
    val endLocation: String?
)
