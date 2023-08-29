package com.desafiolatam.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class MainViewModel : ViewModel() {

    private val counterLowerMutableStateFlow: MutableStateFlow<Int> = MutableStateFlow(10)
    val counterLowerStateFlow: StateFlow<Int> = counterLowerMutableStateFlow.asStateFlow()

    private val counterUpperMutableStateFlow: MutableStateFlow<Int> = MutableStateFlow(10)
    val counterUpperStateFlow: StateFlow<Int> = counterUpperMutableStateFlow.asStateFlow()

    fun increaseLower() {
        counterLowerMutableStateFlow.value += 1
        counterUpperMutableStateFlow.value -= 1
    }

    fun increaseUpper(){
        counterUpperMutableStateFlow.value += 1
        counterLowerMutableStateFlow.value -= 1
    }


}