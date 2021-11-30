package ru.fylmr.poplibs_nov21

import androidx.annotation.IdRes

class MainPresenter(
    private val view: MainView
) {

    private val model = CountersModel()

    fun counter1Click() {
            val nextValue = model.increment1()
            view.setButton1Text(nextValue.toString())
    }
    fun counter2Click() {
        val nextValue = model.increment2()
        view.setButton2Text(nextValue.toString())
    }
    fun counter3Click() {
        val nextValue = model.increment3()
        view.setButton3Text(nextValue.toString())
    }
}