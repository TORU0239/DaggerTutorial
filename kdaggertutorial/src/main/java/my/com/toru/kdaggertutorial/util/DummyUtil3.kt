package my.com.toru.kdaggertutorial.util

import android.util.Log

class DummyUtil3 {
    init {
        Log.w(DummyUtil3::class.java.simpleName, "DummyUtil3 constructed")
    }

    fun testCode():String = "This is my first dagger2 code!!"
}