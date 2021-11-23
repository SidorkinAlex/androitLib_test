package ru.fylmr.poplibs_nov21

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.fylmr.poplibs_nov21.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding
        get() = _binding!!

    private val counters = mutableListOf(0, 0, 0)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCounter1.setOnClickListener {
            binding.btnCounter1.text = (++counters[0]).toString()
        }
        binding.btnCounter2.setOnClickListener {
            binding.btnCounter2.text = (++counters[1]).toString()
        }
        binding.btnCounter3.setOnClickListener {
            binding.btnCounter3.text = (++counters[2]).toString()
        }

        initViews()
    }

    private fun initViews() {
        binding.btnCounter1.text = counters[0].toString()
        binding.btnCounter2.text = counters[1].toString()
        binding.btnCounter3.text = counters[2].toString()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        outState.putIntArray("counters", counters.toIntArray())
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        val countersArray = savedInstanceState.getIntArray("counters") ?: return
        counters.clear()
        counters.addAll(countersArray.toList())

        initViews()
    }
}