package com.example.pad_3d_list


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*

class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val email = email_Login.text.toString()
        val password = Password_Login.text.toString()

        Back_Registration.setOnClickListener {
            finish()
        }
    }
}
