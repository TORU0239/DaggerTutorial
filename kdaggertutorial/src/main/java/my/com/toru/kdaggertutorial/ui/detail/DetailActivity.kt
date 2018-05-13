package my.com.toru.kdaggertutorial.ui.detail

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import my.com.toru.kdaggertutorial.R
import my.com.toru.kdaggertutorial.app.KDaggerTutorialApp
import my.com.toru.kdaggertutorial.util.DetailUtil
import my.com.toru.kdaggertutorial.util.DummyUtil
import javax.inject.Inject

class DetailActivity : AppCompatActivity() {

    @Inject
    lateinit var util: DummyUtil

    @Inject
    lateinit var detailUtil: DetailUtil

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        supportActionBar?.title = "DetailActivity"

        (application as KDaggerTutorialApp).appComponent
                .detailActivityBuilder()
                .build()
                .inject(this)

        Log.w("DetailActivity", util.testCode())
        Log.w("DetailActivity", detailUtil.testCode())
    }
}
