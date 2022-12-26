package com.example.myapplication

import android.os.StrictMode.ThreadPolicy
import android.os.StrictMode
import android.util.Log
import android.widget.Toast
import java.lang.Exception
import java.sql.Connection
import java.sql.DriverManager

object Conexion {
    fun conexionDB(): Connection? {
        var cnn: Connection? = null
        try {
            val polity = ThreadPolicy.Builder().permitAll().build()
            StrictMode.setThreadPolicy(polity)
            Class.forName("net.sourceforge.jtds.jdbc.Driver").newInstance()
            cnn = DriverManager.getConnection(
                "jdbc:jtds:sqlserver://192.168.1.230:1433;databaseName=Colegio;user=sa;password=@dm19!2017;integratedSecurity=true;"
            )
          //  val applicationContext
          //  Toast.makeText(applicationContext,"correcto", Toast.LENGTH_SHORT).show()
        } catch (e: Exception) {
          //  Log.e("error", exception.message!!)
           //  Toast.makeText(this, "error", Toast.LENGTH_LONG).show();
        }
        return cnn
    }
}