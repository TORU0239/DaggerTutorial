package my.com.toru.kapp.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.Module
import dagger.Provides
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import my.com.toru.kapp.app.KApp
import my.com.toru.kapp.util.SingletonUtil
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidSupportInjectionModule::class,
                        ActivityBindingModule::class,
                        SingletonModule::class])
interface ApplicationComponent:AndroidInjector<KApp> {
    override fun inject(app:KApp)

    @Component.Builder
    interface Builder {
        @BindsInstance fun application(app:Application):ApplicationComponent.Builder
        fun singletonModule(singletonModule: SingletonModule):ApplicationComponent.Builder
        fun build():ApplicationComponent
    }
}

@Module
class SingletonModule {
    @Provides
    fun provideSingletonUtil() = SingletonUtil()
}