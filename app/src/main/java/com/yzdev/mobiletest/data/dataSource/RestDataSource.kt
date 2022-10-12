package com.yzdev.mobiletest.data.dataSource

import com.yzdev.mobiletest.domain.model.NoticeResponse
import retrofit2.http.GET

interface RestDataSource {
    @GET("search_by_date?query=mobile")
    suspend fun getNotice(): NoticeResponse
}