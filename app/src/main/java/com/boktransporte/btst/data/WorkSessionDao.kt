package com.boktransporte.btst.data

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface WorkSessionDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(session: WorkSession)

    @Query("SELECT * FROM work_sessions ORDER BY startTime DESC")
    fun getAll(): Flow<List<WorkSession>>
}
