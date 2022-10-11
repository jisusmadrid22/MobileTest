package com.yzdev.mobiletest;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000fJ\u0006\u0010\u0016\u001a\u00020\u0014R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\t0\u000e0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR \u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\t0\u000e0\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/yzdev/mobiletest/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "noticeRepositoryImp", "Lcom/yzdev/mobiletest/domain/repository/NoticeRepository;", "database", "Lcom/yzdev/mobiletest/data/dataSource/DbDataSource;", "(Lcom/yzdev/mobiletest/domain/repository/NoticeRepository;Lcom/yzdev/mobiletest/data/dataSource/DbDataSource;)V", "archive", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/yzdev/mobiletest/domain/model/entities/ArchivedNotices;", "getArchive", "()Lkotlinx/coroutines/flow/Flow;", "notice", "Lcom/yzdev/mobiletest/data/repository/UiStatus;", "Lcom/yzdev/mobiletest/domain/model/entities/NoticeEntity;", "getNotice", "noticeApi", "Landroidx/compose/runtime/MutableState;", "deleteNotice", "", "noticeEntity", "getNoticeApi", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final com.yzdev.mobiletest.domain.repository.NoticeRepository noticeRepositoryImp = null;
    private final com.yzdev.mobiletest.data.dataSource.DbDataSource database = null;
    private final androidx.compose.runtime.MutableState<com.yzdev.mobiletest.data.repository.UiStatus<java.util.List<com.yzdev.mobiletest.domain.model.entities.NoticeEntity>>> noticeApi = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<com.yzdev.mobiletest.data.repository.UiStatus<java.util.List<com.yzdev.mobiletest.domain.model.entities.NoticeEntity>>> notice = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.util.List<com.yzdev.mobiletest.domain.model.entities.ArchivedNotices>> archive = null;
    
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
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.yzdev.mobiletest.domain.model.entities.ArchivedNotices>> getArchive() {
        return null;
    }
    
    public final void getNoticeApi() {
    }
    
    public final void deleteNotice(@org.jetbrains.annotations.NotNull()
    com.yzdev.mobiletest.domain.model.entities.NoticeEntity noticeEntity) {
    }
}