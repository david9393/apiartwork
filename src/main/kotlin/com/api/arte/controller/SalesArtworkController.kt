package com.api.arte.controller

import com.api.arte.entity.Artwork
import com.api.arte.entity.SalesArtwork
import com.api.arte.service.IArtworkService
import com.api.arte.service.ISalesArtworkService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@CrossOrigin(origins = ["*"])
@RestController
@RequestMapping("sales")
class SalesArtworkController  @Autowired constructor(private val salesArtworkService: ISalesArtworkService){
    @PostMapping("/create")
    fun saveSales(@RequestBody salesArtwork: SalesArtwork): SalesArtwork {
        return salesArtworkService.saveSalesArtwork(salesArtwork)
    }
}