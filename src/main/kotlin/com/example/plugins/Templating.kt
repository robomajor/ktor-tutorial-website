package com.example.plugins

import freemarker.cache.*
import freemarker.core.HTMLOutputFormat.INSTANCE
import io.ktor.server.freemarker.*
import io.ktor.server.application.*

fun Application.configureTemplating() {
    install(FreeMarker) {
        templateLoader = ClassTemplateLoader(this::class.java.classLoader, "templates")
        outputFormat = INSTANCE
    }
}
