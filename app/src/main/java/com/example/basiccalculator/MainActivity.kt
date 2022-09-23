package com.example.basiccalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1.setOnClickListener {
            if (ed1.text.toString()!="" && ed2.text.toString()!=""){
                val no1 = ed1.text.toString().toInt()
                val no2 = ed2.text.toString().toInt()

                val sum = no1+no2
                t1.setText("$sum")


            }else{
                Toast.makeText(this,"plz fill all the fields",Toast.LENGTH_LONG).show()
            }
        }

        btn2.setOnClickListener {
            if (ed1.text.toString()!="" && ed2.text.toString()!=""){
                val no1 = ed1.text.toString().toInt()
                val no2 = ed2.text.toString().toInt()

                if (no1>no2){
                    val sub = no1-no2
                    t1.setText("$sub")
                }
                else{
                    val sub = no2-no1
                    t1.setText("$sub")
                }



            }else{
                Toast.makeText(this,"plz fill all the fields",Toast.LENGTH_LONG).show()
            }
        }

        btn3.setOnClickListener {
            if (ed1.text.toString()!="" && ed2.text.toString()!=""){
                val no1 = ed1.text.toString().toInt()
                val no2 = ed2.text.toString().toInt()

                val mul = no1*no2
                t1.setText("$mul")


            }else{
                Toast.makeText(this,"plz fill all the fields",Toast.LENGTH_LONG).show()
            }
        }

        btn4.setOnClickListener {
            if (ed1.text.toString()!="" && ed2.text.toString()!=""){
                val no1 = ed1.text.toString().toInt()
                val no2 = ed2.text.toString().toInt()

                val div = no1/no2
                t1.setText("$div")


            }else{
                Toast.makeText(this,"plz fill all the fields",Toast.LENGTH_LONG).show()
            }
        }













        btn5.setOnClickListener {
            t1.setText(" ")
        }
    }
}