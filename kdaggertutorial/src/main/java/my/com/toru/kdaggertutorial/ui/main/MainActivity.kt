package my.com.toru.kdaggertutorial.ui.main

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import my.com.toru.kdaggertutorial.R
import my.com.toru.kdaggertutorial.app.KDaggerTutorialApp
import my.com.toru.kdaggertutorial.util.DummyUtil
import my.com.toru.kdaggertutorial.ui.detail.DetailActivity
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

        main_btn.setOnClickListener{
            startActivity(Intent(this@MainActivity, DetailActivity::class.java))
        }
    }
}