package my.com.toru.kapp.ui.main


import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dagger.android.support.DaggerFragment
import kotlinx.android.synthetic.main.fragment_main.*
import my.com.toru.kapp.R
import my.com.toru.kapp.ui.detail.DetailActivity
import my.com.toru.kapp.util.DummyUtil
import my.com.toru.kapp.util.DummyUtil2
import javax.inject.Inject

class MainFragment : DaggerFragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    @Inject
    lateinit var dummyUtil: DummyUtil

    @Inject
    lateinit var dummyUtil2: DummyUtil2

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        dummyUtil.testCode()
        dummyUtil2.testCode()

        txtMain.text = dummyUtil.testString() + "\n" + dummyUtil2.testString()

        btnGoOnNext.setOnClickListener {
            startActivity(Intent(activity, DetailActivity::class.java))
        }
    }
}