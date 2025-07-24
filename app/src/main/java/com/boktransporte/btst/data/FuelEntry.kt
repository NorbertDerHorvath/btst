package com.boktransporte.btst.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.boktransporte.btst.data.PaymentType

@Entity(tableName = "fuel_entries")
data class FuelEntry(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val dateTime: Long,
    val kilometer: Int,
    val liters: Float,
    val fuelType: String,
    val carPlate: String,
    val paymentType: PaymentType
)

enum class PaymentType {
    DKV, CHIP
}
