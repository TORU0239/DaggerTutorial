package my.com.toru.kdaggertutorial.di

import android.util.Log

class TestClass {
    init {
        Log.w(TestClass::class.java.simpleName, "TestClass constructed")
    }
}