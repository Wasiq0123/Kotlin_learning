package com.example.kotin_practice.counter_app

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel(){

    var count by mutableStateOf(0)
        private set
    //increment
    fun increment(){
        count++
    }

    //decrement
    fun decrement(){
        count--
    }
}