package com.lm.utils
import android.util.Log

/**
 * @author jiangbao on 2020/10/9.
 */
object LogUtil {
    private const val TAG="LogUtil"
    private var DEBUG= BuildConfig.DEBUG

    fun setDebug(debug:Boolean){
        this.DEBUG=debug
    }

    fun isDebug():Boolean{
        return  this.DEBUG
    }

    fun d(msg:String){
        if (DEBUG) Log.d(TAG,msg)
    }

    fun d(tag:String,msg:String){
        if (DEBUG) Log.d(tag,msg)
    }

    fun i(msg:String){
        if (DEBUG) Log.i(TAG,msg)
    }

    fun i(tag:String,msg:String){
        if (DEBUG) Log.i(tag,msg)
    }

    fun w(msg:String){
        if (DEBUG) Log.w(TAG,msg)
    }

    fun w(tag:String,msg:String){
        if (DEBUG) Log.w(tag,msg)
    }

    fun e(msg:String){
        if (DEBUG) Log.e(TAG,msg)
    }

    fun e(tag:String,msg:String){
        if (DEBUG) Log.e(tag,msg)
    }
}