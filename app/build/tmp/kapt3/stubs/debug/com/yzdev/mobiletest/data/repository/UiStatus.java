package com.yzdev.mobiletest.data.repository;

import java.lang.System;

/**
 * Clase para controlar los diferentes estados de la interfaz con respecto a las consultas
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0004\f\r\u000e\u000fB\u001b\b\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006R\u0015\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0004\u0010\u0011\u0012\u0013\u00a8\u0006\u0014"}, d2 = {"Lcom/yzdev/mobiletest/data/repository/UiStatus;", "Type", "", "get", "message", "", "(Ljava/lang/Object;Ljava/lang/String;)V", "getGet", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getMessage", "()Ljava/lang/String;", "Default", "Failure", "Loading", "Success", "Lcom/yzdev/mobiletest/data/repository/UiStatus$Success;", "Lcom/yzdev/mobiletest/data/repository/UiStatus$Failure;", "Lcom/yzdev/mobiletest/data/repository/UiStatus$Loading;", "Lcom/yzdev/mobiletest/data/repository/UiStatus$Default;", "app_debug"})
public abstract class UiStatus<Type extends java.lang.Object> {
    @org.jetbrains.annotations.Nullable()
    private final Type get = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String message = null;
    
    private UiStatus(Type get, java.lang.String message) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final Type getGet() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMessage() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u00a2\u0006\u0002\u0010\u0004R\u0010\u0010\u0003\u001a\u00028\u0001X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/yzdev/mobiletest/data/repository/UiStatus$Success;", "Type", "Lcom/yzdev/mobiletest/data/repository/UiStatus;", "data", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "app_debug"})
    public static final class Success<Type extends java.lang.Object> extends com.yzdev.mobiletest.data.repository.UiStatus<Type> {
        private final Type data = null;
        
        public Success(Type data) {
            super(null, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/yzdev/mobiletest/data/repository/UiStatus$Failure;", "Type", "Lcom/yzdev/mobiletest/data/repository/UiStatus;", "msg", "", "(Ljava/lang/String;)V", "app_debug"})
    public static final class Failure<Type extends java.lang.Object> extends com.yzdev.mobiletest.data.repository.UiStatus<Type> {
        private final java.lang.String msg = null;
        
        public Failure(@org.jetbrains.annotations.NotNull()
        java.lang.String msg) {
            super(null, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/yzdev/mobiletest/data/repository/UiStatus$Loading;", "Type", "Lcom/yzdev/mobiletest/data/repository/UiStatus;", "()V", "app_debug"})
    public static final class Loading<Type extends java.lang.Object> extends com.yzdev.mobiletest.data.repository.UiStatus<Type> {
        
        public Loading() {
            super(null, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/yzdev/mobiletest/data/repository/UiStatus$Default;", "Type", "Lcom/yzdev/mobiletest/data/repository/UiStatus;", "()V", "app_debug"})
    public static final class Default<Type extends java.lang.Object> extends com.yzdev.mobiletest.data.repository.UiStatus<Type> {
        
        public Default() {
            super(null, null);
        }
    }
}