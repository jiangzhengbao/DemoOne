package com.lm.utils

import android.os.Environment
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.lang.Exception
import java.lang.IllegalStateException
import java.util.*

/**
 * @author jiangbao on 2020/11/2.
 */
object FileUtil {

    /**
     * TODO 创建文件
     *
     * @param name
     * @param timestamp
     * @return
     */
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

    /**
     * TODO 创建缓存文件
     *
     * @param name
     * @param timestamp
     * @return
     */
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

    /**
     * TODO 复制文件
     *
     * @param orginFile
     * @param targetFile
     */
    fun copyFile(orginFile:File?,targetFile:File?){
        if (orginFile==null||targetFile==null){
            return
        }
        val fis= FileInputStream(orginFile)
        val fos= FileOutputStream(targetFile)
        try {
            val byte= ByteArray(1024)
            var length=0
            while (length!=-1){
                length=fis.read(byte)
                fos.write(byte,0,length)
            }
        }catch (e: Exception){
            e.printStackTrace()
        }finally {
            fis.close()
            fos.close()
        }
    }
}