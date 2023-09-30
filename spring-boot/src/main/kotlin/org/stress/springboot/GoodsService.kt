package org.stress.springboot

import org.springframework.stereotype.Service
import java.util.*

@Service
class GoodsService(
    val goodsRepository: GoodsRepository
) {
    fun findById(id: String): Optional<Good> {
        return goodsRepository.findById(id)
    }
}
