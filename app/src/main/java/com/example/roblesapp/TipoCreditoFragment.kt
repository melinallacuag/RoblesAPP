package com.example.roblesapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import kotlinx.android.synthetic.main.fragment_tipo_credito.view.*
import kotlinx.android.synthetic.main.fragment_tipo_efectivo.view.*
import kotlinx.android.synthetic.main.fragment_tipo_pago.view.*
import kotlinx.android.synthetic.main.fragment_tipo_pago.view.btncerrar


class TipoCreditoFragment : DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val rootView: View = inflater.inflate(R.layout.fragment_tipo_credito,container,false)
        rootView.btncerrar.setOnClickListener{
            dismiss()
        }

        rootView.btncancelartipopagocredito.setOnClickListener{
            dismiss()
        }


        rootView.btnagregartipopagocredito.setOnClickListener{

            Toast.makeText(context,"Agregar Tipo Credito", Toast.LENGTH_LONG).show()
            dismiss()
        }


        return rootView
    }


}