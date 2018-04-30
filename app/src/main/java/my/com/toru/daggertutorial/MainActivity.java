package my.com.toru.daggertutorial;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

import my.com.toru.daggertutorial.di.DaggerMainActivityComponent;

public class MainActivity extends AppCompatActivity {

    @Inject Test1 test;
    @Inject Test2 test2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerMainActivityComponent.builder().build().inject(this);

        test.test();
        test2.test();
    }
}
