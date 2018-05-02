package my.com.toru.daggertutorial.di;

import android.app.Activity;

import javax.inject.Scope;
import javax.inject.Singleton;

import dagger.Component;
import my.com.toru.daggertutorial.app.DaggerTutorialApp;
import my.com.toru.daggertutorial.remote.RemoteModule;
import my.com.toru.daggertutorial.ui.main.MainActivity;

@Singleton
@Component(modules = RemoteModule.class)
public interface AppComponent {
    void inject(Activity activity);
}