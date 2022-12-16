package com.example.roblesapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import kotlinx.android.synthetic.main.fragment_boleta.view.*
import kotlinx.android.synthetic.main.fragment_detalle_cliente_generado.*
import kotlinx.android.synthetic.main.fragment_detalle_cliente_generado.view.*
import kotlinx.android.synthetic.main.fragment_soles.*
import kotlinx.android.synthetic.main.fragment_soles.view.*
import kotlinx.android.synthetic.main.fragment_soles.view.btncerrar


class DetalleClienteGeneradoFragment : DialogFragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var rootView: View = inflater.inflate(R.layout.fragment_detalle_cliente_generado,container,false)

        rootView.btncerrar.setOnClickListener{
            dismiss()
        }

        rootView.btncancelarclientegenerado.setOnClickListener{
            dismiss()
        }

        rootView.btnagregarclientegenerado.setOnClickListener{

            Toast.makeText(context,"Agregar Boleta Generado", Toast.LENGTH_LONG).show()
            dismiss()
        }

        return rootView
    }

}