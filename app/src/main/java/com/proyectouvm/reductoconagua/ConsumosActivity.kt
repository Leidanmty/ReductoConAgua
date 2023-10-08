package com.proyectouvm.reductoconagua

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ConsumosActivity : AppCompatActivity() {
    private lateinit var btnAppConsumosUno: Button
    private lateinit var btnAppConsumosDos: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_consumos)
        initComponents()
        btnListenerUno()
        btnListenerDos()
    }

   private fun initComponents(){
        btnAppConsumosUno = findViewById(R.id.btnConsumoUno)
        btnAppConsumosDos = findViewById(R.id.btnConsumoDos)
    }

    private fun navigateConsumoUno(){
        val intent = Intent(this, FormActivity::class.java)
        startActivity(intent)
    }

    private fun navigateConsumodos(){
        val intent = Intent(this, FormActivity::class.java)
        startActivity(intent)
    }

    private fun btnListenerUno(){
        btnAppConsumosUno.setOnClickListener { navigateConsumoUno() }
    }

    private fun btnListenerDos(){
        btnAppConsumosDos.setOnClickListener { navigateConsumodos() }
    }


}