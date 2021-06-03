package com.example.cursoandroit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val texto = findViewById<TextView>(R.id.txt_output)


        val boton1 =findViewById<Button>(R.id.btn_accion)
        boton1.setOnClickListener {
            texto.text = "Curso androit"
        }
        Log.d("Lifecycle", "onCreate: ")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Lifecycle", "onStart: ")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Lifecycle", "onResume: ")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Lifecycle", "onPause: ")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Lifecycle", "onStop: ")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Lifecycle", "onRestart: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Lifecycle", "onDestroy: ")
    }
}