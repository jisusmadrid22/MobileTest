package com.yzdev.mobiletest.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007J\b\u0010\n\u001a\u00020\u000bH\u0007J\u0012\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u000bH\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rH\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/yzdev/mobiletest/di/DataSourceModule;", "", "()V", "dbDataSource", "Lcom/yzdev/mobiletest/data/dataSource/DbDataSource;", "context", "Landroid/content/Context;", "noticeDao", "Lcom/yzdev/mobiletest/data/dataSource/NoticeDao;", "db", "provideBaseUrl", "", "provideRetrofit", "Lretrofit2/Retrofit;", "baseUrl", "restDataSource", "Lcom/yzdev/mobiletest/data/dataSource/RestDataSource;", "retrofit", "app_debug"})
@dagger.Module()
public final class DataSourceModule {
    
    public DataSourceModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "BaseUrl")
    @dagger.Provides()
    @javax.inject.Singleton()
    public final java.lang.String provideBaseUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final retrofit2.Retrofit provideRetrofit(@org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "BaseUrl")
    java.lang.String baseUrl) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.yzdev.mobiletest.data.dataSource.RestDataSource restDataSource(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.yzdev.mobiletest.data.dataSource.DbDataSource dbDataSource(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.yzdev.mobiletest.data.dataSource.NoticeDao noticeDao(@org.jetbrains.annotations.NotNull()
    com.yzdev.mobiletest.data.dataSource.DbDataSource db) {
        return null;
    }
}