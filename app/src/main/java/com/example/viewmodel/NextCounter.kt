package com.example.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_next_counter.*

class NextCounter : AppCompatActivity() {
    lateinit var nextCounterViewModel: NextCounterViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next_counter)

        nextCounterViewModel = ViewModelProvider(this, NextCounterViewModelFactory(10)).get(NextCounterViewModel::class.java)

        btnIncrementNext.setOnClickListener {
            nextCounterViewModel.IncrementCounter()
            setNewText()
        }

    }

    fun setNewText(){
        tvIncrementNext.text = nextCounterViewModel.counter.toString()
    }
}