package com.alejandromateo.hexagonal.infrastructure.api

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class ExampleController {

    @GetMapping("/hello")
    fun sayHello(): String {
        return "Hello, World!"
    }
}
