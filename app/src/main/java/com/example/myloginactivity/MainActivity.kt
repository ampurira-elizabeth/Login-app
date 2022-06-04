package com.example.myloginactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    lateinit var etName: EditText
    lateinit var etPassword:EditText
    lateinit var btnLogin:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etName=findViewById(R.id.etName)
        etPassword=findViewById(R.id.etPassword)
        btnLogin=findViewById(R.id.btnLogin)
        btnLogin.setOnClickListener {
            val name= etName.text.toString()
            val password= etPassword.text.toString()
            if (name.isBlank()){
                etName.setError("Enter Username please")
                return@setOnClickListener
            }
            if (password.isBlank()){
                etPassword.setError("Enter Password Please")
                return@setOnClickListener
            }
    }
}}