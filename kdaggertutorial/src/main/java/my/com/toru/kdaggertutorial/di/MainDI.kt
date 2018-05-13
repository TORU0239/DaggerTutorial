package my.com.toru.kdaggertutorial.di

import dagger.Module
import dagger.Provides
import dagger.Subcomponent
import my.com.toru.kdaggertutorial.ui.main.MainActivity
import my.com.toru.kdaggertutorial.util.DummyUtil

@Module
class MainModule {
    @Provides
    fun getMainModule() = DummyUtil()
}

@Subcomponent(modules = [(MainModule::class)])
interface MainComponent{
    fun inject(app: MainActivity)

    @Subcomponent.Builder
    interface Builder{
        fun mainDI(module:MainModule):Builder
        fun build():MainComponent
    }
}