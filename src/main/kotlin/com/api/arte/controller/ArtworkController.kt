package com.api.arte.controller

import com.api.arte.entity.Artwork
import com.api.arte.entity.User
import com.api.arte.service.IArtworkService
import com.api.arte.service.IUserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@CrossOrigin(origins = ["*"])
@RestController
@RequestMapping("artworks")
class ArtworkController @Autowired constructor(private val artworkService: IArtworkService) {
    @GetMapping("/all")
    fun findAll(): MutableIterable<Artwork> {
        return artworkService.findAll()
    }

    @PostMapping("/create")
    fun saveUser(@RequestBody artwork: Artwork ): Artwork {
        return artworkService.saveArtwork(artwork)
    }
}