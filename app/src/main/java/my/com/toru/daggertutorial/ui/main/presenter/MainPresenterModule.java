package my.com.toru.daggertutorial.ui.main.presenter;

import dagger.Module;
import dagger.Provides;
import my.com.toru.daggertutorial.di.MainActivityModule;
import my.com.toru.daggertutorial.remote.RemoteModule;
import my.com.toru.daggertutorial.ui.main.MainActivity;
import my.com.toru.daggertutorial.ui.main.view.MainView;
import retrofit2.Retrofit;

@Module(includes = {MainActivityModule.class, RemoteModule.class})
public class MainPresenterModule {

    public MainPresenterModule() { }

    @Provides
    MainPresenterImp getMainP(final MainActivity activity, Retrofit retrofit){
        return new MainPresenterImp(activity, retrofit);
    }
}