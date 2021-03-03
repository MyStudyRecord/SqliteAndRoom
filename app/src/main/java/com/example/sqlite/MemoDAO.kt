package com.example.sqlite

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query

interface MemoDAO {
    @Insert(onConflict = REPLACE)
    fun insert(memo: Memo1)

    @Query("SELECT * FROM memo")
    fun getAll() : List<Memo1>

    @Delete
    fun delete(memo : Memo)

}