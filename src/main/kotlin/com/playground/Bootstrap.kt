package com.playground

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class Bootstrap

@Suppress("SpreadOperator")
fun main(args: Array<String>) {
	runApplication<Bootstrap>(*args)
}