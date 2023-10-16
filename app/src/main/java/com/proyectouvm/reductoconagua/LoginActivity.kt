package com.proyectouvm.reductoconagua

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    private lateinit var btnLogin:Button
    private  lateinit var btnRegistro:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        initComponentes()
        btnListeners()
    }

    private fun initComponentes(){
        btnLogin = findViewById(R.id.btnLogin)
        btnRegistro = findViewById(R.id.btnRegistro)
    }

    private fun navigateMain(){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    private fun navigateRegistro(){
        val intent = Intent(this, RegistroActivity::class.java)
        startActivity(intent)
    }

    private fun btnListeners(){
        btnLogin.setOnClickListener { navigateMain() }
        btnRegistro.setOnClickListener { navigateRegistro() }
    }
}