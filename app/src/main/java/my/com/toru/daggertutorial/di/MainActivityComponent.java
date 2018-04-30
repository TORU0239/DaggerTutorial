package my.com.toru.daggertutorial.di;

import dagger.Component;
import my.com.toru.daggertutorial.ui.MainActivity;

@Component(modules = MainActivityModule.class)
public interface MainActivityComponent {
    void inject(MainActivity activity);
}