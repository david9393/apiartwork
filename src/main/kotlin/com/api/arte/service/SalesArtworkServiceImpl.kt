package com.api.arte.service

import com.api.arte.entity.Artwork
import com.api.arte.entity.SalesArtwork
import com.api.arte.repository.IArtworkRepository
import com.api.arte.repository.ISalesArtworkRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.expression.common.ExpressionUtils.toLong
import org.springframework.stereotype.Component
import java.util.*
@Component
class SalesArtworkServiceImpl @Autowired constructor(
        private val artworkRepository: IArtworkRepository,
        private val salesArtworkRepository:ISalesArtworkRepository): ISalesArtworkService {

    override fun saveSalesArtwork(salesArtwork: SalesArtwork): SalesArtwork {
        var sales = salesArtworkRepository.save(salesArtwork)
        var artwork : Optional<Artwork> = artworkRepository.findById(sales.artworkId.toLong())
        if (artwork.isEmpty){
            throw  error("artwork not found")
        }
        artwork.get().active=false
        artworkRepository.save(artwork.get())
        return sales
    }
}