package com.yzdev.mobiletest.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H&J\u001b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0011\u0010\u000e\u001a\u00020\u000fH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u0006H&\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/yzdev/mobiletest/domain/repository/NoticeRepository;", "", "deleteNotice", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getArchivedList", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/yzdev/mobiletest/domain/model/entities/ArchivedNotices;", "getNoticeDb", "Lcom/yzdev/mobiletest/domain/model/entities/NoticeEntity;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNoticeListApi", "Lcom/yzdev/mobiletest/domain/model/NoticeResponse;", "getNoticeListDb", "app_debug"})
public abstract interface NoticeRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getNoticeListApi(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.yzdev.mobiletest.domain.model.NoticeResponse> continuation);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.yzdev.mobiletest.domain.model.entities.NoticeEntity>> getNoticeListDb();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getNoticeDb(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.yzdev.mobiletest.domain.model.entities.NoticeEntity> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteNotice(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.yzdev.mobiletest.domain.model.entities.ArchivedNotices>> getArchivedList();
}