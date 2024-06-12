package com.myself223.geeksdelivery.domain.usecase

import androidx.lifecycle.LiveData
import com.myself223.geeksdelivery.data.base.BaseMainResponse
import com.myself223.geeksdelivery.data.remote.dto.CategoryDto
import com.myself223.geeksdelivery.domain.repository.CategoryRepository
import com.myself223.geeksdelivery.presentation.model.Resourse

class CategoryUseCase(private val repository: CategoryRepository) {
    operator fun invoke(): LiveData<Resourse<BaseMainResponse<CategoryDto>?>> {
        return repository.getAllCategory()
    }
}