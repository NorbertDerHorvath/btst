package com.boktransporte.btst.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "car_switches")
data class CarSwitch(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val timestamp: Long,
    val oldCarPlate: String,
    val newCarPlate: String,
    val sessionId: Int
)
