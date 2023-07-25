package com.example.agecalc

import android.os.Build
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import java.time.LocalDate
import java.time.LocalDateTime

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button).setOnClickListener {

            if (findViewById<EditText>(R.id.editTextNumber4).text.isEmpty() || findViewById<EditText>(R.id.editTextNumber4).text.isEmpty() || findViewById<EditText>(R.id.editTextNumber4).text.isEmpty()){
                findViewById<EditText>(R.id.editTextNumber4).error = "je ne peux pas calculer votre âge svp"
            }
            val date = LocalDate.of(findViewById<EditText>(R.id.editTextNumber6).text.toString().toInt(), findViewById<EditText>(R.id.editTextNumber5).text.toString().toInt(), findViewById<EditText>(R.id.editTextNumber4).text.toString().toInt())
            val localDateTime = LocalDateTime.now()
            val dayOfWeek = date.dayOfWeek

            val age = 2023 - findViewById<EditText>(R.id.editTextNumber6).text.toString().toInt()
            val months = localDateTime.monthValue - findViewById<EditText>(R.id.editTextNumber5).text.toString().toInt()
            val days = localDateTime.dayOfMonth - findViewById<EditText>(R.id.editTextNumber4).text.toString().toInt()
            val minutes = localDateTime.minute
            val seconds = localDateTime.second


            findViewById<TextView>(R.id.textView5).text = "vous avez $age Ans, $months Mois, $days Jours, $minutes Minutes, $seconds Secondes et vous êtes né \nun "+ dayOfWeek.toString()
        }

    }
}