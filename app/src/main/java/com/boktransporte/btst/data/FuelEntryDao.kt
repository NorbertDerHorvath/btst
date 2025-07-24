package com.boktransporte.btst.data

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface FuelEntryDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(entry: FuelEntry)

    @Query("SELECT * FROM fuel_entries ORDER BY dateTime DESC")
    fun getAll(): Flow<List<FuelEntry>>
}
