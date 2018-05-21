package my.com.toru.kdaggertutorial.ui.detail

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import my.com.toru.kdaggertutorial.R
import my.com.toru.kdaggertutorial.presenter.DetailContracts
import my.com.toru.kdaggertutorial.util.DetailUtil
import my.com.toru.kdaggertutorial.util.DummyUtil
import javax.inject.Inject


class DetailFragment : Fragment(), DetailContracts.DetailView {

//    @Inject
//    lateinit var util: DummyUtil
//
//    @Inject
//    lateinit var detailUtil: DetailUtil

    private val presenter:DetailPresenterImp by lazy {
        DetailPresenterImp(this@DetailFragment)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? = inflater.inflate(R.layout.fragment_detail, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity as DetailActivity).activityComponent.detailFragmentBuilder()
                .build()
                .inject(this@DetailFragment)
//        Log.w("DetailActivity", util.testCode())
//        Log.w("DetailActivity", detailUtil.testCode())

        presenter.onSimulateNetwork()
    }

    companion object {
        @JvmStatic
        fun newInstance() = DetailFragment()
    }

    override fun onGetContext(): Context? = context

    override fun onShowToast(str: String) {
        Toast.makeText(context, str, Toast.LENGTH_SHORT).show()
    }
}