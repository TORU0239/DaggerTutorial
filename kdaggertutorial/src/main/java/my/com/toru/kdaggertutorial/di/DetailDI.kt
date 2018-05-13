package my.com.toru.kdaggertutorial.di

import dagger.Module
import dagger.Provides
import dagger.Subcomponent
import my.com.toru.kdaggertutorial.ui.detail.DetailActivity
import my.com.toru.kdaggertutorial.util.DetailUtil
import my.com.toru.kdaggertutorial.util.DummyUtil

@Module
class DetailModule {
    @Provides
    fun getDetailModule():DetailUtil = DetailUtil()
}

@Module
class DetailModule2{
    @Provides
    fun getDummyModule():DummyUtil = DummyUtil()
}

@Subcomponent(modules = [DetailModule::class, DetailModule2::class])
interface DetailComponent{
    fun inject(activity:DetailActivity)

    @Subcomponent.Builder
    interface Builder{
        fun detailModule(module:DetailModule):Builder
        fun detailModule2(module:DetailModule2):Builder
        fun build():DetailComponent
    }
}