package my.com.toru.kapp.ui.detail

import android.os.Bundle
import dagger.android.support.DaggerAppCompatActivity
import my.com.toru.kapp.R
import my.com.toru.kapp.util.DummyUtil3
import javax.inject.Inject

class DetailActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var dummyUtil3: DummyUtil3

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        dummyUtil3.testCode()

        supportFragmentManager.beginTransaction()
                .replace(R.id.detail_frame, DetailFragment.newInstance())
                .commit()
    }
}