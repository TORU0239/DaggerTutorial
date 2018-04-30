package my.com.toru.daggertutorial.di;

import javax.inject.Singleton;

import dagger.Module;
import my.com.toru.daggertutorial.app.DaggerTutorialApp;

@Module
@Singleton
public class AppModule {
    private DaggerTutorialApp app;

    public AppModule(DaggerTutorialApp app) {
        this.app = app;
    }

    public DaggerTutorialApp getApp() {
        return app;
    }
}
