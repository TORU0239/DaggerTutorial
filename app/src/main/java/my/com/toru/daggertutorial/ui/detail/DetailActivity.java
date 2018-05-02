package my.com.toru.daggertutorial.ui.detail;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import javax.inject.Inject;

import my.com.toru.daggertutorial.R;
import my.com.toru.daggertutorial.ui.detail.model.DetailModel;

public class DetailActivity extends AppCompatActivity implements DetailContact.DetailView{

    private DetailPresenter presenter;

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        presenter = new DetailPresenter(this);
        findViewById(R.id.detail_testbtn).setOnClickListener(v-> onClickButton());
        textView = findViewById(R.id.detail_procedure);
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