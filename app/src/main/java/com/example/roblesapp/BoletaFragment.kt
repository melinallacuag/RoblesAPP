package com.example.roblesapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.DialogFragment
import kotlinx.android.synthetic.main.fragment_boleta.*
import kotlinx.android.synthetic.main.fragment_boleta.view.*
import kotlinx.android.synthetic.main.fragment_nota_despacho.*
import kotlinx.android.synthetic.main.fragment_nota_despacho.btntipopago
import kotlinx.android.synthetic.main.fragment_soles.*
import kotlinx.android.synthetic.main.fragment_soles.view.*
import kotlinx.android.synthetic.main.fragment_soles.view.btncerrar


class BoletaFragment : DialogFragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        var rootView: View = inflater.inflate(R.layout.fragment_boleta,container,false)

        rootView.btncerrar.setOnClickListener{
            dismiss()
        }

        rootView.btncancelarboleta.setOnClickListener{
            dismiss()
        }

        rootView.btnagregarboleta.setOnClickListener{

            Toast.makeText(context,"Agregar Boleta", Toast.LENGTH_LONG).show()
            dismiss()
        }
        rootView.btngenerarcliente.setOnClickListener{

            Toast.makeText(context,"Cliente Generado", Toast.LENGTH_LONG).show()
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

        btngenerarcliente.setOnClickListener{
            val showgenerarcliente = DetalleClienteGeneradoFragment()
            showgenerarcliente.show((activity as AppCompatActivity).supportFragmentManager,"Tipo Pago")
            showgenerarcliente.setCancelable(false)
        }

    }
}