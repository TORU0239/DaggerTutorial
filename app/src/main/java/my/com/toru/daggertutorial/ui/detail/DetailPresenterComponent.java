package my.com.toru.daggertutorial.ui.detail;

import dagger.Component;
import my.com.toru.daggertutorial.remote.RemoteModule;

@Component(modules = RemoteModule.class)
public interface DetailPresenterComponent {
    void inject(DetailPresenter presenter);
}
