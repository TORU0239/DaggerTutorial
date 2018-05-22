package my.com.toru.kapp.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import my.com.toru.kapp.ui.detail.DetailActivity
import my.com.toru.kapp.ui.detail.DetailFragment
import my.com.toru.kapp.ui.main.MainActivity

@Module
abstract class ActivityBindingModule {
    @ContributesAndroidInjector(modules=[MainActivityModule::class])
    abstract fun mainActivity():MainActivity

    @ContributesAndroidInjector(modules=[DetailActivityModule::class, FragmentModule::class])
    abstract fun detailActivity(): DetailActivity

//    @ContributesAndroidInjector(modules=[DetailActivityModule::class])
//    abstract fun detailFragment(): DetailFragment
}