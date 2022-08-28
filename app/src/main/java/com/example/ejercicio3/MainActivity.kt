package com.example.ejercicio3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun convertCurrencyUSD(view: View) {

        val dolar: EditText =findViewById(R.id.valorusd)
        var peso: TextView =findViewById(R.id.textpeso1)

        if (dolar.text.isNotEmpty()) {
            val dollarValue = dolar.text.toString().toFloat()

            val pesoValue = dollarValue * 903 // valor a la fecha 28-08-2022


            val dec = DecimalFormat("#,###.00")
            dec.format(pesoValue)

            peso.setText(dec.format(pesoValue))

            //           peso.setText(dec.toString())

            //        peso.setText(pesoValue.toString())
        } else {
            peso.setText(getString(R.string.no_value_string))
        }
    }

    fun convertCurrencyEURO(view: View) {

        val euro: EditText =findViewById(R.id.valoreuro)
        var peso: TextView =findViewById(R.id.textpeso2)

        if (euro.text.isNotEmpty()) {
            val euroValue = euro.text.toString().toFloat()

            val pesoValue = euroValue * 899 // valor a la fecha 28-08-2022


            val dec = DecimalFormat("#,###.00")
            dec.format(pesoValue)

            peso.setText(dec.format(pesoValue))

            //           peso.setText(dec.toString())

            //        peso.setText(pesoValue.toString())
        } else {
            peso.setText(getString(R.string.no_value_string))
        }
    }
}