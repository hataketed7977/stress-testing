package org.stress.springboot.reactivenative

import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class GoodsService(
    val goodsRepository: GoodsRepository
) {
    fun findById(id: String): Mono<Good> {
        return goodsRepository.findById(id)
    }
}
