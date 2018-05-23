package my.com.toru.kapp.util

import android.util.Log

class DummyUtil3 {
    init {
        Log.w("DummyUtil3", "initialized")
    }

    fun testCode(){
        Log.w("DummyUtil3", "testCode!!!!! ")
    }

    fun printTestCode() = "This is injected class by Dagger2,\nDI library by Google!"
}