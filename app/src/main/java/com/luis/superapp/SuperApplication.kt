package com.luis.superapp

import android.app.Application
import com.luis.utilities.logging.AppLogger
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class SuperApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        AppLogger.d(TAG, "Application is running")
    }

    companion object {
        const val TAG = "SuperApplication"
    }
}