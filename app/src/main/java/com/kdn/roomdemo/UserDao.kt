package com.kdn.roomdemo

import androidx.room.*

@Dao
interface UserDao {
    @Insert
    fun insert(user: User)

    @Update
    fun update(user: User)

    @Delete
    fun delete(user: User)

    @Query("SELECT * FROM userProfile") // 테이블의 모든 값을 가져와라
    fun getAll(): List<User>

    @Query("DELETE FROM userProfile WHERE name = :name") // 'name'에 해당하는 유저를 삭제해라
    fun deleteUserByName(name: String)
}