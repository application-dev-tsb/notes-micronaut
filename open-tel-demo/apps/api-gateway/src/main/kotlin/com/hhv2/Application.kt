package com.hhv2

import io.micronaut.runtime.Micronaut.*
import io.swagger.v3.oas.annotations.*
import io.swagger.v3.oas.annotations.info.*

@OpenAPIDefinition(
    info = Info(
            title = "api-gateway",
            version = "0.0"
    )
)
object Api {
}

fun main(args: Array<String>) {
	run(*args)
}

