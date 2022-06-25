package com.example.prctica1wearos

import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import com.example.prctica1wearos.databinding.ActivityMainBinding

class MainActivity : Activity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //asignando un valor
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //anterior
        /*var leyenda=findViewById<TextView>(R.id.text)
        leyenda.text="Saludos desde acá"*/
        //binding.text.text="UTSELVA"
        binding.btnOk.setOnClickListener {
            Toast.makeText(this, "Aceptar", Toast.LENGTH_SHORT).show()
        }
        binding.btnCancelar.setOnClickListener { //accion clic del boton
            Toast.makeText(this, "Adios", Toast.LENGTH_SHORT).show()
            System.exit(0)//cerrar la aplicación
        }
    }
}