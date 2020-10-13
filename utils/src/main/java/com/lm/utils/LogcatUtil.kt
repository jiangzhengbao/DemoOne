package com.lm.utils

import android.content.Context
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader

/**
 * @author jiangbao on 2020/10/12.
 */
object LogcatUtil {
    /**
     * TODO 保存本应用日志记录到storage/emulated/0/Android/data/com.ly.kotlindemo/files/log/logcat.txt文件中
     * 获取的只是本应用自己的logcat信息
     * @param ctx
     */
    fun saveLogcat(ctx:Context){
        try {
            val commandLine = arrayListOf<String>()
            commandLine.add( "logcat");
            commandLine.add( "-d");//使用该参数可以让logcat获取日志完毕后终止进程
            commandLine.add( "-v");
            commandLine.add( "time");
            commandLine.add( "-f");//如果使用commandLine.add(">");是不会写入文件，必须使用-f的方式
            val externalFilesDir = ctx.getExternalFilesDir("log")
            commandLine.add( "${externalFilesDir?.absolutePath}/logcat.txt");
            val process = Runtime.getRuntime().exec( commandLine.toArray( arrayOfNulls(commandLine.size)));
            val bufferedReader =
                BufferedReader( InputStreamReader(process.inputStream), 1024)
            val line = bufferedReader.readLine()
            while ( line != null) {
                LogUtil.d(line)
                LogUtil.d("\n")
            }
        } catch (  e: IOException) {
        }
    }
}