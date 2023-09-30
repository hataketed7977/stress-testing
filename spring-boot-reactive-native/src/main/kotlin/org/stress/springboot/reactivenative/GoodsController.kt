package org.stress.springboot.reactivenative

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/s2/goods")
class GoodsController(
    private val goodsService: GoodsService
) {
    @GetMapping("{id}")
    fun findById(@PathVariable("id") id: String): Mono<Good>{
        return goodsService.findById(id)
    }
}
