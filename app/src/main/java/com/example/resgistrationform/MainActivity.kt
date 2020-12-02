package com.example.resgistrationform

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edFirstName: EditText = findViewById(R.id.edFirstName)
        val edLastName: EditText = findViewById(R.id.edLastName)
        val edEamil: EditText = findViewById(R.id.edEamil)

        val textViewFirstName: TextView = findViewById(R.id.textViewFirstName)
        val textViewLastName: TextView = findViewById(R.id.textViewLastName)
        val textViewEmail: TextView = findViewById(R.id.textViewEmail)

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {(sendMessage())}
    }
   private fun sendMessage() {
        Toast.makeText(this, "button clicked",
                Toast.LENGTH_SHORT).show()

       // textViewFirstName.text = edFirstName.toString()
       // textViewLastName.text = getString(edLastName).toString()

       val inputFName: String = edFirstName.text.toString()
       textViewFirstName.setText(inputFName).toString()

       val inputLName: String = edLastName.text.toString()
       textViewLastName.setText(inputLName).toString()

       val inputEmail: String = edEamil.text.toString()
       textViewEmail.setText(inputEmail).toString()

   }
    }