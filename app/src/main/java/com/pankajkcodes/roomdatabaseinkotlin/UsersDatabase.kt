package com.pankajkcodes.roomdatabaseinkotlin

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(entities = [UsersModel::class],version = 1)
abstract  class UsersDatabase : RoomDatabase() {

    abstract fun usersDao() : UsersDAO
}