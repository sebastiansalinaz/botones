package com.example.myproyectod

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.buttonactivity.MainActivity3
import com.example.buttonactivity.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // funcion para manejar  el boton
        val containedButton = findViewById<Button>(R.id.outlinedButton)
        containedButton.setOnClickListener {
            val mensaje = "El botón fue presionado"

            val intent = Intent(this,MainActivity3::class.java)
            Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show()
        }
        ////////////////////////



        ////////////////// segunda funcion de boton
        val outlinedButton = findViewById<Button>(R.id.outlinedButton)
        outlinedButton.setOnClickListener{
            val mensaje = "El botón segundo fue presionado"
            Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show()
        }
        ///////////

////////// tercer boton
        val textButton = findViewById<Button>(R.id.outlinedButton)
        textButton.setOnClickListener{
            val mensaje = "El botón tercer fue presionado"
            Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show()
        }
    }
}


