package my.com.toru.kapp.util

import android.util.Log

class SingletonUtil {
    init {
        Log.w("Singleton", "This is Singleton test util class!!")
    }

    fun test(){
        Log.w("SingletonUtil", "test method for singleton")
    }
}