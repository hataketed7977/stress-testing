package org.stress

import java.time.Instant

data class Good(
    val id: String,
    val name: String,
    val description: String,
    val price: Double,
    val createdAt: Instant
)
