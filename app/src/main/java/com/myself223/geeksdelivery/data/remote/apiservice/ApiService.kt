package com.myself223.geeksdelivery.data.remote.apiservice

import com.myself223.geeksdelivery.data.base.BaseMainResponse
import com.myself223.geeksdelivery.data.remote.dto.CategoryDto
import com.myself223.geeksdelivery.presentation.model.Resourse
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("categories.php")
    suspend fun getAllCategory(): Response<BaseMainResponse<CategoryDto>>
}