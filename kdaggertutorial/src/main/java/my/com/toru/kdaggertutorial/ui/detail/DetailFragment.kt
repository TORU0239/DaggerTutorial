package my.com.toru.kdaggertutorial.ui.detail

import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import my.com.toru.kdaggertutorial.R
import my.com.toru.kdaggertutorial.util.DetailUtil
import my.com.toru.kdaggertutorial.util.DummyUtil
import javax.inject.Inject


class DetailFragment : Fragment() {

    @Inject
    lateinit var util: DummyUtil

    @Inject
    lateinit var detailUtil: DetailUtil


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity as DetailActivity).activityComponent.detailFragmentBuilder()
                .build()
                .inject(this@DetailFragment)
        Log.w("DetailActivity", util.testCode())
        Log.w("DetailActivity", detailUtil.testCode())
    }

    companion object {
        @JvmStatic
        fun newInstance() = DetailFragment()
    }
}
