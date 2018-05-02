package my.com.toru.daggertutorial.ui.main;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import my.com.toru.daggertutorial.R;
import my.com.toru.daggertutorial.ui.detail.DetailActivity;
import my.com.toru.daggertutorial.ui.main.view.MainView;

public class MainActivity extends AppCompatActivity implements MainView{
    private static final String TAG = MainActivity.class.getSimpleName();

//    @Inject
//    MainPresenterImp presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        DaggerMainActivityComponent
//                .builder()
//                .mainActivityModule(new MainActivityModule(this))
//                .mainPresenterModule(new MainPresenterModule())
//                .build().inject(this);
//
//        presenter.showTest1();
//        presenter.showTest2();

        findViewById(R.id.next_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, DetailActivity.class));
            }
        });
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