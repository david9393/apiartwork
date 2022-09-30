package com.api.arte.service

import com.api.arte.dto.ResponseDto
import com.api.arte.dto.UserLoginDto
import com.api.arte.entity.User
import com.api.arte.repository.IUserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import java.util.*

@Component

class UserServiceImpl @Autowired constructor(private val userRepository: IUserRepository) : IUserService {
    override fun findAll(): MutableIterable<User> {
        return userRepository.findAll()
    }

    override fun findById(userId: Long): Optional<User> {
        return userRepository.findById(userId)
    }

    override fun saveUser(user: User): User {
        return userRepository.save(user)
    }

    override fun updateUser(userId: Long, user: User):User {
        var userTemp : Optional<User> = userRepository.findById(userId)
        if (userTemp.isEmpty){
            throw  error("User not found")
        }
        user.id=userId
        return userRepository.save(user)
    }

    override fun deleteUser(userId: Long) {
        userRepository.deleteById(userId)
    }

    override fun findUserLogin(userLoginDto: UserLoginDto): ResponseDto {
        var user :User? = userRepository.findUserLogin(userLoginDto.email,userLoginDto.password)

        if (user != null) {
            return ResponseDto(200, "success", user.id)
        }

        throw  error("User not found")    }
}