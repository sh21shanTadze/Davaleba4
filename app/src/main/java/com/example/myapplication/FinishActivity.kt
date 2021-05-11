package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        findViewById<TextView>(R.id.textView).text = intent.extras?.getString("SAXELI", "")
        findViewById<TextView>(R.id.textView3).text = intent.extras?.getString("GVARI")
        findViewById<TextView>(R.id.textView2).text = intent.extras?.getInt("ASAKI").toString()

    }

}