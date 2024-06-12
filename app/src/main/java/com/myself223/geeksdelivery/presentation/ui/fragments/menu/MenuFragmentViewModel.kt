
package com.myself223.geeksdelivery.presentation.ui.fragments.menu

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.myself223.geeksdelivery.data.base.BaseMainResponse
import com.myself223.geeksdelivery.data.remote.dto.CategoryDto
import com.myself223.geeksdelivery.domain.usecase.CategoryUseCase
import com.myself223.geeksdelivery.presentation.model.Resourse
import kotlinx.coroutines.launch
/*
class MenuFragmentViewModel(
    private val categoryUseCase :CategoryUseCase

):ViewModel() {
    private val _categories = MutableLiveData<BaseMainResponse<CategoryDto>?>()
    val categories: LiveData<BaseMainResponse<CategoryDto>?> get() = _categories

    fun getAllCategory() {
        viewModelScope.launch {
            _categories.value = categoryUseCase()
        }
    }
}*/
class MenuFragmentViewModel(
    private val categoryUseCase: CategoryUseCase
) : ViewModel() {

    private var _categories: LiveData<Resourse<BaseMainResponse<CategoryDto>?>> = MutableLiveData()
    val categories get() = _categories

    fun getAllCategory() {
            _categories = categoryUseCase()
    }
}

    /*fun getAllCategory() {
        viewModelScope.launch {
            _liveData.postValue(Resourse.Loading)
            try {
                val categories = categoryUseCase()
                _liveData.postValue(Resourse.Success(categories))
            } catch (e: Exception) {
                _liveData.postValue(Resourse.Error(e.message ?: "Unknown Error"))
            }
        }
    }*/



/*
package com.myself223.geeksdelivery.presentation.ui.fragments.menu

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.myself223.geeksdelivery.data.base.BaseMainResponse
import com.myself223.geeksdelivery.data.remote.dto.CategoryDto
import com.myself223.geeksdelivery.domain.usecase.CategoryUseCase
import com.myself223.geeksdelivery.presentation.model.Resourse
import kotlinx.coroutines.launch

class MenuFragmentViewModel(
    private val categoryUseCase: CategoryUseCase
) : ViewModel() {

    private val _liveData = MutableLiveData<Resourse<BaseMainResponse<List<CategoryDto>>?>>()
    val liveData: LiveData<Resourse<BaseMainResponse<List<CategoryDto>>?>> get() = _liveData

    fun getAllCategory() {
        viewModelScope.launch {
            _liveData.value = Resourse.Loading()
            try {
                val result = categoryUseCase()
                result.observeForever {
                    _liveData.value = it
                }
            } catch (e: Exception) {
                _liveData.value = Resourse.Error(e.message ?: "Unknown Error")
            }
        }
    }
}*/
/*package com.myself223.geeksdelivery.presentation.ui.fragments.menu

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.myself223.geeksdelivery.data.base.BaseMainResponse
import com.myself223.geeksdelivery.data.remote.dto.CategoryDto
import com.myself223.geeksdelivery.domain.usecase.CategoryUseCase
import com.myself223.geeksdelivery.presentation.model.Resourse
import kotlinx.coroutines.launch

class MenuFragmentViewModel(
    private val categoryUseCase: CategoryUseCase
) : ViewModel() {

    private val _liveData = MutableLiveData<Resourse<BaseMainResponse<CategoryDto>?>>()
    val liveData: LiveData<Resourse<BaseMainResponse<CategoryDto>?>> get() = _liveData

    fun getAllCategory() {
        viewModelScope.launch {
            _liveData.value = Resourse.Loading()
            try {
                val result = categoryUseCase()
                result.observeForever { resource ->
                    _liveData.value = resource
                }
            } catch (e: Exception) {
                _liveData.value = Resourse.Error(e.message ?: "Unknown Error")
            }
        }
    }*/
