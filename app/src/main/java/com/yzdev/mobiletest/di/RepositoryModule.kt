package com.yzdev.mobiletest.di

import com.yzdev.mobiletest.data.NoticeRepositoryImp
import com.yzdev.mobiletest.repository.NoticeRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Singleton
    @Binds
    abstract fun noticeRepository(repo: NoticeRepositoryImp): NoticeRepository
}