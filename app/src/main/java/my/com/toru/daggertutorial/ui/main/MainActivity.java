package my.com.toru.daggertutorial.ui.main;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import javax.inject.Inject;

import my.com.toru.daggertutorial.R;
import my.com.toru.daggertutorial.app.DaggerTutorialApp;
import my.com.toru.daggertutorial.di.DaggerAppComponent;
import my.com.toru.daggertutorial.di.DaggerMainActivityComponent;
import my.com.toru.daggertutorial.ui.detail.DetailActivity;
import my.com.toru.daggertutorial.ui.main.presenter.MainPresenterImp;
import my.com.toru.daggertutorial.ui.main.presenter.MainPresenterModule;
import my.com.toru.daggertutorial.ui.main.view.MainView;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity implements MainView{
    private static final String TAG = MainActivity.class.getSimpleName();

    @Inject
    MainPresenterImp presenter;

    @Inject
    Retrofit retrofit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerMainActivityComponent
                .builder()
                .mainPresenterModule(new MainPresenterModule(this))
                .build().inject(this);

        ((DaggerTutorialApp)getApplication()).getComponent().inject(this);

        if(retrofit != null){
            Log.w("Toru", "retrofit not null!");
            presenter.showTest1();
        }
        else{
            Log.w("Toru", "retrofit null!");
        }
        
        presenter.showTest2();

        findViewById(R.id.next_btn).setOnClickListener(v -> startActivity(new Intent(MainActivity.this, DetailActivity.class)));
    }

    @Override
    public void showToast(String str) {
        Toast.makeText(MainActivity.this, str, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showToast(int id) {
        Toast.makeText(MainActivity.this, id, Toast.LENGTH_SHORT).show();
    }
}