package com.example.parcial


import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ingreso.setOnClickListener() {
            val intento1 = Intent(this, Acivity2::class.java)
            startActivity(intento1)
        }
    }

    override fun onStart() {
        Toast.makeText(this,"Iniciando",Toast.LENGTH_LONG).show()
        super.onStart()
    }

    override fun onResume() {
        Toast.makeText(this,"Preparado",Toast.LENGTH_LONG).show()
        super.onResume()
    }

    override fun onPause() {
        Toast.makeText(this,"Pausado",Toast.LENGTH_LONG).show()
        super.onPause()
    }

    override fun onStop() {
        Toast.makeText(this,"Deteniendo",Toast.LENGTH_LONG).show()
        super.onStop()
    }

    override fun onDestroy() {
        Toast.makeText(this,"Cerrada",Toast.LENGTH_LONG).show()
        super.onDestroy()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu1, menu)
        return super.onCreateOptionsMenu(menu)

    }

        override fun onOptionsItemSelected(item: MenuItem?): Boolean {
            when (item?.itemId) {
                R.id.llamada -> {
                    Toast.makeText(this, "Realizara Llamada", Toast.LENGTH_LONG).show()
                    return true
                }
                R.id.mail -> {
                    Toast.makeText(this, "Enviara un correo", Toast.LENGTH_LONG).show()
                    return true

                }
            }
            return super.onOptionsItemSelected(item)
        }
    }
