package my.com.toru.kdaggertutorial.di

import dagger.Component
import dagger.Module
import dagger.Provides
import my.com.toru.kdaggertutorial.ui.main.MainActivity

@Module
class TestDI {
    @Provides
    fun getTestModule() = TestClass()
}

@Component(modules = [(TestDI::class)])
interface TestComponent{
    fun inject(app: MainActivity)
}