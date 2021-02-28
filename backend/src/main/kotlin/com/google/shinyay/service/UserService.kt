package com.google.shinyay.service

import com.google.shinyay.entity.User
import com.google.shinyay.repository.UserRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class UserService(val repository: UserRepository) {

    fun getUsers(): MutableIterable<User> {
        return repository.findAll()
    }

    fun registerUser(user: User): User {
        return repository.save(user)
    }

    fun getUser(id: Long): Optional<User> {
        return repository.findById(id)
    }
}