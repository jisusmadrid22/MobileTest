package com.yzdev.mobiletest.di

import android.content.Context
import androidx.room.Room
import com.yzdev.mobiletest.data.dataSource.DbDataSource
import com.yzdev.mobiletest.data.dataSource.NoticeDao
import com.yzdev.mobiletest.data.dataSource.RestDataSource
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataSourceModule {

    @Singleton
    @Provides
    @Named("BaseUrl")
    fun provideBaseUrl() = "https://hn.algolia.com/api/v1/"

    @Singleton
    @Provides
    fun provideRetrofit(@Named("BaseUrl") baseUrl: String): Retrofit {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(baseUrl)
            .build()
    }

    @Singleton
    @Provides
    fun restDataSource(retrofit: Retrofit): RestDataSource = retrofit.create(RestDataSource::class.java)

    @Singleton
    @Provides
    fun dbDataSource(@ApplicationContext context: Context): DbDataSource{
        return Room.databaseBuilder(context, DbDataSource::class.java, "notice_dataBase")
            .fallbackToDestructiveMigration()
            .build()
    }

    @Singleton
    @Provides
    fun noticeDao(
        db: DbDataSource
    ): NoticeDao = db.noticeDao()
}