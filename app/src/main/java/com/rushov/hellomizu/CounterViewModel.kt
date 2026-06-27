package com.rushov.hellomizu

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class CounterViewModelFactory(
    private val engine: Engine
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(CounterViewModel::class.java)) {
            return CounterViewModel(engine) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}