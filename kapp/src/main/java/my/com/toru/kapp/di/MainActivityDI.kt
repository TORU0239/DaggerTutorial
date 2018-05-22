package my.com.toru.kapp.di

import dagger.Module
import dagger.Provides
import dagger.Subcomponent
import my.com.toru.kapp.ui.main.MainActivity
import my.com.toru.kapp.util.DummyUtil
import my.com.toru.kapp.util.DummyUtil2

@Subcomponent(modules = [MainActivityModule::class])
interface MainActivityComponent {
    fun inject(activity:MainActivity)

    @Subcomponent.Builder
    interface Builder{
        fun build():MainActivityComponent
        fun mainActivityModule(module:MainActivityModule):Builder
    }
}

@Module
class MainActivityModule{
    @Provides
    fun getDummyUtil() = DummyUtil()

    @Provides
    fun getDummyUtil2() = DummyUtil2()
}