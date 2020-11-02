package com.lm.utils

import android.content.Context

/**
 * @author jiangbao on 2020/11/2.
 */
object Utils {
    private var ctx:Context?=null

    fun init(ctx:Context){
        this.ctx=ctx
    }

    fun getContext():Context?{
        return ctx
    }
}