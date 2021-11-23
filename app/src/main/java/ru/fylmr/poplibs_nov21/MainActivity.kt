package ru.fylmr.poplibs_nov21

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import ru.fylmr.poplibs_nov21.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), MainView {

    private var _binding: ActivityMainBinding? = null
    private val binding
        get() = _binding!!

    private val presenter = MainPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listener = View.OnClickListener { view ->
            presenter.counterClick(view.id)
        }

        binding.btnCounter1.setOnClickListener(listener)
        binding.btnCounter2.setOnClickListener(listener)
        binding.btnCounter3.setOnClickListener(listener)
    }

    override fun setButtonText(index: Int, text: String) = when (index) {
        0 -> binding.btnCounter1.text = text
        1 -> binding.btnCounter2.text = text
        2 -> binding.btnCounter3.text = text
        else -> error("Неверный индекс")
    }
}