package com.example.roblesapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import kotlinx.android.synthetic.main.fragment_galones.*
import kotlinx.android.synthetic.main.fragment_galones.view.*
import kotlinx.android.synthetic.main.fragment_soles.*
import kotlinx.android.synthetic.main.fragment_soles.view.*
import kotlinx.android.synthetic.main.fragment_soles.view.btncerrar


class GalonesFragment : DialogFragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var rootView: View = inflater.inflate(R.layout.fragment_galones,container,false)

        rootView.btncerrar.setOnClickListener{
            dismiss()
        }

        rootView.btncancelargalones.setOnClickListener{
            dismiss()
        }

        rootView.btnagregargalones.setOnClickListener{

            val galonesId = inputmontogalones.id
            val galones = rootView.findViewById<EditText>(galonesId)

            var totalgalones = galones.text.toString()

            Toast.makeText(context,"Monto Galones: $totalgalones", Toast.LENGTH_LONG).show()
            dismiss()
        }
        return rootView

    }


}