package my.com.toru.kapp.ui.main

import android.content.Intent
import android.os.Bundle
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import my.com.toru.kapp.R
import my.com.toru.kapp.ui.detail.DetailActivity
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

        btn_goto_next.setOnClickListener {
            startActivity(Intent(this@MainActivity, DetailActivity::class.java))
        }
    }
}
