package com.erenkazancioglu.androidbootcampweek1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.erenkazancioglu.androidbootcampweek1.utilities.Utilities.Companion.indexAfterReverse

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val original = arrayListOf<Any>(0, 1, 2, 3, 4, 5,6,7,"eren")
        val reversed = original.indexAfterReverse(6)

        println(original)
        println(reversed)
    }
}