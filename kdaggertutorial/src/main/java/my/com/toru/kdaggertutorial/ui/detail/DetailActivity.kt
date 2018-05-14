package my.com.toru.kdaggertutorial.ui.detail

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_detail.*
import my.com.toru.kdaggertutorial.R
import my.com.toru.kdaggertutorial.app.KDaggerTutorialApp
import my.com.toru.kdaggertutorial.di.ActivityComponent
import my.com.toru.kdaggertutorial.di.DaggerActivityComponent
import my.com.toru.kdaggertutorial.util.DetailUtil
import my.com.toru.kdaggertutorial.util.DummyUtil
import javax.inject.Inject

class DetailActivity : AppCompatActivity() {

    val activityComponent:ActivityComponent by lazy {
        DaggerActivityComponent.builder().build()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        supportActionBar?.title = "DetailActivity"
        supportFragmentManager.beginTransaction()
                .replace(R.id.detail_frame, DetailFragment.newInstance())
                .commit()
    }
}
