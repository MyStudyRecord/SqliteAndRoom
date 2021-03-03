package com.example.sqlite

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "memo")
data class Memo1(
    @PrimaryKey(autoGenerate = true)
    var id:Long?,
    var memo:String=""){

}