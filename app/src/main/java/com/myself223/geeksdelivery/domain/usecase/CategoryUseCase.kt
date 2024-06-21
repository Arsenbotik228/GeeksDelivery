package com.myself223.geeksdelivery.domain.usecase

import com.myself223.geeksdelivery.core.base.Either
import com.myself223.geeksdelivery.domain.model.CategoryModel
import com.myself223.geeksdelivery.domain.model.MealModel
import com.myself223.geeksdelivery.domain.repository.CategoryRepository
import kotlinx.coroutines.flow.Flow

class CategoryUseCase(private val repository: CategoryRepository) {
    operator fun invoke() = repository.getAllCategory()
    operator fun invoke(categoryName: String) = repository.getMealByCategory(categoryName = categoryName)

    fun getMealsByCategory(categoryName: String): Flow<Either<String, List<MealModel>>> = repository.getMealByCategory(categoryName)

}