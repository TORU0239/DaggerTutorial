package my.com.toru.kdaggertutorial.di

import dagger.Module
import dagger.Provides
import dagger.Subcomponent
import my.com.toru.kdaggertutorial.ui.detail.DetailFragment
import my.com.toru.kdaggertutorial.util.DetailUtil
import my.com.toru.kdaggertutorial.util.DummyUtil
import my.com.toru.kdaggertutorial.util.DummyUtil2
import my.com.toru.kdaggertutorial.util.DummyUtil3

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

@Module
class DummyUtilModule2{
    @Provides
    fun getDummyModule2():DummyUtil2 = DummyUtil2()
}

@Module
class DummyUtilModule3{
    @Provides
    fun getDummyModule3():DummyUtil3 = DummyUtil3()
}

@Subcomponent(modules = [DetailModule::class, DetailModule2::class, DummyUtilModule2::class, DummyUtilModule3::class])
interface DetailComponent{
    fun inject(fragment:DetailFragment)

    @Subcomponent.Builder
    interface Builder{
        fun detailModule(module:DetailModule):Builder
        fun detailModule2(module:DetailModule2):Builder
        fun dummy2(module:DummyUtilModule2): Builder
        fun dummy3(module:DummyUtilModule3): Builder
        fun build():DetailComponent
    }
}