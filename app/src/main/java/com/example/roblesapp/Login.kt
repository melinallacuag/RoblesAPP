package com.example.roblesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.StrictMode
import android.text.TextUtils
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.myapplication.Conexion
import com.example.roblesapp.databinding.ActivityLoginBinding
import kotlinx.android.synthetic.main.activity_login.*
import java.sql.*

class Login : AppCompatActivity() {

    var guardar: Button? = null
    var consultar: Button? = null
    var modificar: Button? = null
    var eliminar: Button? = null
    var limpiar: Button? = null
    var ingresar: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        guardar = findViewById<View>(R.id.btningresar) as Button
        consultar = findViewById<View>(R.id.btnconsultar) as Button
        modificar = findViewById<View>(R.id.btnmodificar) as Button
        eliminar = findViewById<View>(R.id.btneliminar) as Button
        limpiar = findViewById<View>(R.id.btnlimpiar) as Button
        ingresar = findViewById<View>(R.id.btnlogin) as Button

        ingresar!!.setOnClickListener{
            try {
                val stn = Conexion.conexionDB()?.createStatement()!!
                val rs = stn.executeQuery(
                    "SELECT * FROM Alumno WHERE codigo='" + nombreid!!.text.toString() + "'AND nombre='"+nombrealumno!!.text.toString()+"'"
                )
                if (nombreid.text.isNullOrEmpty() && nombrealumno.text.isNullOrEmpty()){
                    Toast.makeText(this,"Los campos son requeridos",Toast.LENGTH_SHORT).show()

                    if (TextUtils.isEmpty(nombreid.text)){
                        Toast.makeText(this,"Ingresar codigo",Toast.LENGTH_SHORT).show()
                    }
                    if (TextUtils.isEmpty(nombrealumno.text)) {
                        Toast.makeText(this, "Ingresar nombre", Toast.LENGTH_SHORT).show()
                    }
                }else if (rs.next()){
                    startActivity(Intent(this,MainActivity::class.java))
                }else{
                    Toast.makeText(this,"Los datos son incorrectos",Toast.LENGTH_SHORT).show()
                }

            } catch (exception: java.lang.Exception) {
                Log.e("error", exception.message!!)
            }
        }
        guardar!!.setOnClickListener{
            try {
                val stm = Conexion.conexionDB()?.prepareStatement("INSERT INTO Alumno Values(?,?,?)")!!
                stm.setString(1, nombreid!!.text.toString())
                stm.setString(2, nombrealumno!!.text.toString())
                stm.setString(3, nombreapellido!!.text.toString())
                stm.executeUpdate()
                Toast.makeText(applicationContext, "Se Registro Nuevo Alumno", Toast.LENGTH_SHORT)
                    .show()
            } catch (exception: Exception) {
                Toast.makeText(this,"error",Toast.LENGTH_SHORT).show()
            }
        }

        consultar!!.setOnClickListener {
            try {
                val stn = Conexion.conexionDB()?.createStatement()!!
                val rs =
                    stn.executeQuery("SELECT * FROM Alumno WHERE codigo='" + nombreid!!.text.toString() + "'")
                if (rs.next()) {
                    nombrealumno!!.setText(rs.getString(2))
                    nombreapellido!!.setText(rs.getString(3))
                } else {
                    Toast.makeText(applicationContext, "Nose encontro Alumno", Toast.LENGTH_SHORT)
                        .show()
                }
            } catch (exception: java.lang.Exception) {
                Log.e("error", exception.message!!)
            }
        }

        modificar!!.setOnClickListener {
            try {
                val stm = Conexion.conexionDB()?.prepareStatement(
                    "UPDATE  Alumno set codigo='" + nombreid!!.text.toString() + "',nombre='" + nombrealumno!!.text.toString() + "',apellidos='" + nombreapellido!!.text.toString() + "'WHERE codigo='" + nombreid!!.text.toString() + "'"
                )!!
                stm.executeUpdate()
                Toast.makeText(applicationContext, "Se actualizo correctamente", Toast.LENGTH_SHORT)
                    .show()
            } catch (exception: java.lang.Exception) {
                Log.e("error", exception.message!!)
            }
        }

        eliminar!!.setOnClickListener {
            try {
                val stm = Conexion.conexionDB()?.prepareStatement(
                    "DELETE FROM Alumno WHERE codigo='" + nombreid!!.text.toString() + "'"
                )!!
                stm.executeUpdate()
                Toast.makeText(applicationContext, "se elimino correctamente", Toast.LENGTH_SHORT)
                    .show()
            } catch (exception: java.lang.Exception) {
                Log.e("error", exception.message!!)
            }
        }
        limpiar!!.setOnClickListener {
            try {
                nombreid!!.setText("")
                nombrealumno!!.setText("")
                nombreapellido!!.setText("")
                Toast.makeText(applicationContext, "Se limpio correctamente", Toast.LENGTH_SHORT)
                    .show()
            } catch (exception: java.lang.Exception) {
                Log.e("error", exception.message!!)
            }
        }
    }






}


