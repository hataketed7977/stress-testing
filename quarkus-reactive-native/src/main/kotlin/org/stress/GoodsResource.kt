package org.stress

import io.quarkus.hibernate.reactive.panache.common.WithSession
import jakarta.enterprise.context.ApplicationScoped
import jakarta.ws.rs.Consumes
import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces

@Path("/s4/goods")
@ApplicationScoped
@Produces("application/json")
@Consumes("application/json")
@WithSession
class GoodsResource(
    private val goodsService: GoodsService
) {

    @GET
    @Path("{id}")
    fun findById(id: String) = goodsService.findById(id)
}
