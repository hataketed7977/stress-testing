package org.stress.springboot

import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Repository
import java.util.*


@Repository
class GoodsRepository(
    private val jdbcTemplate: JdbcTemplate
) {
    fun findById(id: String): Optional<Good> {
        val sql = "SELECT * FROM t_goods WHERE id = ?"
        val good = jdbcTemplate.queryForObject(sql, { rs, _ ->
            Good(
                id = rs.getString("id"),
                name = rs.getString("name"),
                description = rs.getString("description"),
                price = rs.getBigDecimal("price").toDouble(),
                createdAt = rs.getTimestamp("created_at").toInstant(),
            )
        }, id)
        return Optional.ofNullable(good)
    }
}
