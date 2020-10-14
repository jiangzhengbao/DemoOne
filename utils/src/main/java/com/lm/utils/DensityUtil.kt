package com.lm.utils

import android.content.Context
import android.util.Log

/**
 * @author jiangbao on 2020/9/30.
 *
 */
object DensityUtil {
    private var screen_width=0
    private var screen_height=0

    fun dip2px(ctx:Context,dp:Float):Int{
       val scale= getScreenDensity(ctx)
       return (dp*scale+0.5f).toInt()
    }

    fun px2dip(ctx:Context,px:Float):Int{
        val scale= getScreenDensity(ctx)
        return (px/scale+0.5f).toInt()
    }

    fun getScreenWidth(ctx: Context):Int{
        if (screen_width<=0){
            this.getScreenDensity(ctx)
        }
        return this.screen_width
    }

    fun getScreenHeight(ctx: Context):Int{
        if (screen_height<=0){
            this.getScreenDensity(ctx)
        }
        return this.screen_height
    }

    private fun getScreenDensity(ctx:Context):Float{
        val dm = ctx.resources.displayMetrics
        screen_width=dm.widthPixels
        screen_height=dm.heightPixels
        return dm.density
    }
}