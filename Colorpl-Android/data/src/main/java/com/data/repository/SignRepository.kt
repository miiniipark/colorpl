package com.data.repository

import com.data.model.request.RequestSignIn
import com.data.model.response.ResponseSignIn
import com.data.util.ApiResult
import kotlinx.coroutines.flow.Flow

interface SignRepository {


    suspend fun signIn(
        requestSignIn: RequestSignIn
    ): Flow<ApiResult<ResponseSignIn>>

}