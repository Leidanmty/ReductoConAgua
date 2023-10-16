package com.proyectouvm.reductoconagua

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegistroActivity : AppCompatActivity() {
    private lateinit var btnRegistroCompleto:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)
        initComponents()
        btnListener()
    }

    private fun initComponents(){
        btnRegistroCompleto = findViewById(R.id.btnRegistroCompleto)
    }

    private fun navigateMain(){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    private fun btnListener(){
        btnRegistroCompleto.setOnClickListener { navigateMain() }
    }
}