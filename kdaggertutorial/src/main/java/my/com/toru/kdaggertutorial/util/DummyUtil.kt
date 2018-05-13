package my.com.toru.kdaggertutorial.util

import android.util.Log

class DummyUtil {
    init {
        Log.w(DummyUtil::class.java.simpleName, "DummyUtil constructed")
    }

    fun testCode():String = "This is my first dagger2 code!!"
}