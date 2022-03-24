package com.example.firebasedisplayrecyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var recyclerbtn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerbtn = findViewById<Button>(R.id.recyclerviewbtn)

        recyclerbtn.setOnClickListener {

            var i = Intent(this,UserlistActivity::class.java)
            startActivity(i)
            finish()


        }
    }
}