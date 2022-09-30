package com.api.arte.repository

import com.api.arte.entity.SalesArtwork
import org.springframework.data.repository.PagingAndSortingRepository

interface ISalesArtworkRepository: PagingAndSortingRepository<SalesArtwork, Long> {

}