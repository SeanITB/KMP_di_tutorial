package org.example.expectactualtutorial

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform