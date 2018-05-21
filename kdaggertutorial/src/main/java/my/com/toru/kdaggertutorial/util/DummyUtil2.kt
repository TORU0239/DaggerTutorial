package my.com.toru.kdaggertutorial.util

import android.util.Log

class DummyUtil2 {
    init {
        Log.w(DummyUtil2::class.java.simpleName, "DummyUtil2 constructed")
    }

    fun testCode():String = "This is my first dagger2 code!!"
}