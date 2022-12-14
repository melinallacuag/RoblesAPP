package com.example.roblesapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import kotlinx.android.synthetic.main.fragment_eliminar_operaciones.view.*
import kotlinx.android.synthetic.main.fragment_soles.*
import kotlinx.android.synthetic.main.fragment_soles.view.*
import kotlinx.android.synthetic.main.fragment_tipo_pago.view.*
import kotlinx.android.synthetic.main.fragment_tipo_pago.view.btncerrar


class EliminarOperacionesFragment : DialogFragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        var rootView: View = inflater.inflate(R.layout.fragment_eliminar_operaciones,container,false)

        rootView.btncerrar.setOnClickListener{
            dismiss()
        }

        rootView.btneliminarcancelar.setOnClickListener{
            dismiss()
        }

        rootView.btneliminaraceptar.setOnClickListener{


            Toast.makeText(context,"Se elimino la Facturación", Toast.LENGTH_LONG).show()
            dismiss()
        }
        return rootView
    }

}