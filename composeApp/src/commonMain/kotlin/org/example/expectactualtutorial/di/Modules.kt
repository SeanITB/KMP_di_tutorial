package org.example.expectactualtutorial.di

import org.example.expectactualtutorial.dependencies.MyRepository
import org.example.expectactualtutorial.dependencies.MyRepositoryImpl
import org.example.expectactualtutorial.dependencies.MyViewModel
import org.koin.compose.viewmodel.dsl.viewModelOf
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

// ther we difain the modules.
// the modules, in the sanse of di, is a container for especific related dependencis.


expect val platformModule : Module // for the dependin that changes depending of the platform, ex: dbClient.

val shaderModule = module { // for thoes dependencis that are the same for all platforms
    // for inject an object of type MyRepository
    singleOf(::MyRepositoryImpl).bind<MyRepository>() // the bind is for indecate wich abstraction to do
    viewModelOf(::MyViewModel)
}