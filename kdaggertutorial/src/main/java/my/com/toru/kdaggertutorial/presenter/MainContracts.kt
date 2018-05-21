package my.com.toru.kdaggertutorial.presenter

class MainContracts {

    interface MainView:BaseContracts.BaseView{
        fun onShowToast(str:String)
    }

    interface MainPresenter:BaseContracts.BasePrensenter

}