package com.example.viewmodel

import androidx.lifecycle.AbstractSavedStateViewModelFactory
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

class NextCounterViewModel(val initialValue: Int): ViewModel() {
    var counter = initialValue

    fun IncrementCounter(){
        counter++
    }


}