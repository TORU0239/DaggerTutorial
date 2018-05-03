package my.com.toru.daggertutorial.app;

import android.app.Application;
import android.util.Log;

import javax.inject.Inject;

import my.com.toru.daggertutorial.di.AppComponent;
import my.com.toru.daggertutorial.di.DaggerAppComponent;
import my.com.toru.daggertutorial.remote.RemoteModule;
import my.com.toru.daggertutorial.ui.other.di.DummyDependModule;
import retrofit2.Retrofit;

public class DaggerTutorialApp extends Application {

    private AppComponent component;
    public AppComponent getComponent() {
        return component;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerAppComponent.builder()
                .remoteModule(new RemoteModule())
                .build();
    }
}