package my.com.toru.daggertutorial.ui.detail;

public interface DetailContact {
    interface DetailView{
        void showToast(String str);
        void showToast(int id);
    }

    interface DetailPresenter{
        void request();
        void request2();
    }
}