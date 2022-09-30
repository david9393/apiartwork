package com.api.arte.repository

import com.api.arte.entity.User
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.stereotype.Repository


@Repository
interface IUserRepository : PagingAndSortingRepository<User, Long> {

    @Query("SELECT u FROM User u WHERE u.email = ?1 and u.password = ?2")
    fun findUserLogin(nameUser: String, password: String): User?
}