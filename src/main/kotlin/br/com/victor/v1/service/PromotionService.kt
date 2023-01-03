package br.com.victor.v1.service

import br.com.victor.v1.model.Promotion
import br.com.victor.v1.model.PromotionTarget
import br.com.victor.v1.model.PromotionType
import jakarta.inject.Singleton
import java.math.BigDecimal
import java.util.*

@Singleton
class PromotionService {

    fun getPromotion(id: UUID): Promotion{
        return Promotion(
            id = UUID.randomUUID(),
            name = "As melhores promoções de finados",
            description = "As melhores promoções de produtos de embalsamamento para curtir esse finados",
            type = PromotionType.FIXED,
            target = PromotionTarget.PRODUCT,
            value = BigDecimal.valueOf(10)
        )
    }

    fun createPromotion(promotion: Promotion) {
        TODO("Not yet implemented")
    }

    fun getPromotions(): Promotion {
        TODO("Not yet implemented")
    }

    fun updatePromotion(id: UUID, promotion: Promotion) {
        TODO("Not yet implemented")
    }

    fun delete(id: UUID) {
        TODO("Not yet implemented")
    }
}