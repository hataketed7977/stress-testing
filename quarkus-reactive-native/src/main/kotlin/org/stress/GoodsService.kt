package org.stress

import jakarta.enterprise.context.ApplicationScoped

@ApplicationScoped
class GoodsService(
    private val goodsRepository: GoodsRepository
) {
    fun findById(id: String) = goodsRepository.findById(id)
}
