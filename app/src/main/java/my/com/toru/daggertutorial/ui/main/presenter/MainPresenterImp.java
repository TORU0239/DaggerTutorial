package my.com.toru.daggertutorial.ui.main.presenter;

import javax.inject.Inject;

import my.com.toru.daggertutorial.ui.main.view.MainView;
import retrofit2.Retrofit;

public class MainPresenterImp implements MainPresenter {

    private MainView view;
    private Retrofit retrofit;

    @Inject
    public MainPresenterImp(MainView view, Retrofit retrofit) {
        this.view = view;
        this.retrofit = retrofit;
    }

    @Override
    public void showTest1() {
        view.showToast("Test1!!");
    }

    @Override
    public void showTest2() {
        view.showToast("Test2!!");
    }
}
