package com.yzdev.mobiletest.di

import com.yzdev.mobiletest.data.repository.NoticeRepositoryImp
import com.yzdev.mobiletest.domain.repository.NoticeRepository
import dagger.Binds
import dagger.Module
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