package my.com.toru.kapp.ui.main

import android.os.Bundle
import dagger.android.support.DaggerAppCompatActivity
import my.com.toru.kapp.R
import my.com.toru.kapp.util.DummyUtil
import my.com.toru.kapp.util.DummyUtil2
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var dummyUtil: DummyUtil

    @Inject
    lateinit var dummyUtil2: DummyUtil2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dummyUtil.testCode()
        dummyUtil2.testCode()

        supportFragmentManager.beginTransaction()
                .replace(R.id.main_frame, MainFragment.newInstance())
                .commit()
    }
}