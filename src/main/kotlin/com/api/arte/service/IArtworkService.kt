package com.api.arte.service

import com.api.arte.dto.UserLoginDto
import com.api.arte.entity.Artwork
import com.api.arte.entity.User
import java.util.*

interface IArtworkService {
    fun findAll() : MutableIterable<Artwork>
    fun findById(artworkId:Long) : Optional<Artwork>
    fun saveArtwork(artwork: Artwork)  : Artwork
    fun updateArtwork(artworkId: Long,artwork: Artwork): Artwork
    fun deleteArtwork(artworkId: Long)
    fun findArtworkByUserId(userId:Long):MutableIterable<Artwork>
}
