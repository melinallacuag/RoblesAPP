package com.example.roblesapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import kotlinx.android.synthetic.main.fragment_libre.view.*
import kotlinx.android.synthetic.main.fragment_soles.*
import kotlinx.android.synthetic.main.fragment_soles.view.*
import kotlinx.android.synthetic.main.fragment_soles.view.btncerrar


class LibreFragment : DialogFragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        var rootView: View = inflater.inflate(R.layout.fragment_libre, container, false)

        rootView.btncerrar.setOnClickListener {
            dismiss()
        }

        rootView.btncancelarlibre.setOnClickListener {
            dismiss()
        }
        return rootView
    }

}