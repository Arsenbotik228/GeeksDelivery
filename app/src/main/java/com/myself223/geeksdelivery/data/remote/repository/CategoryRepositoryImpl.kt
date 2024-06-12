package com.myself223.geeksdelivery.data.remote.repository

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.liveData
import com.myself223.geeksdelivery.data.base.BaseMainResponse
import com.myself223.geeksdelivery.data.remote.apiservice.ApiService
import com.myself223.geeksdelivery.data.remote.dto.CategoryDto
import com.myself223.geeksdelivery.domain.repository.CategoryRepository
import com.myself223.geeksdelivery.presentation.model.Resourse
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.job
import kotlinx.coroutines.launch
import retrofit2.Response
import kotlin.coroutines.coroutineContext

class CategoryRepositoryImpl(private val api:ApiService):CategoryRepository {


    /*override fun getAllCategory(liveData: MutableLiveData<Resourse<BaseMainResponse<CategoryDto>?>>) {
        liveData.value = Resourse.Loading()
        CoroutineScope(Dispatchers.IO).launch {
            try {
                val result = api.getAllCategory()
                if (result.isSuccessful) {
                    liveData.postValue(Resourse.Success(result.body()))
                } else {
                    liveData.postValue(Resourse.Error(result.message()))
                }
            } catch (e: Exception) {
                liveData.postValue(Resourse.Error(e.message ?: "Unknown Error"))
            }
        }
    }*/
    /*override suspend fun getAllCategory(): LiveData<List<CategoryDto>> = liveData(Dispatchers.IO){
        val data = api.getAllCategory()
        if (data.isSuccessful){
            data.body()?.let { emit(it) }
        }else{
            Log.e("category",data.message())
        }

    }*/
   /* override suspend fun getAllCategory(): BaseMainResponse<CategoryDto>? {
        return try {
            val result = api.getAllCategory()
            if (result.isSuccessful) {
                result.body()
            } else {
                null
            }
        } catch (e: Exception) {
            null
        }
    }*/

        override fun getAllCategory(): LiveData<Resourse<BaseMainResponse<CategoryDto>?>> = liveData(Dispatchers.IO) {
            val result = api.getAllCategory()
            emit(Resourse.Loading())
            if (result.isSuccessful) {
                emit(Resourse.Success(result.body()))
            } else {
                emit(Resourse.Error(result.message()))
            }
        }
    }



