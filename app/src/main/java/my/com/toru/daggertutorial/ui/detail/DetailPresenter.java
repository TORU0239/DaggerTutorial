package my.com.toru.daggertutorial.ui.detail;

import android.os.Handler;

import my.com.toru.daggertutorial.ui.detail.model.DetailModel;

public class DetailPresenter implements DetailContact.DetailPresenter{

    private DetailContact.DetailView view;

    public DetailPresenter(DetailContact.DetailView view) {
        this.view = view;
    }

    @Override
    public void request(DetailModel model) {
        // Simulating networking call
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                view.onShowResult(new DetailModel(false, "TEST RESULT SUCCESS!!"));
            }
        }, 2000);
    }

    @Override
    public void request2(DetailModel model) {
        view.onShowResult(new DetailModel(false, "SECOND TEST RESULT SUCCESS!!"));
    }
}