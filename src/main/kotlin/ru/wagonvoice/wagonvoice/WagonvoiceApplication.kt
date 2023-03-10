package ru.wagonvoice.wagonvoice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.vosk.LibVosk
import org.vosk.LogLevel
import org.vosk.Model

@SpringBootApplication
class WagonvoiceApplication {
    @Bean
    fun getModel() = Model("vosk-model-ru-0.22")
}

fun main(args: Array<String>) {
    LibVosk.setLogLevel(LogLevel.INFO);
    println("before spring start")
    runApplication<WagonvoiceApplication>(*args)
    println("after spring start")
}


