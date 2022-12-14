package com.example.roblesapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import kotlinx.android.synthetic.main.fragment_canje.view.*
import kotlinx.android.synthetic.main.fragment_canje.view.btncancelarcanje
import kotlinx.android.synthetic.main.fragment_galones.*
import kotlinx.android.synthetic.main.fragment_galones.view.*
import kotlinx.android.synthetic.main.fragment_lista_canje_producto.view.*
import kotlinx.android.synthetic.main.fragment_tipo_pago.view.*
import kotlinx.android.synthetic.main.fragment_tipo_pago.view.btncerrar


class ListaCanjeProductoFragment : DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var rootView: View = inflater.inflate(R.layout.fragment_lista_canje_producto,container,false)


        rootView.btncerrar.setOnClickListener{
            dismiss()
        }

        rootView.btncancelarcanje.setOnClickListener{
            dismiss()
        }
        rootView.btnagregarclientecanje.setOnClickListener{


            Toast.makeText(context,"Canje:", Toast.LENGTH_LONG).show()
            dismiss()
        }

        return rootView
    }


}