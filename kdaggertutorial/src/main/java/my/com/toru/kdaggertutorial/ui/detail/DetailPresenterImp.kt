package my.com.toru.kdaggertutorial.ui.detail

import android.util.Log
import my.com.toru.kdaggertutorial.di.DaggerDetailFragmentComponent
import my.com.toru.kdaggertutorial.presenter.DetailContracts
import my.com.toru.kdaggertutorial.util.DetailUtil
import my.com.toru.kdaggertutorial.util.DummyUtil
import javax.inject.Inject

class DetailPresenterImp(val view:DetailContracts.DetailView): DetailContracts.DetailPresenter {

    @Inject
    lateinit var test:DummyUtil

    @Inject
    lateinit var test2:DetailUtil

    init {
        DaggerDetailFragmentComponent.builder().build()
                .detailPresenerComponentBuilder()
                .build()
                .inject(this@DetailPresenterImp)
    }

    override fun onSimulateNetwork() {
        view.onShowToast("Simulating!!")
        Log.w("DetailPresenter", test.testCode())
        Log.w("DetailPresenter", test2.testCode())
    }
}