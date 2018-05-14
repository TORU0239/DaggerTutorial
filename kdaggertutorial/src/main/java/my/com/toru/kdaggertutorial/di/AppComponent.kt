package my.com.toru.kdaggertutorial.di

import dagger.Component
import dagger.Module
import dagger.Provides
import my.com.toru.kdaggertutorial.app.KDaggerTutorialApp
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {
    fun inject(app:KDaggerTutorialApp)
    fun mainActivityBuilder():MainComponent.Builder
//    fun detailActivityBuilder():DetailComponent.Builder
}

@Module
class AppModule(val app:KDaggerTutorialApp){
    @Provides
    fun provideApp() = app
}