package com.google.shinyay.controller

import com.google.shinyay.entity.User
import com.google.shinyay.logger
import com.google.shinyay.service.UserService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/api/v1")
class UserController(val service: UserService) {

    @GetMapping("/users")
    fun getUsers(): MutableIterable<User> {
        return service.getUsers()
    }

    @GetMapping("/users/{id}")
    fun getUser(@PathVariable id: Long): Optional<User> {
        logger.info("Find ID: $id")
        return service.getUser(id)
    }

    @PostMapping("/users")
    fun addUser(@RequestBody user: User): ResponseEntity<User> {
        logger.info("Add User: ${user.firstName}/${user.lastName}")
        return ResponseEntity.ok(service.registerUser(user))
    }

    @PutMapping("/users")
    fun updateUser(@RequestBody user: User): ResponseEntity<User> {
        logger.info("Update User: ${user.firstName}/${user.lastName}")
        return ResponseEntity.ok(service.updateUser(user))
    }

    @DeleteMapping("/users/{id}")
    fun deleteUser(@PathVariable id: Long): ResponseEntity<Unit> {
        logger.info("Delete ID: $id")
        return ResponseEntity.ok(service.deleteUser(id))
    }
}