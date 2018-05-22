package my.com.toru.kapp.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.Module
import dagger.Provides
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import my.com.toru.kapp.app.KApp
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidSupportInjectionModule::class, ActivityBindingModule::class, ApplicationModule::class])
interface ApplicationComponent:AndroidInjector<KApp> {

    interface Builder:AndroidInjector<KApp>{
        fun build():ApplicationComponent

        @BindsInstance
        fun application(app:Application):ApplicationComponent.Builder
    }
}

@Module
class ApplicationModule(private val app:Application){
    @Provides
    fun provideApplicationContext() = app
}