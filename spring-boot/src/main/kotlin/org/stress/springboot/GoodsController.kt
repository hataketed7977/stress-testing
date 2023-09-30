package org.stress.springboot

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/s1/goods")
class GoodsController(
    private val goodsService: GoodsService
) {
    @GetMapping("{id}")
    fun findById(@PathVariable("id") id: String): Good {
        return goodsService.findById(id).orElseThrow { GoodsNotFoundException() }
    }
}


@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Goods Not Found")
class GoodsNotFoundException : RuntimeException()
