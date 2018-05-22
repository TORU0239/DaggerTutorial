package my.com.toru.kapp.ui.detail


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dagger.android.support.DaggerFragment
import kotlinx.android.synthetic.main.fragment_detail.*
import my.com.toru.kapp.R
import my.com.toru.kapp.util.DummyUtil3
import javax.inject.Inject


class DetailFragment : DaggerFragment() {

    @Inject
    lateinit var dummyUtil3: DummyUtil3

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dummyUtil3.testCode()
        txt_detail.text = dummyUtil3.printTestCode()
    }

    companion object {
        fun newInstance() = DetailFragment()
    }
}