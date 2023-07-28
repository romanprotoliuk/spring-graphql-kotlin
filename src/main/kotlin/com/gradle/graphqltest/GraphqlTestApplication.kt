package com.gradle.graphqltest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GraphqlTestApplication

fun main(args: Array<String>) {
	runApplication<GraphqlTestApplication>(*args)
}
