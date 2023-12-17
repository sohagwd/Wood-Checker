package com.example.woodchecker

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // variable introduction
        val forInput = findViewById<EditText>(R.id.edInput)
        val forButton = findViewById<Button>(R.id.btnCheck)
        val forOutput = findViewById<TextView>(R.id.tvDisplay)

        // btnClick button code here
        forButton.setOnClickListener {
            val wood = forInput.text.toString().trim().uppercase().firstOrNull()
            
            if (wood !== null){
                // main code here
                val result = when (wood) {
                    'O' -> "Oak Price = 200 Tk"
                    'P' -> "Pine Price = 350 Tk"
                    'M' -> "Mahogany Price = 980 Tk"
                    'o' -> "Oak Price= 200 Tk"
                    'p' -> "Pine Price= 350 Tk"
                    'm' -> "Mahogany Price= 980 Tk"
                    else -> "Invalid"
                }
                forOutput.text = result
                Toast.makeText(this, result, Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "Please input first", Toast.LENGTH_SHORT).show()
            }
            
        }

    }
}