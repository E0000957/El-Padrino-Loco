package com.mx.ebany.elpadrinoloco

import android.app.Application
import com.google.firebase.FirebaseApp
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class Application: Application(){
    override fun onCreate() {
        super.onCreate()
        FirebaseApp.initializeApp(this)
    }
}