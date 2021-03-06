package com.example.sqlite

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.room.Room
import com.example.sqlite.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        val db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java, "database-name"
        )
                //메인 쓰레드에서 데이터 베이스 접근하게 해줌(allowMainThreadQueries)
            .allowMainThreadQueries()
            .build()

        //라이브데이터 적용
        //observer
        db.todoDao().getAll().observe(this, Observer {
            binding.resultText.text = it.toString()

        })



        binding.addButton.setOnClickListener {
            db.todoDao().insert(Todo(binding.todoEdit.text.toString()))
        }
    }


}