package my.com.toru.daggertutorial.ui.detail;

import javax.inject.Inject;

public class DetailPresenter implements DetailContact.DetailPresenter{

    private DetailContact.DetailView view;

    @Inject
    public DetailPresenter(DetailContact.DetailView view) {
        this.view = view;
    }

    @Override
    public void request() {
        view.showToast("detail test!!");
    }

    @Override
    public void request2() {
        view.showToast("detail test 22!!");
    }
}
