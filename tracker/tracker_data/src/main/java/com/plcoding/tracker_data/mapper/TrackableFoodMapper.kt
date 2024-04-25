package com.plcoding.tracker_data.mapper

import com.plcoding.tracker_data.remote.dto.Product
import com.plcoding.tracker_domain.model.TrackableFood
import kotlin.math.roundToInt

fun Product.toTrackableFood(): TrackableFood? {
    val carbsPer100g = nutrimets.carbohydrates100g.roundToInt()
    val proteinPer100g = nutrimets.proteins100g.roundToInt()
    val fatPer100g = nutrimets.fat100g.roundToInt()
    val caloriesPer100g = nutrimets.energyKcal100g.roundToInt()
    return TrackableFood(
        name = productName ?: return null,
        carbPer100g = carbsPer100g,
        caloriesPer100g = caloriesPer100g,
        proteinPer100g = proteinPer100g,
        fatPer100g = fatPer100g,
        imageUrl = imageFrontThumbUrl
    )
}