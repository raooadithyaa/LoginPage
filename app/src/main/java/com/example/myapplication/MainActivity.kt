package com.example.myapplication

import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    lateinit var receiver:AeroplaneMode
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bview=findViewById<Button>(R.id.submit)
        val userview=findViewById<EditText>(R.id.user_id)
        bview.setOnClickListener{
            val message=userview.text.toString()
            val intent = Intent(applicationContext, Activity2::class.java)
            intent.putExtra("message", message)
            startActivity(intent)
        }
        receiver=AeroplaneMode()
        IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED).also {
            registerReceiver(receiver,it)
        }
    }

    override fun onStop() {
        super.onStop()
        unregisterReceiver(receiver)
    }
}