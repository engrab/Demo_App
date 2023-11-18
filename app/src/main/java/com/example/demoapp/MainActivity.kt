package com.example.demoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.google.android.material.appbar.MaterialToolbar

class MainActivity : AppCompatActivity() {

    lateinit var topAppBar: MaterialToolbar
    val TAG = "MainActivity"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate: ")

        setContentView(R.layout.activity_main)

        topAppBar = findViewById(R.id.topAppbar)


        // navigation icon

        topAppBar.setNavigationOnClickListener {

           Toast.makeText(this, "This is navigation icon drawer", Toast.LENGTH_LONG).show()


        }

        topAppBar.setOnMenuItemClickListener {

            when(it.itemId){

                R.id.favorite -> {
                    Toast.makeText(this, "favourite is click", Toast.LENGTH_LONG).show()
                    true
                }
                R.id.setting -> {
                    Toast.makeText(this, "setting  is click", Toast.LENGTH_LONG).show()
                    true
                }
                R.id.share -> {
                    Toast.makeText(this, "share is click", Toast.LENGTH_LONG).show()
                    true
                }
                else -> false
            }
        }



    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: ")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: ")
    }

    override fun onPause() {
        super.onPause()

        Log.d(TAG, "onPause: ")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: ")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: ")
    }

}