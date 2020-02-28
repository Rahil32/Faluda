package com.rahil.faluda.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import com.rahil.faluda.R

class ForgetPassword : AppCompatActivity() {

    private lateinit var btnNext: Button
    private lateinit var etMobileNumber: EditText
    private lateinit var etEmail: EditText

    lateinit var toolbar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forget_password)

        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.title = "Forget Password"
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        btnNext = findViewById(R.id.btnNext)
        etMobileNumber = findViewById(R.id.etMobileNumber)
        etEmail = findViewById(R.id.etEmail)

        btnNext.setOnClickListener {

            val intent = Intent (this@ForgetPassword, DashboardActivity::class.java)
            val bundle = Bundle()
            bundle.putString("data","next")
            bundle.putString("mobileNumber",etMobileNumber.text.toString())
            bundle.putString("email",etEmail.text.toString())
            intent.putExtra("details",bundle)
            startActivity(intent)


            Toast.makeText(this@ForgetPassword,"Up next",Toast.LENGTH_SHORT).show()
        }

    }
}
