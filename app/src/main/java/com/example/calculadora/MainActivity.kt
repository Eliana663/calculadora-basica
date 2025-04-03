package com.example.calculadora

import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {


    lateinit var campo1 : EditText
    lateinit var campo2 : EditText
    lateinit var resultado : EditText



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        campo1 = this.findViewById(R.id.Nuno)
        campo2 = this.findViewById(R.id.Ndos)
        resultado = this.findViewById(R.id.Result)

    }



    fun sumar(view: View){
        var numero1: String = campo1.text.toString()
        var numero2:String = campo2.text.toString()
        val resultadotempo=(numero1.toFloat() + numero2.toFloat())
        resultado.setText(resultadotempo.toString())
    }

    fun restar(view: View){
        var numero1:String = campo1.text.toString()
        var numero2:String = campo2.text.toString()
        val resultadotempo=(numero1.toFloat() - numero2.toFloat())
        resultado.setText(resultadotempo.toString())
    }

    fun multiplicar(view: View){
        var numero1:String = campo1.text.toString()
        var numero2:String = campo2.text.toString()
        val resultadotempo=(numero1.toFloat() * numero2.toFloat())
        resultado.setText(resultadotempo.toString())
    }

    fun dividir(view: View){
        var numero1:String = campo1.text.toString()
        var numero2:String = campo2.text.toString()
        val resultadotempo=(numero1.toFloat() / numero2.toFloat())
        resultado.setText(resultadotempo.toString())
    }

    fun reset(view: View){
        campo1.setText("")
        campo2.setText("")
        resultado.setText("")

    }


    }
