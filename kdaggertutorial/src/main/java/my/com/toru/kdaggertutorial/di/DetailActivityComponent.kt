package my.com.toru.kdaggertutorial.di

import dagger.Component
import dagger.Module
import dagger.Provides
import my.com.toru.kdaggertutorial.ui.detail.DetailActivity

@Component(modules = [DetailModule::class, DetailModule::class])
interface ActivityComponent {
    fun inject(activity:DetailActivity)
//    fun detailFragmentBuilder():DetailComponent.Builder
//    fun detailFragmentBuilder2():DetailSecondComponent.Builder
}

@Module
class ActivityModule(private val activity: DetailActivity){
    @Provides
    fun activity() = activity
}