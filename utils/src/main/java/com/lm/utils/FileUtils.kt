package com.lm.utils

import android.os.Environment
import java.io.File
import java.lang.IllegalStateException
import java.text.SimpleDateFormat
import java.util.*

/**
 * @author jiangbao on 2020/11/2.
 */
object FileUtils {

    fun createFile(name:String,timestamp: Boolean?=true):File?{
        var fileName=name
        if (timestamp==true){
            fileName=Date().time.toString()+"$name.png"
        }
        val context = Utils.getContext() ?: throw IllegalStateException("context is null")
        return if (Environment.MEDIA_MOUNTED==Environment.getExternalStorageState()){
            File(context.getExternalFilesDir(""),fileName)
        }else{
            File(context.filesDir,fileName)
        }
    }

    fun createCacheFile(name:String,timestamp: Boolean?=true):File?{
        var fileName=name
        if (timestamp==true){
            fileName=Date().time.toString()+"$name.png"
        }
        val context = Utils.getContext() ?: throw IllegalStateException("context is null")
        return if (Environment.MEDIA_MOUNTED==Environment.getExternalStorageState()){
            File(context.externalCacheDir,fileName)
        }else{
            File(context.filesDir,fileName)
        }
    }
}