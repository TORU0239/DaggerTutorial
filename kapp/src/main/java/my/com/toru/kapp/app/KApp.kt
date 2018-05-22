package my.com.toru.kapp.app

import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication
import my.com.toru.kapp.di.DaggerApplicationComponent

class KApp: DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerApplicationComponent.builder().build()
    }
}