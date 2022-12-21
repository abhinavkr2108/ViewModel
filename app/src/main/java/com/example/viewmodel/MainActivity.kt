package com.example.viewmodel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnNextActivity.setOnClickListener {
            val intent = Intent(this, NextCounter::class.java)
            startActivity(intent)
        }

        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        btnIncrement.setOnClickListener {
            mainViewModel.Increment()
            setText()
        }

    }
    fun setText(){
        tvIncrement.text = mainViewModel.count.toString()
    }
}
