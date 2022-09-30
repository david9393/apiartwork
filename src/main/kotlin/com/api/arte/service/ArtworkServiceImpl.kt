package com.api.arte.service

import com.api.arte.entity.Artwork
import com.api.arte.repository.IArtworkRepository
import com.api.arte.repository.IUserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import java.io.IOException
import java.util.*

@Component

class ArtworkServiceImpl @Autowired constructor(private val artworkRepository: IArtworkRepository) : IArtworkService {
    override fun findAll(): MutableIterable<Artwork> {
        return artworkRepository.findAll()
    }

    override fun findById(artworkId: Long): Optional<Artwork> {
        TODO("Not yet implemented")
    }

    override fun saveArtwork(artwork: Artwork): Artwork {
        return artworkRepository.save(artwork)
    }

    override fun updateArtwork(artworkId: Long, artwork: Artwork): Artwork {
        var artworkTemp : Optional<Artwork> = artworkRepository.findById(artworkId)
        if (artworkTemp.isEmpty){
            throw  error("User not found")
        }
        artwork.id=artworkId
        return artworkRepository.save(artwork)
    }

    override fun deleteArtwork(artworkId: Long) {
        TODO("Not yet implemented")
    }

    override fun findArtworkByUserId(userId: Long): MutableIterable<Artwork> {
        return artworkRepository.findArtworkByUserId(userId)
    }
}