package my.com.toru.kapp.util

import android.util.Log

class DummyUtil {
    init {
        Log.w("DummyUtil", "initialized")
    }

    fun testCode(){
        Log.w("DummyUtil", "testCode!!!!! ")
    }

    fun testString() = "Welcome to Dagger2 World!!"
}