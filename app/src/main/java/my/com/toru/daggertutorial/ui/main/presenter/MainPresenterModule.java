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
    MainPresenter getMainP(final MainActivity activity){
        return new MainPresenter() {
            @Override
            public void showTest1() {
                ((MainView)activity).showToast("test");
            }

            @Override
            public void showTest2() {
                ((MainView)activity).showToast("test2");
            }
        };
    }
}