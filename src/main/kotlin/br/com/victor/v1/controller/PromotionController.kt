package br.com.victor.v1.controller

import br.com.victor.v1.model.Promotion
import br.com.victor.v1.service.PromotionService
import io.micronaut.http.HttpStatus
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Delete
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import io.micronaut.http.annotation.Post
import io.micronaut.http.annotation.Put
import io.micronaut.http.annotation.Status
import java.util.UUID

@Controller("/promotions")
class PromotionController(
    private val promotionService: PromotionService
) {

    @Post(produces = [MediaType.APPLICATION_JSON])
    @Status(HttpStatus.CREATED)
    fun creatPromotion(@Body promotion: Promotion){
        promotionService.createPromotion(promotion)
    }

    @Put(uri = "/{id}", produces = [MediaType.APPLICATION_JSON])
    @Status(HttpStatus.NO_CONTENT)
    fun updatePromotion(@PathVariable("id") id: UUID, @Body promotion: Promotion){
        promotionService.updatePromotion(id, promotion)
    }

    @Get(produces = [MediaType.APPLICATION_JSON])
    @Status(HttpStatus.OK)
    fun getPromotions(): Promotion {
        return promotionService.getPromotions()
    }

    @Delete("/{id}")
    @Status(HttpStatus.NO_CONTENT)
    fun deletePromotion(@PathVariable("id") id: UUID){
        promotionService.delete(id)
    }

}