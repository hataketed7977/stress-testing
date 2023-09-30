package org.stress.springboot.reactivenative

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBootReactiveNativeApplication

fun main(args: Array<String>) {
    runApplication<SpringBootReactiveNativeApplication>(*args)
}
