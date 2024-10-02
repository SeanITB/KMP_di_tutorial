package org.example.expectactualtutorial

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import org.example.expectactualtutorial.di.initKoin

fun main() {
    initKoin()
    application {
        Window(
            onCloseRequest = ::exitApplication,
            title = "KMP-tutorial-DI",
        ) {
            App()
        }
    }
}