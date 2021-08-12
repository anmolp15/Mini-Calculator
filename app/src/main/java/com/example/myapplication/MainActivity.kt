package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val plus :Button = findViewById(R.id.plus)
        val minus :Button = findViewById(R.id.minus)
        val multiply :Button = findViewById(R.id.multiply)
        val divide :Button = findViewById(R.id.divide)

        val num1 : EditText = findViewById(R.id.num1)
        val num2 : EditText = findViewById(R.id.num2)


        plus.setOnClickListener { view ->
            val a = num1.text.toString().toInt()
            val b = num2.text.toString().toInt()
            textView.text = "Addition of $a and $b is  ${a+b}"
        }

        minus.setOnClickListener { view ->
            val a = num1.text.toString().toInt()
            val b = num2.text.toString().toInt()
            textView.text = "Subtraction of $a and $b is ${a-b}"
        }

        multiply.setOnClickListener { view ->
            val a = num1.text.toString().toInt()
            val b = num2.text.toString().toInt()
            textView.text = "Multiplication of $a and $b is ${a*b}"
        }

        divide.setOnClickListener { view ->
            val a = num1.text.toString().toDouble()
            val b = num2.text.toString().toDouble()
            if (b==0.0) {
                textView.text = "Denominator cannot be 0"
            }
            else {
                textView.text = "Division of $a and $b is ${a/b}"
            }
        }

    }
}