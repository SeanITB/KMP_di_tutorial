package org.example.expectactualtutorial

import androidx.compose.ui.window.ComposeUIViewController
import org.example.expectactualtutorial.di.initKoin

fun MainViewController() = ComposeUIViewController (
    configure = {
        initKoin()
    }
){
    App()
}