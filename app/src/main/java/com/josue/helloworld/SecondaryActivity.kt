package com.josue.helloworld

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import kotlinx.android.synthetic.main.activity_secondary.*

class SecondaryActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondary)

        Log.w( "secondAct", "Secondary Activity Created")
        val textFromMainActivity: String? = intent.getStringExtra(MAIN_ACT_KEY)
        welcome_text.text = "Second, Msg: " + textFromMainActivity

        welcome_text.setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)

    }
}
}
