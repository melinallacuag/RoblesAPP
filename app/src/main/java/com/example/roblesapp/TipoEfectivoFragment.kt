package com.example.roblesapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import kotlinx.android.synthetic.main.fragment_tipo_efectivo.view.*
import kotlinx.android.synthetic.main.fragment_tipo_pago.view.*
import kotlinx.android.synthetic.main.fragment_tipo_pago.view.btncerrar
import kotlinx.android.synthetic.main.fragment_tipo_tarjeta.*
import kotlinx.android.synthetic.main.fragment_tipo_tarjeta.view.*


class TipoEfectivoFragment : DialogFragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView: View = inflater.inflate(R.layout.fragment_tipo_efectivo,container,false)
        rootView.btncerrar.setOnClickListener{
            dismiss()
        }

        rootView.btncancelartipopagoefectivo.setOnClickListener{
            dismiss()
        }


        rootView.btnagregartipopagoefectivo.setOnClickListener{

            Toast.makeText(context,"Agregar Tipo Efectivo", Toast.LENGTH_LONG).show()
            dismiss()
        }


        return rootView

    }

}