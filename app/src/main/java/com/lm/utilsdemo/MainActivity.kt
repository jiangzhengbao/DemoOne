package com.lm.utilsdemo

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lm.utils.LogUtil

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        printLog("Hello Everyone!")

    }


    fun printLog(msg:String){
        LogUtil.d(msg)
    }
}
