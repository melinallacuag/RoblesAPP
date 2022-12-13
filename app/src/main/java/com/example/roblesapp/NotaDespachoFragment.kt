package com.example.roblesapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.DialogFragment
import kotlinx.android.synthetic.main.fragment_factura.*
import kotlinx.android.synthetic.main.fragment_nota_despacho.*

class NotaDespachoFragment : DialogFragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_nota_despacho, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnbuscarcliente.setOnClickListener{
            val showbuscarcliente = BuscarClienteFragment()
            showbuscarcliente.show((activity as AppCompatActivity).supportFragmentManager,"Buscar Cliente")
        }
        btntipopago.setOnClickListener{
            val showtipopago = TipoPagoFragment()
            showtipopago.show((activity as AppCompatActivity).supportFragmentManager,"Tipo Pago")
        }

    }

}