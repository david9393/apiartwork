package com.api.arte.entity

import java.util.Date
import javax.persistence.*

@Entity
@Table(name = "salesartwork")
class SalesArtwork (
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY) var id: Long,
        var userId: Int,
        var artworkId:  Int,
        var date: Date,
        var address: String,
        var payment: String

)