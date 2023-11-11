package com.example.demoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.appbar.MaterialToolbar

class MainActivity : AppCompatActivity() {

    lateinit var topAppBar: MaterialToolbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        topAppBar = findViewById(R.id.topAppbar)

        topAppBar.setOnMenuItemClickListener {

            when(it.itemId){
                R.id.action_setting -> {
                    Toast.makeText(this, "Setting is clicked", Toast.LENGTH_LONG).show()

                    true
                }

                else -> { false}
            }
        }
    }
}