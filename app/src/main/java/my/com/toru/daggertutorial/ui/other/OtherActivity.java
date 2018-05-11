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

        // TODO: deprecating below, in order to follow guideline from Google, enabling unnecessary injecting module.
        ((DaggerTutorialApp)getApplication()).getComponent()
                .otherActivityBuilder()
                .build()
                .inject(this);
        // COMMENT: Developers can change and improve above with using AndroidDagger element.

        checkIfInjectedWell();
    }

    private void checkIfInjectedWell(){
        String injectionResult = "";

        if(retrofit != null){
            Log.w(TAG, "retrofit not null!");
            injectionResult = injectionResult.concat("retrofit not null!").concat("\n");
        }
        else{
            Log.w(TAG, "retrofit null!");
            injectionResult = injectionResult.concat("retrofit null!").concat("\n");
        }

        if(dummyDependency != null){
            Log.w(TAG, "dummyDependency not null!");
            injectionResult = injectionResult.concat("dummyDependency not null!").concat("\n");
        }
        else{
            Log.w(TAG, "dummyDependency null!");
            injectionResult = injectionResult.concat("dummyDependency null!").concat("\n");
        }

        if(dummyPushLibrary != null){
            Log.w(TAG, "dummyPushLibrary not null!");
            injectionResult = injectionResult.concat("dummyPushLibrary not null!").concat("\n");
        }
        else{
            Log.w(TAG, "dummyPushLibrary null!");
            injectionResult = injectionResult.concat("dummyPushLibrary null!").concat("\n");
        }

        if(otherDependency != null){
            Log.w(TAG, "otherDependency not null!");
            injectionResult = injectionResult.concat("otherDependency not null!").concat("\n");
        }
        else{
            Log.w(TAG, "otherDependency null!");
            injectionResult = injectionResult.concat("otherDependency null!").concat("\n");
        }

        if(util != null){
            Log.w(TAG, "util not null!");
            injectionResult = injectionResult.concat("util not null!").concat("\n");
        }
        else{
            Log.w(TAG, "util null!");
            injectionResult = injectionResult.concat("util null!").concat("\n");
        }

        textView.setText(injectionResult);
    }
}