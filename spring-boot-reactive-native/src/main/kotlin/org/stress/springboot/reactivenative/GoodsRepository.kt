package org.stress.springboot.reactivenative

import org.springframework.data.r2dbc.core.R2dbcEntityTemplate
import org.springframework.data.relational.core.query.Criteria.where
import org.springframework.data.relational.core.query.Query.query
import org.springframework.stereotype.Repository
import reactor.core.publisher.Mono

@Repository
class GoodsRepository(
    private val r2dbcEntityTemplate: R2dbcEntityTemplate
) {
    fun findById(id: String): Mono<Good> {
        return r2dbcEntityTemplate.selectOne(query(where("id").`is`(id)), GoodPO::class.java)
            .map { it.toModel() }
    }
}
