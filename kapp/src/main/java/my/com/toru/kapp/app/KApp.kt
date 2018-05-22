package my.com.toru.kapp.app

import android.app.Application
import my.com.toru.kapp.di.ApplicationComponent
import my.com.toru.kapp.di.DaggerApplicationComponent

class KApp: Application() {

    val appComponent:ApplicationComponent by lazy {
        DaggerApplicationComponent.builder().build()
    }

    override fun onCreate() {
        super.onCreate()
    }
}