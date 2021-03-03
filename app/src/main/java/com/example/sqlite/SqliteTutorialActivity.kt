package com.example.sqlite

import android.database.sqlite.SQLiteDatabase
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

lateinit var dbHelper : DBHelper
lateinit var database : SQLiteDatabase

class SqliteTutorialActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sqlite_tutorial)

        dbHelper = DBHelper(this, "newdb.db", null, 1)
        database = dbHelper.writableDatabase

    }
}