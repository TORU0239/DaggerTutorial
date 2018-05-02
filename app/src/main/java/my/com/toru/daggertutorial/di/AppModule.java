package my.com.toru.daggertutorial.di;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import my.com.toru.daggertutorial.app.DaggerTutorialApp;

@Module
@Singleton
public class AppModule {
    private DaggerTutorialApp app;

    public AppModule(DaggerTutorialApp app) {
        this.app = app;
    }

    @Provides
    public DaggerTutorialApp getApp() {
        return app;
    }
}