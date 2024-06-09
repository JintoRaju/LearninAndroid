package com.example.login

import android.os.Bundle
import android.util.Log
import android.view.KeyEvent
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.login.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private  lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        //binding.button.setOnKeyListener( );


       // View.OnKeyListener l = ;
        binding.button.setOnKeyListener { view: View, i: Int, keyEvent: KeyEvent ->
            val email = binding.editTextTextEmailAddress.text.toString();
            val password = binding.editTextNumberPassword.text.toString();

           Log.i("MainActivity", "OnCreate: email $email , password : $password i = $i" , );
           return@setOnKeyListener true;
        }


        binding.button.setOnClickListener {
            val email = binding.editTextTextEmailAddress.text.toString();
            val password = binding.editTextNumberPassword.text.toString();
            Log.i("MainActivity", "OnCreate: email $email , password : $password" , );
        }
    }
}

