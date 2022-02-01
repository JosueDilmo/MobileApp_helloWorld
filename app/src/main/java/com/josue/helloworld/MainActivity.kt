package com.josue.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

// ctrl d = duplicate
// ctrl space = suggestions
// ctrl o = override options
// alt enter = add resource string
// ctrl p = parameters suggestion
// ctrl q = quick documentation
// function overloading
// operator overloading

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.w( "mainAct", "Main Activity Created") // print in logcat what program is doing

        val sum1= sum (5, 6)
        val sum2= sum (5, 8, 7)
        Log.i(  "MainAct", "Sum " + sum1    + " " + sum2)

        val mainTextView = findViewById<TextView>(R.id.mainTextView)

        val num1EditText = findViewById<EditText>(R.id.num1)
        val num2EditText = findViewById<EditText>(R.id.num2)

        val buttonOne = findViewById<Button>(R.id.buttonBtn)
        buttonOne.setOnClickListener{
            //Log.i(  "MainAct", "Num1 " + num1EditText.text.toString())
            //Log.i(  "MainAct", "Num2 " + num2EditText.text.toString())
            val num1: Int = Integer.parseInt(num1EditText.text.toString()) //using parse integer
            val num2: Int = Integer.parseInt(num2EditText.text.toString()) //to convert from string to int
            val sumValue = sum(num1, num2)
            mainTextView.text = sumValue.toString()
        }

    }

    // functions can have multiple definitions and parameters
    fun sum (a: Int, b: Int): Int{
        return a + b
    }
    fun sum (a: Int, b: Int, c: Int): Int{
        return a + b + c
    }
}