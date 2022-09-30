package com.api.arte.entity

import javax.persistence.*

@Entity
@Table(name = "users")
class User(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) var id: Long,
    var name: String,
    var email: String,
    var password: String,

    )