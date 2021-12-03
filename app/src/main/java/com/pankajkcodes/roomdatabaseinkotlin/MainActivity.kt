package com.pankajkcodes.roomdatabaseinkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.room.Room
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


class MainActivity : AppCompatActivity() {

    private lateinit var database: UsersDatabase

    @DelicateCoroutinesApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        database = Room.databaseBuilder(applicationContext,
            UsersDatabase::class.java,
            "users").build()
        GlobalScope.launch {
            database.usersDao().insertUser(UsersModel(0,"User1",19))
        }

        database.usersDao().getAllUsers().observe(this,{
            Log.d("TAG","data :$it")
        })
    }
}