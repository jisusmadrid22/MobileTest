package com.yzdev.mobiletest.dataSource

import com.yzdev.mobiletest.model.NoticeResponse
import retrofit2.http.GET

interface RestDataSource {
    @GET("search_by_date?query=mobile")
    suspend fun getNotice(): NoticeResponse
}