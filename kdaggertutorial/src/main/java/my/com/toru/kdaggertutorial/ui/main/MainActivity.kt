package my.com.toru.kdaggertutorial.ui.main

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import my.com.toru.kdaggertutorial.R
import my.com.toru.kdaggertutorial.app.KDaggerTutorialApp
import my.com.toru.kdaggertutorial.di.DummyUtil
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var testclass: DummyUtil

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (application as KDaggerTutorialApp)
                .appComponent.mainActivityBuilder()
                .build()
                .inject(this)

        Log.w(MainActivity::class.java.simpleName, testclass.testCode())
    }
}