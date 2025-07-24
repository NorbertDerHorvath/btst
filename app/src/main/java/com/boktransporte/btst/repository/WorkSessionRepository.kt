package com.boktransporte.btst.repository

import com.boktransporte.btst.data.WorkSession
import com.boktransporte.btst.data.WorkSessionDao
import kotlinx.coroutines.flow.Flow

class WorkSessionRepository(private val dao: WorkSessionDao) {
    val sessions: Flow<List<WorkSession>> = dao.getAll()

    suspend fun add(session: WorkSession) = dao.insert(session)
}
