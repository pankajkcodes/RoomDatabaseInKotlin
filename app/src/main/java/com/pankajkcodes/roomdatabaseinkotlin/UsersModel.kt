package com.pankajkcodes.roomdatabaseinkotlin

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
data class UsersModel(

    @PrimaryKey(autoGenerate = true)
    val id : Long,
    val name : String,
    val age : Int


)
