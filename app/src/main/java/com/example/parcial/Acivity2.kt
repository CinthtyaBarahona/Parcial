package com.example.parcial

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_acivity2.*

class Acivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_acivity2)

        ImageGit.setOnClickListener() {
            val intento2 = Intent(this, ""::class.java)
            startActivity(intento2)
        }
    }

    var Frag1 = true
    var Frag2 = true

    fun CambiarFragmento(view: View) {
        val fragmento1 = Fragmento1()
        val Fragmento2 = fragmento2()
        val manager = supportFragmentManager
        val transaction = manager.beginTransaction()
        if (Frag1) {
            Frag1 = false
            transaction.replace(R.id.reemplazar, fragmento1)
            transaction.addToBackStack(null)
            transaction.commit()
        } else {
            Frag1 = true
            transaction.replace(R.id.reemplazar, Fragmento2)
            transaction.addToBackStack(null)
            transaction.commit()
        }
    }

    }
