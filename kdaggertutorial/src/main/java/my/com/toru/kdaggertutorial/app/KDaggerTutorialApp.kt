package my.com.toru.kdaggertutorial.app

import android.app.Application
import my.com.toru.kdaggertutorial.di.AppComponent
import my.com.toru.kdaggertutorial.di.DaggerAppComponent

class KDaggerTutorialApp : Application(){

    val appComponent: AppComponent by lazy {
        DaggerAppComponent.builder()
                .build()
    }

    override fun onCreate() {
        super.onCreate()
    }
}