package com.google.shinyay.controller

import com.google.shinyay.service.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1")
class UserController(val service: UserService) {

    @GetMapping("/users")
    fun getUsers() {

    }
}