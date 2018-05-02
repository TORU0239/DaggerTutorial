package my.com.toru.daggertutorial.ui.detail;

import my.com.toru.daggertutorial.ui.detail.model.DetailModel;

public interface DetailContact {
    interface DetailView{
        void onClickButton();
        void onShowResult(DetailModel model);
    }

    interface DetailPresenter{
        void request(DetailModel model);
        void request2(DetailModel model);
    }
}