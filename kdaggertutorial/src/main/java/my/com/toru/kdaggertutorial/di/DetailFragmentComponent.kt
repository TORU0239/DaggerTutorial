package my.com.toru.kdaggertutorial.di

import dagger.Component
import dagger.Module
import dagger.Provides
import my.com.toru.kdaggertutorial.ui.detail.DetailFragment

@Component(modules = [DetailModule::class, DetailModule2::class])
interface DetailFragmentComponent {
    fun inject(fragment: DetailFragment)
    fun detailPresenerComponentBuilder():DetailPresenterComponent.Builder
}

@Module
class DetailFragmentModule(private val detailFragment: DetailFragment){
    @Provides
    fun fragment() = detailFragment
}