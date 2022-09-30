package com.api.arte.repository

import com.api.arte.entity.Artwork
import com.api.arte.entity.User
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.stereotype.Repository


@Repository
interface IArtworkRepository : PagingAndSortingRepository<Artwork, Long> {

    @Query("SELECT a FROM Artwork a WHERE a.userId = ?1")
    fun findArtworkByUserId(userId:Long):MutableIterable<Artwork>

    @Query("SELECT a FROM Artwork a WHERE a.active = true")
    override  fun findAll():MutableIterable<Artwork>
}