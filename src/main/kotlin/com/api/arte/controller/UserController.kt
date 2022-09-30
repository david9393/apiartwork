package com.api.arte.controller

import com.api.arte.dto.ResponseDto
import com.api.arte.dto.UserLoginDto
import com.api.arte.entity.User
import com.api.arte.service.IUserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@CrossOrigin(origins = ["*"])
@RestController
@RequestMapping("users")
class UserController @Autowired constructor(private val userService: IUserService)  {

    @GetMapping()
    fun findAll(): MutableIterable<User> {
        return userService.findAll()
    }

    @PostMapping("/create")
    fun saveUser(@RequestBody user : User): User {
        return userService.saveUser(user)
    }

    @PutMapping("{userId}")
    fun updateUser(@PathVariable userId:Long, @RequestBody user: User): User {
        return userService.updateUser(userId,user)
    }

    @PostMapping("/login")
    fun userLogin(@RequestBody userLoginDto : UserLoginDto): ResponseDto {
        return userService.findUserLogin(userLoginDto)
    }

}