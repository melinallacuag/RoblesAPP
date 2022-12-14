package com.example.roblesapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import kotlinx.android.synthetic.main.fragment_tipo_pago.*
import kotlinx.android.synthetic.main.fragment_tipo_pago.view.*
import kotlinx.android.synthetic.main.fragment_tipo_pago.view.btncerrar
import kotlinx.android.synthetic.main.fragment_tipo_tarjeta.*
import kotlinx.android.synthetic.main.fragment_tipo_tarjeta.view.*


class TipoTarjetaFragment : DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView: View = inflater.inflate(R.layout.fragment_tipo_tarjeta,container,false)
        rootView.btncerrar.setOnClickListener{
            dismiss()
        }

        rootView.btncancelarTajetatipo.setOnClickListener{
            dismiss()
        }


        rootView.btnagregarTarjetatipo.setOnClickListener{

            val selectdId = tipotarjetaradio.checkedRadioButtonId
            val radio = rootView.findViewById<RadioButton>(selectdId)

            var ratingR = radio.text.toString()

            Toast.makeText(context,"Agregar: $ratingR", Toast.LENGTH_LONG).show()
            dismiss()
        }


        return rootView
    }

}