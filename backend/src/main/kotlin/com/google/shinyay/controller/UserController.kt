package com.google.shinyay.controller

import com.google.shinyay.entity.User
import com.google.shinyay.logger
import com.google.shinyay.service.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping("/api/v1")
class UserController(val service: UserService) {

    @GetMapping("/users")
    fun getUsers(): MutableIterable<User> {
        return service.getUsers()
    }

    @GetMapping("users/{id}")
    fun getUser(@PathVariable id: Long): Optional<User> {
        logger.info("Find ID: $id")
        return service.getUser(id)
    }
}