package com.boktransporte.btst.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [Note::class, FuelEntry::class, WorkSession::class, CarSwitch::class],
    version = 1
)
abstract class NoteDatabase : RoomDatabase() {
    abstract fun noteDao(): NoteDao
    abstract fun fuelEntryDao(): FuelEntryDao
    abstract fun workSessionDao(): WorkSessionDao

    companion object {
        @Volatile
        private var INSTANCE: NoteDatabase? = null

        fun getDatabase(context: Context): NoteDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    NoteDatabase::class.java,
                    "btst_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}
