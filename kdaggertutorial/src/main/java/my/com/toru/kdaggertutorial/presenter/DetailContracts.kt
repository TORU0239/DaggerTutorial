package my.com.toru.kdaggertutorial.presenter

import android.content.Context

class DetailContracts {

    interface DetailView:BaseContracts.BaseView{
        fun onGetContext(): Context?
        fun onShowToast(str:String)
    }

    interface DetailPresenter:BaseContracts.BasePrensenter{
        fun onSimulateNetwork()
    }
}