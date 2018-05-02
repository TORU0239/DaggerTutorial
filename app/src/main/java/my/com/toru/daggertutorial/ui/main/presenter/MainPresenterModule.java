package my.com.toru.daggertutorial.ui.main.presenter;

import dagger.Module;
import dagger.Provides;
import my.com.toru.daggertutorial.di.MainActivityModule;
import my.com.toru.daggertutorial.ui.main.MainActivity;
import my.com.toru.daggertutorial.ui.main.view.MainView;

@Module(includes = MainActivityModule.class)
public class MainPresenterModule {

    public MainPresenterModule() { }

    @Provides
    MainPresenterImp getMainP(final MainActivity activity){
        return new MainPresenterImp(activity);
    }
}