package com.yzdev.mobiletest.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\b"}, d2 = {"Lcom/yzdev/mobiletest/data/NoticeRepositoryImp;", "Lcom/yzdev/mobiletest/repository/NoticeRepository;", "dataSource", "Lcom/yzdev/mobiletest/dataSource/RestDataSource;", "(Lcom/yzdev/mobiletest/dataSource/RestDataSource;)V", "getNoticeList", "Lcom/yzdev/mobiletest/model/NoticeResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class NoticeRepositoryImp implements com.yzdev.mobiletest.repository.NoticeRepository {
    private final com.yzdev.mobiletest.dataSource.RestDataSource dataSource = null;
    
    @javax.inject.Inject()
    public NoticeRepositoryImp(@org.jetbrains.annotations.NotNull()
    com.yzdev.mobiletest.dataSource.RestDataSource dataSource) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getNoticeList(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.yzdev.mobiletest.model.NoticeResponse> continuation) {
        return null;
    }
}