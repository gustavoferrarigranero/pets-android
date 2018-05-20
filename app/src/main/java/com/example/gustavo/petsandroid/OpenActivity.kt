package com.example.gustavo.petsandroid

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class OpenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_open)

        Handler().postDelayed({
            startActivity((Intent(applicationContext, LoginActivity::class.java)))
            finish()
        }, 4000)
    }
}
