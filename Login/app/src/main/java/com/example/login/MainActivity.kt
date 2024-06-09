package com.example.login

import android.os.Bundle
import android.util.Log
import android.view.KeyEvent
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.login.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private  lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



   //     binding.button.setOnClickListener {

//            var email  = binding.emailAddress.text.toString();
//            var password  = binding.password.text.toString();
//            Log.i("MainActivity", "OnCreate: email $email , password : $password" , );
//
//            var message = getString(R.string.messageText,email,password);
//
//            showMessage(message)
//
//            Snackbar.make(it, message , Snackbar.LENGTH_INDEFINITE)
//                .setAction( "moreInfo") {showMessage(message)}
//                .show ();


 //       }
    }

//    private fun showMessage(message: String) {
//        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
//    }
}

