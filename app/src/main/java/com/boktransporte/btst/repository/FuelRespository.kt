package com.boktransporte.btst.repository

import com.boktransporte.btst.data.FuelEntry
import com.boktransporte.btst.data.FuelEntryDao
import kotlinx.coroutines.flow.Flow

class FuelRepository(private val dao: FuelEntryDao) {
    val entries: Flow<List<FuelEntry>> = dao.getAll()

    suspend fun add(entry: FuelEntry) = dao.insert(entry)
}
