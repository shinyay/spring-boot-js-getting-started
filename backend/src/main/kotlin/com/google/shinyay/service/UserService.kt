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

    fun updateUser(user: User): User {
        val userUpdated = repository.findById(user.id).get()
        userUpdated.firstName = user.firstName
        userUpdated.lastName = user.lastName
        userUpdated.email = user.email
        return repository.save(userUpdated)
    }

    fun deleteUser(id: Long) = repository.deleteById(id)
}