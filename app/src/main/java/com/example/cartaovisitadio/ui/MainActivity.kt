package com.example.cartaovisitadio.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cartaovisitadio.R
import com.example.cartaovisitadio.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy{ActivityMainBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}