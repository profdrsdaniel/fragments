package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val button2 = findViewById<Button>(R.id.button2)

        button.setOnClickListener {
            loadFragment(BlankFragment())
        }

        button2.setOnClickListener {
            loadFragment(Two())
        }
    }

    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.container_fragment, fragment)
            .addToBackStack(null)
            .commit()
    }
}