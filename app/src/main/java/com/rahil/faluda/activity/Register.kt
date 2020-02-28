package com.rahil.faluda.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import com.rahil.faluda.R

class Register : AppCompatActivity() {

    private lateinit var btnRegister: Button
    private lateinit var etName: EditText
    private lateinit var etEmail: EditText
    private lateinit var etMobileNumber: EditText
    private lateinit var etAddress: EditText
    private lateinit var etPassword: EditText
    private lateinit var etConfirmPassword: EditText


    lateinit var toolbar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.title = "Sign Up"
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        btnRegister = findViewById(R.id.btnRegister)
        etName = findViewById(R.id.etName)
        etEmail = findViewById(R.id.etEmail)
        etMobileNumber = findViewById(R.id.etMobileNumber)
        etAddress = findViewById(R.id.etAddress)
        etPassword = findViewById(R.id.etPassword)
        etConfirmPassword = findViewById(R.id.etConfirmPassword)

        btnRegister.setOnClickListener {

            val intent = Intent (this@Register, DashboardActivity::class.java)
            val bundle = Bundle()
            bundle.putString("data","register")
            bundle.putString("name",etName.text.toString())
            bundle.putString("email",etEmail.text.toString())
            bundle.putString("mobileNumber",etMobileNumber.text.toString())
            bundle.putString("address",etAddress.text.toString())
            bundle.putString("password",etPassword.text.toString())
            bundle.putString("confirmPassword",etConfirmPassword.text.toString())
            intent.putExtra("details",bundle)
            startActivity(intent)

            Toast.makeText(this@Register,"Register",Toast.LENGTH_SHORT).show()
        }

    }
}
