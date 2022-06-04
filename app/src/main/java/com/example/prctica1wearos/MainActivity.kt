package com.example.prctica1wearos

import android.app.Activity
import android.os.Bundle
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
    }
}