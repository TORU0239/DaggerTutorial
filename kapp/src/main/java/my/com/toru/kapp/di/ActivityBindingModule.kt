package my.com.toru.kapp.di

import dagger.Module


@Module(subcomponents = [MainActivityComponent::class, DetailActivityComponent::class])
abstract class ActivityBindingModule {

}