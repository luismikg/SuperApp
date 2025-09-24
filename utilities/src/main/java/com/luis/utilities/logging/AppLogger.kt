package com.luis.utilities.logging

import android.util.Log
import com.luis.utilities.BuildConfig

object AppLogger {

    const val TAG = "AppLogger"
    fun d(tag: String = TAG, msg: String) {
        if (BuildConfig.DEBUG) {
            Log.d(tag, msg)
        }
    }

    fun e(tag: String = TAG, msg: String) {
        if (BuildConfig.DEBUG) {
            Log.e(tag, msg)
        }
    }
}