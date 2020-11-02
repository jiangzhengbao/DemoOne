package com.lm.utils

/**
 * @author jiangbao on 2020/11/2.
 */
object StringUtil {

    fun isNotEmpty(str:String):Boolean{
        return str!=null&& str.isNotEmpty()
    }

    fun isEmpty(str:String):Boolean{
        return str==null ||str.isEmpty()
    }
}