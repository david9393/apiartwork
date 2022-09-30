package com.api.arte.entity

import javax.persistence.*

@Entity
@Table(name = "artwork")
class Artwork(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) var id: Long,
    var userId: Int,
    var name: String,
    var price: Double,
    var photo: String,
    var author: String,
    var type: String,
    var active: Boolean,
)