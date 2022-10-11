package com.yzdev.mobiletest.data.dataSource;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bg\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nH\'J\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u000b0\nH\'J\u001b\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0006\u001a\u00020\u0007H\'J\u001f\u0010\u0011\u001a\u00020\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lcom/yzdev/mobiletest/data/dataSource/NoticeDao;", "", "deleteNotice", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteNoticeId", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllArchived", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/yzdev/mobiletest/domain/model/entities/ArchivedNotices;", "getAllNotice", "Lcom/yzdev/mobiletest/domain/model/entities/NoticeEntity;", "getArchive", "getNotice", "insertNotice", "noticeList", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insetArchived", "notice", "(Lcom/yzdev/mobiletest/domain/model/entities/ArchivedNotices;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface NoticeDao {
    
    /**
     * notices list
     */
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertNotice(@org.jetbrains.annotations.NotNull()
    java.util.List<com.yzdev.mobiletest.domain.model.entities.NoticeEntity> noticeList, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM NoticeTable")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.yzdev.mobiletest.domain.model.entities.NoticeEntity>> getAllNotice();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM NoticeTable WHERE id = :id")
    public abstract com.yzdev.mobiletest.domain.model.entities.NoticeEntity getNotice(int id);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM NoticeTable")
    public abstract java.lang.Object deleteNotice(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM NoticeTable WHERE id = :id")
    public abstract java.lang.Object deleteNoticeId(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    /**
     * archive notices
     */
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insetArchived(@org.jetbrains.annotations.NotNull()
    com.yzdev.mobiletest.domain.model.entities.ArchivedNotices notice, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM ArchivedNotices WHERE id = :id")
    public abstract java.lang.Object getArchive(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.yzdev.mobiletest.domain.model.entities.ArchivedNotices> continuation);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM ArchivedNotices")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.yzdev.mobiletest.domain.model.entities.ArchivedNotices>> getAllArchived();
}