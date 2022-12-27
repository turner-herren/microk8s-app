package kr.co.herrencorp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class Microk8sAppApplication

fun main(args: Array<String>) {
    runApplication<Microk8sAppApplication>(*args)
}
