package com.example.roblesapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.DialogFragment
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_factura.*
import kotlinx.android.synthetic.main.fragment_tipo_pago.*
import kotlinx.android.synthetic.main.fragment_tipo_pago.view.*


class TipoPagoFragment : DialogFragment() {

lateinit var campoP:EditText
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var rootView: View = inflater.inflate(R.layout.fragment_tipo_pago,container,false)


        rootView.btncerrar.setOnClickListener{
            dismiss()
        }

        rootView.btncancelartipopago.setOnClickListener{
              dismiss()
          }

        rootView.btnagregartipopago.setOnClickListener{

            val selectdId = ratiodd.checkedRadioButtonId
            val radio = rootView.findViewById<RadioButton>(selectdId)

            var ratingR = radio.text.toString()

            Toast.makeText(context,"Agregar: $ratingR",Toast.LENGTH_LONG).show()
            dismiss()
        }


        return rootView


    }



}