package com.adwi.plugins

import com.adwi.di.appModule
import io.ktor.application.*
import org.koin.ktor.ext.Koin

fun Application.configureKoin() {
    install(Koin) {
        modules(appModule)
    }
}