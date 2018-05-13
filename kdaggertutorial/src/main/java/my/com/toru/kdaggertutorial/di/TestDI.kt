package my.com.toru.kdaggertutorial.di

import dagger.Module
import dagger.Provides
import dagger.Subcomponent
import my.com.toru.kdaggertutorial.ui.main.MainActivity

@Module
class TestDI {
    @Provides
    fun getTestModule() = DummyUtil()
}

@Subcomponent(modules = [(TestDI::class)])
interface TestComponent{
    fun inject(app: MainActivity)

    @Subcomponent.Builder
    interface Builder{
        fun testDI(module:TestDI):Builder
        fun build():TestComponent
    }
}