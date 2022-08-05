package com.example.cartaovisitadio.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cartaovisitadio.databinding.ActivityAddCartaoVisitaBinding

class AddCartaoVisitaActivity : AppCompatActivity() {

    private val binding by lazy { ActivityAddCartaoVisitaBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        insertListeners()
    }

    private fun insertListeners(){
        binding.btnClose.setOnClickListener{
            finish()
        }
        binding.btnConfirm.setOnClickListener {

        }
    }
}