package com.example.roblesapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.DialogFragment
import kotlinx.android.synthetic.main.fragment_boleta.*
import kotlinx.android.synthetic.main.fragment_boleta.view.*
import kotlinx.android.synthetic.main.fragment_boleta.view.btncancelarboleta
import kotlinx.android.synthetic.main.fragment_puntos_boleta.view.*
import kotlinx.android.synthetic.main.fragment_soles.view.*
import kotlinx.android.synthetic.main.fragment_soles.view.btncerrar


class PuntosBoletaFragment : DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var rootView: View = inflater.inflate(R.layout.fragment_puntos_boleta,container,false)

        rootView.btncerrar.setOnClickListener{
            dismiss()
        }

        rootView.btncancelarpuntoboleta.setOnClickListener{
            dismiss()
        }

        rootView.btnagregarpuntosboleta.setOnClickListener{

            Toast.makeText(context,"Agregar Puntos Boleta", Toast.LENGTH_LONG).show()
            dismiss()
        }
        return rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btntipopago.setOnClickListener{
            val showtipopago = TipoPagoFragment()
            showtipopago.show((activity as AppCompatActivity).supportFragmentManager,"Tipo Pago")
            showtipopago.setCancelable(false)
        }


    }

}