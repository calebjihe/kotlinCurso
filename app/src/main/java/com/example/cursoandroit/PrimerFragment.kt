package com.example.cursoandroit

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.commit
import androidx.fragment.app.setFragmentResultListener

class PrimerFragment : Fragment(R.layout.fragment_primer) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
       // val texto = view.findViewById<TextView>(R.id.texto)
        val button = view.findViewById<Button>(R.id.btn_navegar)
        val resultado = view.findViewById<TextView>(R.id.txt_output)

        setFragmentResultListener("requestKey"){ key , bundle ->
            val result = bundle.getString("bundleKey")
            resultado.text = result
        }

        button.setOnClickListener {
            requireActivity().supportFragmentManager.commit {
                replace(R.id.fragment_container_view, SegundoFragment.newInstance("cALEB", 34))
                addToBackStack("primerFragmen")
            }
        }
    }
}