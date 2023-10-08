package com.proyectouvm.reductoconagua

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var btnAppConsumos: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initComponents()
        btnListeners()
    }

    private fun initComponents(){
        btnAppConsumos =findViewById(R.id.btnAppConsumos)
    }

    private fun navigateConsumos(){
        val intent = Intent(this, ConsumosActivity::class.java)
        startActivity(intent)
    }

    private fun btnListeners(){
        btnAppConsumos.setOnClickListener { navigateConsumos() }
    }
}