package org.example.expectactualtutorial.di

import org.example.expectactualtutorial.dependencies.DbClient
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

actual val platformModule = module {
    singleOf(::DbClient)
}