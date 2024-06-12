package com.myself223.geeksdelivery.domain.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.myself223.geeksdelivery.data.base.BaseMainResponse
import com.myself223.geeksdelivery.data.remote.dto.CategoryDto
import com.myself223.geeksdelivery.presentation.model.Resourse
import retrofit2.Response

interface CategoryRepository {
    fun getAllCategory(): LiveData<Resourse<BaseMainResponse<CategoryDto>?>>
}