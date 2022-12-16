package com.example.roblesapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.DialogFragment
import kotlinx.android.synthetic.main.fragment_canje.*
import kotlinx.android.synthetic.main.fragment_canje.view.*
import kotlinx.android.synthetic.main.fragment_canje.view.btncancelarcanje
import kotlinx.android.synthetic.main.fragment_lista_canje_producto.view.*
import kotlinx.android.synthetic.main.fragment_nota_despacho.*
import kotlinx.android.synthetic.main.fragment_puntos.view.*
import kotlinx.android.synthetic.main.fragment_tipo_pago.view.*
import kotlinx.android.synthetic.main.fragment_tipo_pago.view.btncerrar


class CanjeFragment : DialogFragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var rootView: View = inflater.inflate(R.layout.fragment_canje,container,false)


        rootView.btncerrar.setOnClickListener{
            dismiss()
        }

        rootView.btncancelarcanje.setOnClickListener{
            dismiss()
        }


        rootView.btncanjeconsultar.setOnClickListener{


            Toast.makeText(context,"1000 PT", Toast.LENGTH_LONG).show()

        }
        rootView.btnimprimircanje.setOnClickListener{
            Toast.makeText(context,"Imprimir", Toast.LENGTH_LONG).show()
            dismiss()
        }
        return rootView
    }




}