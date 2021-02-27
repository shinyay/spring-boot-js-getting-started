package com.google.shinyay.service

import com.google.shinyay.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(val repository: UserRepository) {
}