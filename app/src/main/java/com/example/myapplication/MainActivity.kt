package com.example.myapplication

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View

class MainActivity : Activity() {
    val LOG_TAG = "myLogs"
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickStart(v: View?) {
        startService(Intent(this, MyServer::class.java))
    }

    fun onClickStop(v: View?) {
        stopService(Intent(this, MyServer::class.java))
    }

    fun startNewActivity(v: View?) {
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
    }
}