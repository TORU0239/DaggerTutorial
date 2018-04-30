package my.com.toru.daggertutorial.di;

import dagger.Component;
import my.com.toru.daggertutorial.app.DaggerTutorialApp;

@Component(modules = AppModule.class)
public interface AppComponent {
    void inject(DaggerTutorialApp application);
}