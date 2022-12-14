package com.example.roblesapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.DialogFragment
import kotlinx.android.synthetic.main.fragment_factura.*
import kotlinx.android.synthetic.main.fragment_facturacion.view.*
import kotlinx.android.synthetic.main.fragment_nota_despacho.*
import kotlinx.android.synthetic.main.fragment_nota_despacho.view.*
import kotlinx.android.synthetic.main.fragment_soles.view.*
import kotlinx.android.synthetic.main.fragment_soles.view.btncerrar

class NotaDespachoFragment : DialogFragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var rootView: View = inflater.inflate(R.layout.fragment_nota_despacho,container,false)

        rootView.btncerrar.setOnClickListener{
            dismiss()
        }

        rootView.btncancelarndespacho.setOnClickListener{
            dismiss()
        }

        rootView.btnagregarndespacho.setOnClickListener{

            Toast.makeText(context,"Agregar Nota Despacho", Toast.LENGTH_LONG).show()
            dismiss()
        }
        return rootView
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