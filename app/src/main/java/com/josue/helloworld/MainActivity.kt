package com.josue.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

// ctrl d = duplicate
// ctrl space = suggestions
// ctrl o = override options
// alt enter = add resource string
// ctrl p = parameters suggestion
// ctrl q = quick documentation
// shift F6 = rename all
// shift shift = search engine

// function overloading
// operator overloading

// use SVG images (vector images)
// add all the layouts in the resource strings

const val MAIN_ACT_KEY = "mainAct"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(MAIN_ACT_KEY, "onCreate Called")

        Log.w( "mainAct", "Main Activity Created") // print in logcat what program is doing

        val sum1= sum (5, 6)
        val sum2= sum (5, 8, 7)
        Log.i(  "MainAct", "Sum " + sum1    + " " + sum2)

        val mainTextView = findViewById<TextView>(R.id.mainTextView)

        //val num1EditText = findViewById<EditText>(R.id.num1) //Variable necessary to identify and
        //val num2EditText = findViewById<EditText>(R.id.num2) //bring from layout

        val buttonOne = findViewById<Button>(R.id.buttonBtn)
        buttonOne.setOnClickListener {
            //Log.i(  "MainAct", "Num1 " + num1EditText.text.toString())
            //Log.i(  "MainAct", "Num2 " + num2EditText.text.toString())
            val num1: Int = Integer.parseInt(num1.text.toString()) //using parse integer
            val num2: Int = Integer.parseInt(num2.text.toString()) //to convert from string to int
            val sumValue = sum(num1, num2)
            mainTextView.text = sumValue.toString()
        }
            new_activity.setOnClickListener{
                val intent = Intent(this, SecondaryActivity::class.java)
                intent.putExtra(MAIN_ACT_KEY, mainTextView.text)
                startActivity(intent)
            }

        }
        override fun onStart(){
            super.onStart()
            Log.i(MAIN_ACT_KEY, "onStart Called")
        }

        override  fun onPause(){
            super.onPause()
            Log.i(MAIN_ACT_KEY, "onPause Called")
        }

        override fun onStop() {
        super.onStop()
        Log.i(MAIN_ACT_KEY, "onStop Called")
        }

        override fun onDestroy() {
        super.onDestroy()
        Log.i(MAIN_ACT_KEY, "onDestroy Called")
        }

            // functions can have multiple definitions and parameters
        fun sum (a: Int, b: Int): Int{
        return a + b
        }
        fun sum (a: Int, b: Int, c: Int): Int{
        return a + b + c
        }


}