package com.myself223.geeksdelivery.data.remote.apiservice

import com.myself223.geeksdelivery.data.base.model.BaseMainResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("categories.php")
    suspend fun getAllCategory(): BaseMainResponse

    @GET("filter.php")
    suspend fun getMealsByCategory(
        @Query("c") categoryName: String
    ): BaseMainResponse
}