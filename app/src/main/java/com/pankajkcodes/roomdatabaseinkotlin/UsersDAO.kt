package com.pankajkcodes.roomdatabaseinkotlin

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query


@Dao
interface UsersDAO {

    @Insert
    suspend fun insertUser(user: UsersModel)

    @Delete
    suspend fun deleteUser(user: UsersModel)

    @Query("SELECT * FROM users")

    fun getAllUsers(): LiveData<List<UsersModel>>
}