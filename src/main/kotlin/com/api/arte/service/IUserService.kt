package com.api.arte.service

import com.api.arte.dto.ResponseDto
import com.api.arte.dto.UserLoginDto
import com.api.arte.entity.User
import java.util.*


interface IUserService {
    fun findAll() : MutableIterable<User>
    fun findById(userId:Long) : Optional<User>
    fun saveUser(user : User)  : User
    fun updateUser(userId: Long,user: User): User
    fun deleteUser(userId: Long)
    fun findUserLogin(userLoginDto:UserLoginDto) : ResponseDto
}