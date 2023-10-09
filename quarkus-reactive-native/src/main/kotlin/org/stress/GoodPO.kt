package org.stress

import io.quarkus.hibernate.reactive.panache.PanacheEntityBase
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.time.Instant

@Entity
@Table(name = "t_goods")
open class GoodPO : PanacheEntityBase() {
    @Id
    open var id: String? = null
    open var name: String? = null
    open var description: String? = null
    open var price: Double = 0.0

    @Column(name = "created_at")
    open var createdAt: Instant? = null
}

fun GoodPO.toModel(): Good {
    return Good(
        id = id!!,
        name = name!!,
        description = description!!,
        price = price,
        createdAt = createdAt!!,
    )
}
