package com.example.calender3

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.calender3.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private  lateinit var binding: ActivityMainBinding;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater);
        val view =  binding.root;
        setContentView(view)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
                 insets
        }

        addSomeViews(count = 3) ;
    }

    fun addSomeViews (count : Int ){

        for (i in 1..count) {

            val textView =  TextView(this);
            textView.text = "Hey learner $i " ;
            textView.textSize = 20f ;
            binding.myLayout.addView(textView);
        }

        val button  = Button(this)
        button.text = "Click Me"
        findViewById<LinearLayout>(R.id.my_layout).addView(button);

    }
}