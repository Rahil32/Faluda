package com.rahil.faluda.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.rahil.faluda.R

class LoginActivity : AppCompatActivity() {

    private lateinit var etMobileNumber: EditText
    private lateinit var etPassword: EditText
    private lateinit var txtForgetPassword: TextView
    private lateinit var btnLogin: Button
    private lateinit var txtSignUp: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        etMobileNumber = findViewById(R.id.etMobileNumber)
        etPassword = findViewById(R.id.etPassword)
        txtForgetPassword = findViewById(R.id.txtForgetPassword)
        btnLogin = findViewById(R.id.btnLogin)
        txtSignUp = findViewById(R.id.txtSignUp)

        btnLogin.setOnClickListener {

            val intent = Intent (this@LoginActivity, DashboardActivity::class.java)
            val bundle = Bundle()
            bundle.putString("data","login")
            bundle.putString("mobileNumber",etMobileNumber.text.toString())
            bundle.putString("password",etPassword.text.toString())
            intent.putExtra("details",bundle)
            startActivity(intent)

            Toast.makeText(this@LoginActivity,"You are logged in",Toast.LENGTH_SHORT).show()
        }

        txtForgetPassword.setOnClickListener{

            val intent = Intent (this@LoginActivity, ForgetPassword::class.java)
            startActivity(intent)

        }

        txtSignUp.setOnClickListener{

            val intent = Intent (this@LoginActivity, Register::class.java)
            startActivity(intent)
        }

    }
}
