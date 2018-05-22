package my.com.toru.kapp.ui.detail

import android.os.Bundle
import dagger.android.support.DaggerAppCompatActivity
import my.com.toru.kapp.R

class DetailActivity : DaggerAppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        supportFragmentManager.beginTransaction()
                .replace(R.id.detail_frame, DetailFragment.newInstance())
                .commit()
    }
}