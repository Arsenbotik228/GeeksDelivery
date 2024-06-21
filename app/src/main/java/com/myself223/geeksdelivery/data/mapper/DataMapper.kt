package com.myself223.geeksdelivery.data.mapper

interface DataMapper<T> {
    fun toDomain():T
}