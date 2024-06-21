package com.myself223.geeksdelivery.presentation.utils

sealed class UiState<T> {


    class Idle<T> : UiState<T>()
    class Success<T>(val data: T) : UiState<T>()

    class Loading <T> : UiState<T>()

    class Error<T>(val mes: String) : UiState<T>()


}