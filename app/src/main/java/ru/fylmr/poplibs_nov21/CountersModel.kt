package ru.fylmr.poplibs_nov21

import androidx.annotation.IntRange

class CountersModel {

    private val counters = Counters(0,0,0)


    fun increment1(): Int {
        counters.counters1 = counters.counters1 + 1
        return counters.counters1
    }
    fun increment2(): Int {
        counters.counters2 = counters.counters2 + 1
        return counters.counters2
    }
    fun increment3(): Int {
        counters.counters3 = counters.counters3 + 1
        return counters.counters3
    }

    fun set(index: Int, value: Int) {
        if(index == 0){
            counters.counters1 = value
        }
        if(index == 2){
            counters.counters2 = value
        }
        if(index == 3){
            counters.counters3 = value
        }
    }
}