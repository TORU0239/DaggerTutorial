package my.com.toru.daggertutorial.di;

import dagger.Module;
import dagger.Provides;
import my.com.toru.daggertutorial.ui.main.MainActivity;

@Module
public class MainActivityModule {
    private MainActivity activity;

    public MainActivityModule(MainActivity activity) {
        this.activity = activity;
    }

    @Provides
    MainActivity getMainActivity(){
        return activity;
    }
}