package com.erenkazancioglu.androidbootcampweek1.utilities

class Utilities{
    companion object {
        @JvmStatic fun <E> ArrayList<E>.indexAfterReverse(index: Int): Any{
            val reversed = arrayListOf<Any>()
            if(index == 0)//if index 0 will reverse the list
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
            return reversed
        }
    }
}