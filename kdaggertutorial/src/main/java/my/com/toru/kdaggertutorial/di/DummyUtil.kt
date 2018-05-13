package my.com.toru.kdaggertutorial.di

import android.util.Log

class DummyUtil {
    init {
        Log.w(DummyUtil::class.java.simpleName, "DummyUtil constructed")
    }

    fun testCode():String = "This is my first dagger2 code!!"
}