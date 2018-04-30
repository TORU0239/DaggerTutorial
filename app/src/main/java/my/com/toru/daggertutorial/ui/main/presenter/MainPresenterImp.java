package my.com.toru.daggertutorial.ui.main.presenter;

import my.com.toru.daggertutorial.ui.main.view.MainView;

public class MainPresenterImp implements MainPresenter {

    private MainView view;

    public MainPresenterImp(MainView view) {
        this.view = view;
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
