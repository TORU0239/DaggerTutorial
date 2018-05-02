package my.com.toru.daggertutorial.ui.detail;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import javax.inject.Inject;

import my.com.toru.daggertutorial.R;

public class DetailActivity extends AppCompatActivity implements DetailContact.DetailView{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
    }

    @Override
    public void showToast(String str) {
        Toast.makeText(DetailActivity.this, str, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showToast(int id) {
        Toast.makeText(DetailActivity.this, id, Toast.LENGTH_SHORT).show();
    }
}
