package my.com.toru.kdaggertutorial.ui.detail

import my.com.toru.kdaggertutorial.presenter.DetailContracts

class DetailPresenterImp(val view:DetailContracts.DetailView): DetailContracts.DetailPresenter {
    override fun onSimulateNetwork() {
        view.onShowToast("Simulating!!")
    }
}