package my.com.toru.kapp.di

import android.app.Application
import dagger.Component
import dagger.Module
import javax.inject.Singleton

@Singleton
@Component
interface ApplicationComponent {
    fun inject(app:Application)
}

@Module
class ApplicationModule(private val app:Application){
    fun application() = app
}