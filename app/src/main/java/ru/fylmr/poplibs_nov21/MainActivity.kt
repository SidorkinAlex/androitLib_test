package ru.fylmr.poplibs_nov21

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.fylmr.poplibs_nov21.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding
        get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()

        binding.helloWorldTextView.text = getString(R.string.app_name)
    }
}