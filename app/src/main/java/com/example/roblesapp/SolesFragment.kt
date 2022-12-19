package com.example.roblesapp

import android.os.Bundle
import android.text.InputFilter
import android.text.Spanned
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import kotlinx.android.synthetic.main.fragment_soles.*
import kotlinx.android.synthetic.main.fragment_soles.view.*
import kotlinx.android.synthetic.main.fragment_tipo_pago.*
import kotlinx.android.synthetic.main.fragment_tipo_pago.view.*
import kotlinx.android.synthetic.main.fragment_tipo_pago.view.btncerrar
import java.io.BufferedReader
import java.io.Console
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL
import android.util.Log
import java.net.ConnectException

class SolesFragment : DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var rootView: View = inflater.inflate(R.layout.fragment_soles,container,false)

        rootView.btncerrar.setOnClickListener{
            dismiss()
        }
        rootView.btncancelarsoles.setOnClickListener{
            dismiss()
        }
        rootView.btnagregarsoles.setOnClickListener{
            dismiss()
        }
        return rootView

    }


}