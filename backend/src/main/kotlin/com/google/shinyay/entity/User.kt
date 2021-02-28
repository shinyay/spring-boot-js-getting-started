package com.google.shinyay.entity

import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

data class User(@Id
                @GeneratedValue(strategy = GenerationType.AUTO)
                var id: Long,
                var firstName: String,
                var lastName: String,
                var email: String)