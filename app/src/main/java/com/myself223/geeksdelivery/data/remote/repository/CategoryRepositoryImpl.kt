package com.myself223.geeksdelivery.data.remote.repository

import android.util.Log
import com.myself223.geeksdelivery.core.base.Either
import com.myself223.geeksdelivery.data.base.repository.makeNetworkRequest
import com.myself223.geeksdelivery.data.remote.apiservice.ApiService
import com.myself223.geeksdelivery.domain.model.CategoryModel
import com.myself223.geeksdelivery.domain.model.MealModel
import com.myself223.geeksdelivery.domain.repository.CategoryRepository
import kotlinx.coroutines.flow.Flow

class CategoryRepositoryImpl(private val api: ApiService) : CategoryRepository {
    override fun getAllCategory(): Flow<Either<String, List<CategoryModel>>> =
        makeNetworkRequest {
            api.getAllCategory().categories.map { it.toDomain() }
    }

    override fun getMealByCategory(categoryName: String): Flow<Either<String, List<MealModel>>> =
        makeNetworkRequest {
            api.getMealsByCategory(categoryName = categoryName).meals.map { it.toDomain() }
        }
}
