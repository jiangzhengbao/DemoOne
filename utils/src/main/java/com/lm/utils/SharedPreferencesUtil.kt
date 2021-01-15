package com.lm.utils

import android.content.Context

/**
 * @author jiangbao on 2020/11/17.
 */
object SharedPreferencesUtil {
    private val name="mconfig"

    fun putString(context: Context,key:String,value:String){
        val sharedPreferences = context.getSharedPreferences(name, Context.MODE_PRIVATE)
        sharedPreferences.edit().putString(key,value).commit()
    }

    fun getString(context: Context,key:String,value:String):String{
        val sharedPreferences = context.getSharedPreferences(name, Context.MODE_PRIVATE)
        return sharedPreferences.getString(key,"")?:""
    }
}