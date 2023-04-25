package com.example.myapplication

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class AeroplaneMode : BroadcastReceiver(){
    override fun onReceive(context: Context?, intent: Intent?) {
        val enabled = intent?.getBooleanExtra("state",false) ?:return
        if(enabled)
        {
            Toast.makeText(context,"Aeroplane Mode Enabled",Toast.LENGTH_LONG).show()
        }
        else
        {
            Toast.makeText(context,"Aeroplane Mode Disabled",Toast.LENGTH_LONG).show()
        }
    }
}