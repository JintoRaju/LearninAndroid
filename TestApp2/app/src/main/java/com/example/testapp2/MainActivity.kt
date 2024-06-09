package com.example.testapp2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import com.example.testapp2.databinding.ActivityMainBinding

//import com.example.testapp2.da

class MainActivity : ComponentActivity() {

    private  lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.textView2.text = getString(R.string.middle)

    }
}
