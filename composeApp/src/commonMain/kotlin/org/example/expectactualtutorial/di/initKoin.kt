package org.example.expectactualtutorial.di

import org.koin.core.context.startKoin
import org.koin.dsl.KoinAppDeclaration

// central function for the implementaishon of the di. We only call this function for one in each app launch
fun initKoin(config: KoinAppDeclaration? = null) { // this is for change the instance dependig on the platform
    startKoin{
        config?.invoke(this)
        modules(shaderModule, platformModule) // calls the container of modules
    }
}