package com.example.roblesapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.DialogFragment
import kotlinx.android.synthetic.main.fragment_nota_despacho.*
import kotlinx.android.synthetic.main.fragment_puntos.*
import kotlinx.android.synthetic.main.fragment_puntos.view.*
import kotlinx.android.synthetic.main.fragment_tipo_pago.*
import kotlinx.android.synthetic.main.fragment_tipo_pago.view.*
import kotlinx.android.synthetic.main.fragment_tipo_pago.view.btncerrar


class PuntosFragment : DialogFragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var rootView: View = inflater.inflate(R.layout.fragment_puntos,container,false)


        rootView.btncerrar.setOnClickListener{
            dismiss()
        }

        rootView.btncancelarpuntos.setOnClickListener{
            dismiss()
        }

        return rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnboletatarjeta.setOnClickListener{
            val boletatarjeta = BoletaFragment()
            boletatarjeta.show((activity as AppCompatActivity).supportFragmentManager,"Tipo Pago")
            boletatarjeta.setCancelable(false)
        }

        btnfacturatarjeta.setOnClickListener{
            val showfacturatarjeta = FacturacionFragment()
            showfacturatarjeta.show((activity as AppCompatActivity).supportFragmentManager,"Tipo Pago")
            showfacturatarjeta.setCancelable(false)
        }

    }


}