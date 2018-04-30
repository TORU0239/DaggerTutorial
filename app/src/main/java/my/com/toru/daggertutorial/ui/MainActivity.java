package my.com.toru.daggertutorial.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

import my.com.toru.daggertutorial.R;
import my.com.toru.daggertutorial.remote.Test1;
import my.com.toru.daggertutorial.remote.Test2;
import my.com.toru.daggertutorial.di.DaggerMainActivityComponent;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();

    @Inject
    Test1 test;
    @Inject
    Test2 test2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerMainActivityComponent.builder().build().inject(this);

        test.test();
        test2.test();
    }
}
