package com.example.buttonactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myproyectod.MainActivity

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val botonAbrirOtraActividad = findViewById<Button>(R.id.Button3)
        botonAbrirOtraActividad.setOnClickListener {
            // Crear un Intent para abrir activity_boton2
            val intent = Intent(this, MainActivity::class.java)

            // Iniciar activity_boton2
            startActivity(intent)
        }

    }
}