package com.carlosflores.ejercicio1

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.carlosflores.ejercicio1.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    private lateinit var binding : ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomeBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val username : String? = intent.getStringExtra("username")
        val password : String? = intent.getStringExtra("password")

        when {

            ( username == null || password == null ) -> {

                binding.textViewSaludo.text = "No existe información de usuario"

            }

            else -> {

                binding.textViewSaludo.text = "Hola " + username.toString() + ", tu contraseña es " + password.toString()

            }

        }

    }
}