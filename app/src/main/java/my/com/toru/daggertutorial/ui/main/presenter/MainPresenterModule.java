package my.com.toru.daggertutorial.ui.main.presenter;

import dagger.Module;
import dagger.Provides;
import my.com.toru.daggertutorial.remote.RemoteModule;
import my.com.toru.daggertutorial.ui.main.MainActivity;
import retrofit2.Retrofit;

@Module(includes = RemoteModule.class)
public class MainPresenterModule {

    private MainActivity activity;
    public MainPresenterModule(MainActivity activity) {
        this.activity = activity;
    }

    @Provides
    MainPresenterImp getMainP(Retrofit retrofit){
        return new MainPresenterImp(activity, retrofit);
    }
}