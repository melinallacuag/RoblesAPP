package com.example.roblesapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_factura.*

class FacturaFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_factura, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnsoles.setOnClickListener{
            val showsoles = SolesFragment()
            showsoles.show((activity as AppCompatActivity).supportFragmentManager,"Soles")
        }
        btngalones.setOnClickListener{
            val showgalones = GalonesFragment()
            showgalones.show((activity as AppCompatActivity).supportFragmentManager,"Galones")

        }

    }

}