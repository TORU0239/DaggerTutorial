package my.com.toru.daggertutorial.ui.other;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import javax.inject.Inject;

import my.com.toru.daggertutorial.R;
import my.com.toru.daggertutorial.app.DaggerTutorialApp;
import my.com.toru.daggertutorial.di.DaggerAppComponent;
import my.com.toru.daggertutorial.ui.other.utils.DummyDependency;
import my.com.toru.daggertutorial.ui.other.utils.DummyPushLibrary;
import my.com.toru.daggertutorial.ui.other.utils.OtherDependency;
import my.com.toru.daggertutorial.ui.other.utils.Util;
import retrofit2.Retrofit;

/*
* Simulating situation that needs many dependencies to be injected.
*/

public class OtherActivity extends AppCompatActivity {
    private static final String TAG = OtherActivity.class.getSimpleName();
    private TextView textView;

    @Inject
    DummyDependency dummyDependency;

    @Inject
    DummyPushLibrary dummyPushLibrary;

    @Inject
    OtherDependency otherDependency;

    @Inject
    Util util;

    @Inject
    Retrofit retrofit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        textView = findViewById(R.id.other_text);

        ((DaggerTutorialApp)getApplication()).getComponent()
                .otherActivityBuilder()
                .build()
                .inject(this);

        if(retrofit != null){
            Log.w(TAG, "retrofit not null!");
        }
        else{
            Log.w(TAG, "retrofit null!");
        }


    }
}