package com.erenkazancioglu.androidbootcampweek1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.lang.RuntimeException

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val original = arrayListOf<Any>(0, 1, 2, 3, 4, 5,6,7,"eren")
        val reversed = original.andThenReverse(5)

        println(original)
        println(reversed)
    }

    private fun <E> ArrayList<E>.andThenReverse(index: Int): Any {
        val reversed = arrayListOf<Any>()
        try {
            if(index == 0)
                return this.reversed()
            if(index < 0 || index > this.size)
                throw Exception("index must be positive number and be within the list limits")

            val listSize = this.size
            var step : Int = 1
            for ( i in this.indices){
                if(index >= i){
                    reversed.add(this.indexOf(i).toString())
                }
                else{
                    reversed.add(this[listSize-step]!!)
                    step++
                }
            }
        }catch (exception: RuntimeException){
        }
        return reversed
    }
}