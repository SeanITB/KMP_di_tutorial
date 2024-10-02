package org.example.expectactualtutorial.dependencies

import androidx.lifecycle.ViewModel

class MyViewModel(
    private val repository: MyRepository // injecting in the constructor alaus os to implement diferent type of repositoris when you make an instance (=polimorfisme)
): ViewModel() {

    fun getHelloWorldString(): String { // to test if the di is properly working.
        return repository.helloWorld()
    }
}