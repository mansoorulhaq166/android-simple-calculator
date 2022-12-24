package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_add.setOnClickListener {
            if (first_num.text.toString() != ("") && second_num.text.toString() != "") {
                val no1 = first_num.text.toString().toInt()
                val no2 = second_num.text.toString().toInt()

                val sum = no1 + no2

                value_num.text = "$sum"

            } else
                Toast.makeText(this, "Please Fill all the required blanks.", Toast.LENGTH_SHORT)
                    .show()
        }

        button_minus.setOnClickListener {
            if (first_num.text.toString() != ("") && second_num.text.toString() != "") {
                val no1 = first_num.text.toString().toInt()
                val no2 = second_num.text.toString().toInt()

                val sub: Int = if (no1 > no2) {
                    no1 - no2
                } else {
                    no2 - no1
                }
                value_num.text = "$sub"

            } else
                Toast.makeText(this, "Please Fill all the required blanks.", Toast.LENGTH_SHORT)
                    .show()
        }

        button_mul.setOnClickListener {
            if (first_num.text.toString() != ("") && second_num.text.toString() != "") {
                val no1 = first_num.text.toString().toInt()
                val no2 = second_num.text.toString().toInt()

                val mul = no1 * no2
                value_num.text = "$mul"
            } else
                Toast.makeText(this, "Please Fill all the required blanks.", Toast.LENGTH_SHORT)
                    .show()
        }

        button_div.setOnClickListener {
            if (first_num.text.toString() != ("") && second_num.text.toString() != "") {
                val no1 = first_num.text.toString().toInt()
                val no2 = second_num.text.toString().toInt()

                val div: Double

                if (no2 == 0) {
                    div = 0.0
                    Toast.makeText(this, "The value is infinite", Toast.LENGTH_SHORT)
                        .show()
                } else {
                    div = (no1 / no2).toFloat().toDouble()
                }
                value_num.text = "$div"
            } else
                Toast.makeText(this, "Please Fill all the required blanks.", Toast.LENGTH_SHORT)
                    .show()
        }
    }
}