package my.com.toru.daggertutorial.ui.detail;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import javax.inject.Inject;

import my.com.toru.daggertutorial.R;
import my.com.toru.daggertutorial.app.DaggerTutorialApp;
import my.com.toru.daggertutorial.ui.detail.model.DetailModel;
import retrofit2.Retrofit;

public class DetailActivity extends AppCompatActivity implements DetailContact.DetailView{

    private static final String TAG = DetailActivity.class.getSimpleName();
    private DetailPresenter presenter;
    private TextView textView;

    @Inject
    Retrofit retrofit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ((DaggerTutorialApp)getApplication()).getComponent().inject(this);
        presenter = new DetailPresenter(this);
        findViewById(R.id.detail_testbtn).setOnClickListener(v-> onClickButton());
        textView = findViewById(R.id.detail_procedure);

        if(retrofit != null){
            Log.w(TAG, "retrofit not null!!");
        }
        else{
            Log.w(TAG, "retrofit null!!");
        }
    }

    // transmitting event from User to View
    @Override
    public void onClickButton() {
        // calls presenter to transfer intents mapped into model.
        presenter.request(new DetailModel(true, "TEST!!!"));
    }

    // give result from Model to UI
    @Override
    public void onShowResult(DetailModel model) {
        Toast.makeText(DetailActivity.this, model.getResult(), Toast.LENGTH_SHORT).show();
        textView.setText(model.getResult());
    }
}