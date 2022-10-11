package com.yzdev.mobiletest.data.dataSource;

import java.lang.System;

@androidx.room.Database(entities = {com.yzdev.mobiletest.domain.model.entities.NoticeEntity.class, com.yzdev.mobiletest.domain.model.entities.ArchivedNotices.class}, version = 2)
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lcom/yzdev/mobiletest/data/dataSource/DbDataSource;", "Landroidx/room/RoomDatabase;", "()V", "noticeDao", "Lcom/yzdev/mobiletest/data/dataSource/NoticeDao;", "app_debug"})
public abstract class DbDataSource extends androidx.room.RoomDatabase {
    
    public DbDataSource() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.yzdev.mobiletest.data.dataSource.NoticeDao noticeDao();
}