package my.com.toru.kapp.di

import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector
import my.com.toru.kapp.ui.main.MainFragment
import my.com.toru.kapp.util.DummyUtil
import my.com.toru.kapp.util.DummyUtil2
import my.com.toru.kapp.util.DummyUtil3

//@Subcomponent(modules = [MainActivityModule::class])
//interface MainActivityComponent {
//    fun inject(activity:MainActivity)
//
//    @Subcomponent.Builder
//    interface Builder{
//        fun build():MainActivityComponent
//        fun mainActivityModule(module:MainActivityModule):Builder
//    }
//}

@Module
class MainActivityModule{
    @Provides
    fun getDummyUtil() = DummyUtil()

    @Provides
    fun getDummyUtil2() = DummyUtil2()
}

@Module
class MainFragmentProvideModule{
    @Provides
    fun getDummyUtil3() = DummyUtil3()
}

@Module(includes = [MainFragmentProvideModule::class])
abstract class MainFragmentModule{
    @ContributesAndroidInjector
    abstract fun contributeMainFragment():MainFragment
}