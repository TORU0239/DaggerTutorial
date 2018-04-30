package my.com.toru.daggertutorial.di;

import dagger.Component;
import my.com.toru.daggertutorial.ui.main.MainActivity;
import my.com.toru.daggertutorial.ui.main.presenter.MainPresenterModule;

@Component(modules = {MainActivityModule.class, MainPresenterModule.class})
public interface MainActivityComponent {
    void inject(MainActivity activity);
}