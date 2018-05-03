package my.com.toru.daggertutorial.ui.detail;

import android.os.Handler;
import android.util.Log;

import javax.inject.Inject;

import my.com.toru.daggertutorial.remote.RemoteModule;
import my.com.toru.daggertutorial.ui.detail.model.DetailModel;
import retrofit2.Retrofit;

public class DetailPresenter implements DetailContact.DetailPresenter{

    private DetailContact.DetailView view;

    @Inject
    Retrofit retrofit;

    public DetailPresenter(DetailContact.DetailView view) {
        this.view = view;
        DaggerDetailPresenterComponent.builder()
                .remoteModule(new RemoteModule())
                .build()
                .inject(this);

        if(retrofit != null){
            Log.w("Toru", "retrofit not null!!!");
        }
        else{
            Log.w("Toru", "retrofit null!!!");
        }
    }

    @Override
    public void request(DetailModel model) {
        // Simulating networking call
        new Handler().postDelayed(() -> view.onShowResult(new DetailModel(false, "TEST RESULT SUCCESS!!")), 2000);
    }

    @Override
    public void request2(DetailModel model) {
        view.onShowResult(new DetailModel(false, "SECOND TEST RESULT SUCCESS!!"));
    }
}