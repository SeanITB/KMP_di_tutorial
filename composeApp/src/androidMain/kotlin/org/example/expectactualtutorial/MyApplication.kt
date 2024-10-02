package org.example.expectactualtutorial

import android.app.Application
import org.example.expectactualtutorial.di.initKoin
import org.koin.android.ext.koin.androidContext

class MyApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin{
            androidContext(this@MyApplication)
        }
    }

}