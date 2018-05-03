package my.com.toru.daggertutorial.di;

import android.app.Activity;
import android.app.Application;

import javax.inject.Singleton;

import dagger.Component;
import my.com.toru.daggertutorial.remote.RemoteModule;
import my.com.toru.daggertutorial.ui.detail.DetailActivity;
import my.com.toru.daggertutorial.ui.main.MainActivity;

@Singleton
@Component(modules = RemoteModule.class)
public interface AppComponent {
    void inject(Application ac);
    void inject(Activity activity);
    void inject(DetailActivity activity);
}