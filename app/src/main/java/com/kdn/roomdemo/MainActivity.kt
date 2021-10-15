package com.kdn.roomdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val newUser = User("김똥깨", "21", "010-1111-5555")


        // 싱글톤 패턴을 사용한 경우
        val db = UserDatabase.getInstance(applicationContext)
        CoroutineScope(Dispatchers.IO).launch { // 다른애 한테 일 시키기
            db!!.userDao().update(newUser)

        }
    }
}