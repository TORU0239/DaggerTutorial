package my.com.toru.kapp.di

import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector
import my.com.toru.kapp.ui.detail.DetailFragment
import my.com.toru.kapp.util.DummyUtil3

//@Subcomponent(modules = [DetailActivityModule::class])
//interface DetailActivityComponent {
//    fun inject(activity: DetailActivity)
//
//    @Subcomponent.Builder
//    interface Builder{
//        fun build():DetailActivityComponent
//        fun detailActivityModule(module:DetailActivityModule):Builder
//    }
//}

@Module
class DetailActivityModule{
    @Provides
    fun getDummyUtil3() = DummyUtil3()
}


@Module
abstract class DetailFragmentModule{
    @ContributesAndroidInjector
    abstract fun contributeDetailFragment():DetailFragment
}