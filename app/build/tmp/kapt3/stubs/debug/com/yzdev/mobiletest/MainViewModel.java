package com.yzdev.mobiletest;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000fJ\u0006\u0010\u0013\u001a\u00020\u0016J\u001b\u0010\u0018\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bR\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\t0\u000e0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR#\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\t0\u000e0\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001c"}, d2 = {"Lcom/yzdev/mobiletest/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "noticeRepositoryImp", "Lcom/yzdev/mobiletest/domain/repository/NoticeRepository;", "database", "Lcom/yzdev/mobiletest/data/dataSource/DbDataSource;", "(Lcom/yzdev/mobiletest/domain/repository/NoticeRepository;Lcom/yzdev/mobiletest/data/dataSource/DbDataSource;)V", "archive", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/yzdev/mobiletest/domain/model/entities/ArchivedNotices;", "getArchive", "()Lkotlinx/coroutines/flow/Flow;", "notice", "Lcom/yzdev/mobiletest/data/repository/UiStatus;", "Lcom/yzdev/mobiletest/domain/model/entities/NoticeEntity;", "getNotice", "noticeApi", "Landroidx/compose/runtime/MutableState;", "getNoticeApi", "()Landroidx/compose/runtime/MutableState;", "deleteNotice", "", "noticeEntity", "getNoticeById", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final com.yzdev.mobiletest.domain.repository.NoticeRepository noticeRepositoryImp = null;
    private final com.yzdev.mobiletest.data.dataSource.DbDataSource database = null;
    @org.jetbrains.annotations.NotNull()
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
    public final androidx.compose.runtime.MutableState<com.yzdev.mobiletest.data.repository.UiStatus<java.util.List<com.yzdev.mobiletest.domain.model.entities.NoticeEntity>>> getNoticeApi() {
        return null;
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
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getNoticeById(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.yzdev.mobiletest.domain.model.entities.NoticeEntity> continuation) {
        return null;
    }
}