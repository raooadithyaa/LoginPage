package com.example.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        val bundle = intent.extras
        val message = bundle!!.getString("message")
        findViewById<TextView>(R.id.txvUserMessage).text=message.toString()
    }
}