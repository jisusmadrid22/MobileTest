package com.yzdev.mobiletest.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0011\u0010\n\u001a\u00020\u000bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000e0\rH&\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/yzdev/mobiletest/domain/repository/NoticeRepository;", "", "deleteNotice", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNoticeDb", "Lcom/yzdev/mobiletest/domain/model/entities/NoticeEntity;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNoticeListApi", "Lcom/yzdev/mobiletest/domain/model/NoticeResponse;", "getNoticeListDb", "Lkotlinx/coroutines/flow/Flow;", "", "app_debug"})
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
}