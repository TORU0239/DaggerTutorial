package my.com.toru.daggertutorial.app;

import android.app.Application;

//import my.com.toru.daggertutorial.di.DaggerAppComponent;

public class DaggerTutorialApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
//        DaggerAppComponent.builder().build().inject(DaggerTutorialApp.this);
    }
}