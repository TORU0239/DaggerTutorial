package my.com.toru.kdaggertutorial.ui.detail

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import my.com.toru.kdaggertutorial.R

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        supportActionBar?.title = "DetailActivity"
    }
}
