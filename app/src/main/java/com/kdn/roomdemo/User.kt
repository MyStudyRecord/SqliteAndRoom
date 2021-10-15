package com.kdn.roomdemo

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName="userProfile")
data class User (
    var name: String,
    var age: String,
    var phone: String
){
    @PrimaryKey(autoGenerate = true) var id: Int = 0
}