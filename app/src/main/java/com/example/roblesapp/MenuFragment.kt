package com.example.roblesapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.Navigation
import androidx.navigation.ui.AppBarConfiguration
import com.example.roblesapp.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.fragment_menu.*


class MenuFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_menu, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnVentas.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.nav_venta)
        }
        btnCierreX.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.nav_cierreX)
        }
        btnCierreZ.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.nav_cierreZ)
        }
        btnCambioTurno.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.nav_cambioturno)
        }
        btnInicioDia.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.nav_turnodia)
        }
        btnConsultarComprobante.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.nav_consultarcomprobante)
        }



    }


}