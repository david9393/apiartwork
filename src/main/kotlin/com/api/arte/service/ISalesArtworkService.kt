package com.api.arte.service

import com.api.arte.entity.Artwork
import com.api.arte.entity.SalesArtwork

interface ISalesArtworkService {
    fun saveSalesArtwork(salesArtwork: SalesArtwork)  : SalesArtwork
}