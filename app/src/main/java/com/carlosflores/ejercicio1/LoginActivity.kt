package com.carlosflores.ejercicio1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.carlosflores.ejercicio1.Fragments.HomeFragment
import com.carlosflores.ejercicio1.databinding.ActivityLoginBinding
import com.google.android.material.snackbar.Snackbar

class LoginActivity : AppCompatActivity() {

    private lateinit var binding : ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.buttonLogin.setOnClickListener {

            /*
            * Validar si el texto de usuario y de contraseña no viene vacio
                si NO esta vacio, navegar al HomeActivity
                * Fragment
            * */

            var username : String? = binding.editTextUsuario.text.toString()
            var password : String? = binding.editTextContraseA.text.toString()

            if (username == "" || password == "" ) {

                Snackbar.make(binding.root, "Por favor, introduzca un usuario y una contraseña", 1000).show()

            }

            else {

                /*val intent = Intent(this, HomeActivity::class.java)
                intent.apply {

                    putExtra("username", username)
                    putExtra("password", password)

                }

                startActivity(intent)*/

                /*supportFragmentManager.commit {

                    setReorderingAllowed(true)
                    add<HomeFragment>(binding.fragmentContainer.id)

                }*/

                val builder = AlertDialog.Builder(this)
                builder.setTitle("Alerta")
                builder.setMessage("Esto es un fragment de alerta")
                builder.setPositiveButton("OK") { dialog, which ->

                }
                builder.setNegativeButton("Cancelar") { dialog, which ->

                }
                builder.create()
                builder.show()

            }


        }

    }
}