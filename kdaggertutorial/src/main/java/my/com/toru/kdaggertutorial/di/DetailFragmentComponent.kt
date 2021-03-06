package my.com.toru.kdaggertutorial.di

import dagger.Component
import dagger.Module
import dagger.Provides
import dagger.Subcomponent
import my.com.toru.kdaggertutorial.presenter.DetailContracts
import my.com.toru.kdaggertutorial.ui.detail.DetailFragment
import my.com.toru.kdaggertutorial.ui.detail.DetailPresenterImp

@Component(modules = [DetailModule::class, DetailModule2::class, DummyUtilModule2::class, DummyUtilModule3::class])
interface DetailFragmentComponent {
    fun inject(fragment: DetailFragment)
    fun detailComponentBuilder():DetailComponent.Builder
}

@Module
class DetailFragmentModule(private val detailFragment: DetailFragment){
    @Provides
    fun fragment() = detailFragment
}