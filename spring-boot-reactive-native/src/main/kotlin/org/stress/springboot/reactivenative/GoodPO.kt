package org.stress.springboot.reactivenative

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table
import java.time.Instant

@Table("t_goods")
class GoodPO {
    @Id
    lateinit var id: String
    lateinit var name: String
    lateinit var description: String
    var price: Double = 0.0

    @Column("created_at")
    lateinit var createdAt: Instant
}

fun GoodPO.toModel(): Good {
    return Good(
        id = id,
        name = name,
        description = description,
        price = price,
        createdAt = createdAt,
    )
}
