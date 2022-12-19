package com.example.roblesapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.FragmentManager
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_factura.*
import kotlinx.android.synthetic.main.fragment_tipo_pago.*
import kotlinx.android.synthetic.main.fragment_tipo_pago.view.*


class TipoPagoFragment : DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView: View = inflater.inflate(R.layout.fragment_tipo_pago,container,false)


        rootView.btncerrar.setOnClickListener{
            dismiss()
        }

        rootView.btncancelartipopago.setOnClickListener{
              dismiss()
          }





        return rootView


    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        radioEfectivo.setOnClickListener{
            val showradioEfectivo = TipoEfectivoFragment()
            showradioEfectivo.show((activity as AppCompatActivity).supportFragmentManager,"Tipo de Efectivo")
            showradioEfectivo.setCancelable(false)
        }

        radioTarjeta.setOnClickListener{
            val showradioTarjeta = TipoTarjetaFragment()
            showradioTarjeta.show((activity as AppCompatActivity).supportFragmentManager,"Tipo de Pago")
            showradioTarjeta.setCancelable(false)
        }

        radioCredito.setOnClickListener{
            val showradioCredito = TipoCreditoFragment()
            showradioCredito.show((activity as AppCompatActivity).supportFragmentManager,"Tipo de Credito")
            showradioCredito.setCancelable(false)
        }

    }


}