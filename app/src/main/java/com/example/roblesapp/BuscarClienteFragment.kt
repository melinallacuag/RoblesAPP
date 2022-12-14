package com.example.roblesapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import kotlinx.android.synthetic.main.fragment_boleta.view.*
import kotlinx.android.synthetic.main.fragment_buscar_cliente.view.*
import kotlinx.android.synthetic.main.fragment_soles.view.*
import kotlinx.android.synthetic.main.fragment_soles.view.btncerrar


class BuscarClienteFragment : DialogFragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        var rootView: View = inflater.inflate(R.layout.fragment_buscar_cliente,container,false)

        rootView.btncerrar.setOnClickListener{
            dismiss()
        }

        rootView.btncancelarseleccioncliente.setOnClickListener{
            dismiss()
        }

        rootView.btnagregarcliente.setOnClickListener{

            Toast.makeText(context,"Agregar Cliente", Toast.LENGTH_LONG).show()
            dismiss()
        }
        return rootView
    }


}