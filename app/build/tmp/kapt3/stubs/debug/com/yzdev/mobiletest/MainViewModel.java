package com.yzdev.mobiletest;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR \u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/yzdev/mobiletest/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "noticeRepositoryImp", "Lcom/yzdev/mobiletest/domain/repository/NoticeRepository;", "database", "Lcom/yzdev/mobiletest/data/dataSource/DbDataSource;", "(Lcom/yzdev/mobiletest/domain/repository/NoticeRepository;Lcom/yzdev/mobiletest/data/dataSource/DbDataSource;)V", "notice", "Lkotlinx/coroutines/flow/Flow;", "Lcom/yzdev/mobiletest/data/repository/UiStatus;", "", "Lcom/yzdev/mobiletest/domain/model/entities/NoticeEntity;", "getNotice", "()Lkotlinx/coroutines/flow/Flow;", "noticeApi", "Landroidx/compose/runtime/MutableState;", "getNoticeApi", "", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final com.yzdev.mobiletest.domain.repository.NoticeRepository noticeRepositoryImp = null;
    private final com.yzdev.mobiletest.data.dataSource.DbDataSource database = null;
    private final androidx.compose.runtime.MutableState<com.yzdev.mobiletest.data.repository.UiStatus<java.util.List<com.yzdev.mobiletest.domain.model.entities.NoticeEntity>>> noticeApi = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<com.yzdev.mobiletest.data.repository.UiStatus<java.util.List<com.yzdev.mobiletest.domain.model.entities.NoticeEntity>>> notice = null;
    
    @javax.inject.Inject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.yzdev.mobiletest.domain.repository.NoticeRepository noticeRepositoryImp, @org.jetbrains.annotations.NotNull()
    com.yzdev.mobiletest.data.dataSource.DbDataSource database) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.yzdev.mobiletest.data.repository.UiStatus<java.util.List<com.yzdev.mobiletest.domain.model.entities.NoticeEntity>>> getNotice() {
        return null;
    }
    
    public final void getNoticeApi() {
    }
}