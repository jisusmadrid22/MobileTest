package com.yzdev.mobiletest.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0011\u0010\u000f\u001a\u00020\u0010H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0014\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00130\u0012H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/yzdev/mobiletest/data/repository/NoticeRepositoryImp;", "Lcom/yzdev/mobiletest/domain/repository/NoticeRepository;", "dataSource", "Lcom/yzdev/mobiletest/data/dataSource/RestDataSource;", "noticeDao", "Lcom/yzdev/mobiletest/data/dataSource/NoticeDao;", "(Lcom/yzdev/mobiletest/data/dataSource/RestDataSource;Lcom/yzdev/mobiletest/data/dataSource/NoticeDao;)V", "deleteNotice", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNoticeDb", "Lcom/yzdev/mobiletest/domain/model/entities/NoticeEntity;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNoticeListApi", "Lcom/yzdev/mobiletest/domain/model/NoticeResponse;", "getNoticeListDb", "Lkotlinx/coroutines/flow/Flow;", "", "app_debug"})
public final class NoticeRepositoryImp implements com.yzdev.mobiletest.domain.repository.NoticeRepository {
    private final com.yzdev.mobiletest.data.dataSource.RestDataSource dataSource = null;
    private final com.yzdev.mobiletest.data.dataSource.NoticeDao noticeDao = null;
    
    @javax.inject.Inject()
    public NoticeRepositoryImp(@org.jetbrains.annotations.NotNull()
    com.yzdev.mobiletest.data.dataSource.RestDataSource dataSource, @org.jetbrains.annotations.NotNull()
    com.yzdev.mobiletest.data.dataSource.NoticeDao noticeDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getNoticeListApi(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.yzdev.mobiletest.domain.model.NoticeResponse> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<java.util.List<com.yzdev.mobiletest.domain.model.entities.NoticeEntity>> getNoticeListDb() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getNoticeDb(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.yzdev.mobiletest.domain.model.entities.NoticeEntity> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deleteNotice(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}