package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class SecondActivity : AppCompatActivity() {

    private lateinit var ageEditText: EditText
    private lateinit var finishButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        ageEditText = findViewById(R.id.editTextNumber)
        finishButton = findViewById(R.id.button2)

        val name = intent.extras?.getString("SAXELI")
        val lastName = intent.extras?.getString("GVARI")

        finishButton.setOnClickListener {

            val ageText = ageEditText.text.toString()

            if (ageText.isEmpty()) {
                return@setOnClickListener
            }

            val age = ageText.toInt()

            val i = Intent(this, FinishActivity::class.java)
            i.putExtra("SAXELI", name)
            i.putExtra("GVARI", lastName)
            i.putExtra("ASKI", age)

            startActivity(i)

        }

    }

}