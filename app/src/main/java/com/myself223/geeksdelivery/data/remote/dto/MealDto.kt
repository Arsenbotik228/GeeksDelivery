package com.myself223.geeksdelivery.data.remote.dto

import com.google.gson.annotations.SerializedName
import com.myself223.geeksdelivery.data.mapper.DataMapper
import com.myself223.geeksdelivery.domain.model.MealModel

data class MealDto(
    @SerializedName("strMeal")
    val nameMeal:String? = null,
    @SerializedName("strMealThumb")
    val imgMeal:String? = null
):DataMapper<MealModel>{
    override fun toDomain() = MealModel (
        nameMeal = nameMeal,
        imgMeal = imgMeal


    )

}
