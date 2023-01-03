package br.com.victor.v1.model

import java.math.BigDecimal
import java.util.UUID

data class Promotion (
    val id: UUID,
    val name: String,
    val description: String,
    val type: PromotionType,
    val target: PromotionTarget,
    val value: BigDecimal
)