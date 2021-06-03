package com.example.cursoandroit

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class SegundaActivity : AppCompatActivity() {
    private var nombre: String? = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        val boton1 = findViewById<Button>(R.id.btn_accion)
        val texto = findViewById<TextView>(R.id.txt_output)
        intent.extras?.let { bundle ->
            nombre = bundle.getString("nombre")
        }
        texto.text= nombre
        boton1.setOnClickListener {
            val intent =Intent()
            intent.putExtra("nombre2","Hola desde segunda activity")
            setResult(Activity.RESULT_OK, intent)
            //navegarMainActivity()
            finish()

        }
        Log.d("Lifecycle", "onCreate: ")
    }
    private fun navegarMainActivity(){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}
