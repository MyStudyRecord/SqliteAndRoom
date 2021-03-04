package com.example.sqlite

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class RoomActivity : AppCompatActivity() {

    lateinit var db : MemoDatabase
    var memoList = listOf<MemoEntity>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room)

        db = MemoDatabase.getInstance(this)!!

    }

    //1. Insert Data
    //2. Get Data
    //3. Delete Data

    //4. Set RecyclerView

    fun insertMemoo(){

    }

    fun getAllMemos(){

    }

    fun deleteMemo(){

    }
    fun setRecyclerView(){

    }

}