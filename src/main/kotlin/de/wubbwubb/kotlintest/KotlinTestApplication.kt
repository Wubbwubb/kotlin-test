package de.wubbwubb.kotlintest

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinTestApplication

fun main(args: Array<String>) {
    runApplication<KotlinTestApplication>(*args) { setBannerMode(Banner.Mode.OFF) }
}
