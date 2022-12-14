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
        btnlibre.setOnClickListener{
            val showlibre = LibreFragment()
            showlibre.show((activity as AppCompatActivity).supportFragmentManager,"Soles")
            showlibre.setCancelable(false)
        }
        btnsoles.setOnClickListener{
            val showsoles = SolesFragment()
            showsoles.show((activity as AppCompatActivity).supportFragmentManager,"Soles")
            showsoles.setCancelable(false)
        }
        btngalones.setOnClickListener{
            val showgalones = GalonesFragment()
            showgalones.show((activity as AppCompatActivity).supportFragmentManager,"Galones")
            showgalones.setCancelable(false)
        }
        btnboleta.setOnClickListener{
            val showboleta = BoletaFragment()
            showboleta.show((activity as AppCompatActivity).supportFragmentManager,"Boleta")
            showboleta.setCancelable(false)
        }
        btnfactura.setOnClickListener{
            val showfactura = FacturacionFragment()
            showfactura.show((activity as AppCompatActivity).supportFragmentManager,"Factura")
            showfactura.setCancelable(false)
        }

        btnnotadespacho.setOnClickListener{
            val shownotadespacho = NotaDespachoFragment()
            shownotadespacho.show((activity as AppCompatActivity).supportFragmentManager,"Nota Despacho")
            shownotadespacho.setCancelable(false)
        }

        btnpuntos.setOnClickListener{
            val showpuntos= PuntosFragment()
            showpuntos.show((activity as AppCompatActivity).supportFragmentManager,"Nota Despacho")
            showpuntos.setCancelable(false)
        }

        btndetalles.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.nav_dettalleoperacion)
        }

    }

}