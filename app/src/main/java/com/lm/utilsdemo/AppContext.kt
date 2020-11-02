package com.lm.utilsdemo

import android.app.Application
import com.lm.utils.Utils

/**
 * @author jiangbao on 2020/11/2.
 */
class AppContext:Application() {
    override fun onCreate() {
        super.onCreate()
        Utils.init(this)
    }
}