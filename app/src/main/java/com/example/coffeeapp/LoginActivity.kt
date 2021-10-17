package com.example.coffeeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.coffeeapp.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    companion object {
        const val userKey = "USER_KEY"
        const val passKey = "PASS_KEY"
    }

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login)

        binding.ButtonLogin.setOnClickListener {

            val intent = Intent(this, MainActivity::class.java)
            val loginData: Login = Login()

            binding.apply {
                loginData?.user = binding.EditTextUserName.text.toString()
                loginData?.password = binding.EditTextPassword.text.toString()
            }

            intent.putExtra(userKey, loginData.user)
            intent.putExtra(passKey, loginData.password)
            startActivity(intent)
        }

        binding.TextViewNoAccount.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}