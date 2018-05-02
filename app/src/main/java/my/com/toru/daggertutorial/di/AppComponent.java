package my.com.toru.daggertutorial.di;

import javax.inject.Singleton;

import dagger.Component;
import my.com.toru.daggertutorial.app.DaggerTutorialApp;

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    void inject(DaggerTutorialApp application);
}