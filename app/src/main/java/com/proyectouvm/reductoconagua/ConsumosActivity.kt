package com.proyectouvm.reductoconagua

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ConsumosActivity : AppCompatActivity() {
    private lateinit var btnAppConsumosUno: Button
    private lateinit var btnAppConsumosDos: Button
    private lateinit var btnAppConsumosTres: Button
    private lateinit var btnAppConsumosCuatro: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_consumos)
        initComponents()
        btnListeners()
    }

   private fun initComponents(){
        btnAppConsumosUno = findViewById(R.id.btnConsumoUno)
        btnAppConsumosDos = findViewById(R.id.btnConsumoDos)
        btnAppConsumosTres = findViewById(R.id.btnConsumoTres)
       btnAppConsumosCuatro = findViewById(R.id.btnConsumoCuatro)
    }

    private fun navigateConsumoUno(){
        val intent = Intent(this, FormActivity::class.java)
        startActivity(intent)
    }

    private fun navigateConsumodos(){
        val intent = Intent(this, FormActivity::class.java)
        startActivity(intent)
    }

    private fun navigateConsumoTres(){
        val intent = Intent(this, FormActivity::class.java)
        startActivity(intent)
    }
    private fun navigateConsumoCuatro(){
        val intent = Intent(this, FormActivity::class.java)
        startActivity(intent)
    }

    private fun btnListeners(){
        btnAppConsumosUno.setOnClickListener { navigateConsumoUno() }
        btnAppConsumosDos.setOnClickListener { navigateConsumodos() }
        btnAppConsumosTres.setOnClickListener { navigateConsumoTres() }
        btnAppConsumosCuatro.setOnClickListener { navigateConsumoCuatro() }
    }

    private fun btnListenerDos(){

    }


}