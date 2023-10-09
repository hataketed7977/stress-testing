package org.stress

import io.quarkus.hibernate.reactive.panache.PanacheRepository
import io.smallrye.mutiny.Uni
import jakarta.enterprise.context.ApplicationScoped

@ApplicationScoped
class GoodsRepository : PanacheRepository<GoodPO> {
    fun findById(id: String): Uni<Good> {
        return find("id", id).firstResult<GoodPO>().map { it.toModel() }
    }
}
