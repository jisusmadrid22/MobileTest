package com.yzdev.mobiletest.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b)\b\u0086\b\u0018\u00002\u00020\u0001:\u00039:;Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0010\u00a2\u0006\u0002\u0010\u0015J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u000bH\u00c6\u0003J\t\u0010*\u001a\u00020\u0013H\u00c6\u0003J\t\u0010+\u001a\u00020\u0010H\u00c6\u0003J\t\u0010,\u001a\u00020\u0005H\u00c6\u0003J\t\u0010-\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u00c6\u0003J\t\u0010/\u001a\u00020\u000bH\u00c6\u0003J\t\u00100\u001a\u00020\u000bH\u00c6\u0003J\t\u00101\u001a\u00020\u000bH\u00c6\u0003J\t\u00102\u001a\u00020\u000bH\u00c6\u0003J\t\u00103\u001a\u00020\u0010H\u00c6\u0003J\u0087\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0010H\u00c6\u0001J\u0013\u00105\u001a\u00020\u00052\b\u00106\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00107\u001a\u00020\u000bH\u00d6\u0001J\t\u00108\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\f\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0011\u0010\r\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0011\u0010\u000e\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0011\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001eR\u0011\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0014\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010#\u00a8\u0006<"}, d2 = {"Lcom/yzdev/mobiletest/model/NoticeResponse;", "", "exhaustive", "Lcom/yzdev/mobiletest/model/NoticeResponse$Exhaustive;", "exhaustiveNbHits", "", "exhaustiveTypo", "hits", "", "Lcom/yzdev/mobiletest/model/NoticeResponse$Hit;", "hitsPerPage", "", "nbHits", "nbPages", "page", "params", "", "processingTimeMS", "processingTimingsMS", "Lcom/yzdev/mobiletest/model/NoticeResponse$ProcessingTimingsMS;", "query", "(Lcom/yzdev/mobiletest/model/NoticeResponse$Exhaustive;ZZLjava/util/List;IIIILjava/lang/String;ILcom/yzdev/mobiletest/model/NoticeResponse$ProcessingTimingsMS;Ljava/lang/String;)V", "getExhaustive", "()Lcom/yzdev/mobiletest/model/NoticeResponse$Exhaustive;", "getExhaustiveNbHits", "()Z", "getExhaustiveTypo", "getHits", "()Ljava/util/List;", "getHitsPerPage", "()I", "getNbHits", "getNbPages", "getPage", "getParams", "()Ljava/lang/String;", "getProcessingTimeMS", "getProcessingTimingsMS", "()Lcom/yzdev/mobiletest/model/NoticeResponse$ProcessingTimingsMS;", "getQuery", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "Exhaustive", "Hit", "ProcessingTimingsMS", "app_debug"})
public final class NoticeResponse {
    @org.jetbrains.annotations.NotNull()
    private final com.yzdev.mobiletest.model.NoticeResponse.Exhaustive exhaustive = null;
    private final boolean exhaustiveNbHits = false;
    private final boolean exhaustiveTypo = false;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.yzdev.mobiletest.model.NoticeResponse.Hit> hits = null;
    private final int hitsPerPage = 0;
    private final int nbHits = 0;
    private final int nbPages = 0;
    private final int page = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String params = null;
    private final int processingTimeMS = 0;
    @org.jetbrains.annotations.NotNull()
    private final com.yzdev.mobiletest.model.NoticeResponse.ProcessingTimingsMS processingTimingsMS = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String query = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.yzdev.mobiletest.model.NoticeResponse copy(@org.jetbrains.annotations.NotNull()
    com.yzdev.mobiletest.model.NoticeResponse.Exhaustive exhaustive, boolean exhaustiveNbHits, boolean exhaustiveTypo, @org.jetbrains.annotations.NotNull()
    java.util.List<com.yzdev.mobiletest.model.NoticeResponse.Hit> hits, int hitsPerPage, int nbHits, int nbPages, int page, @org.jetbrains.annotations.NotNull()
    java.lang.String params, int processingTimeMS, @org.jetbrains.annotations.NotNull()
    com.yzdev.mobiletest.model.NoticeResponse.ProcessingTimingsMS processingTimingsMS, @org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public NoticeResponse(@org.jetbrains.annotations.NotNull()
    com.yzdev.mobiletest.model.NoticeResponse.Exhaustive exhaustive, boolean exhaustiveNbHits, boolean exhaustiveTypo, @org.jetbrains.annotations.NotNull()
    java.util.List<com.yzdev.mobiletest.model.NoticeResponse.Hit> hits, int hitsPerPage, int nbHits, int nbPages, int page, @org.jetbrains.annotations.NotNull()
    java.lang.String params, int processingTimeMS, @org.jetbrains.annotations.NotNull()
    com.yzdev.mobiletest.model.NoticeResponse.ProcessingTimingsMS processingTimingsMS, @org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.yzdev.mobiletest.model.NoticeResponse.Exhaustive component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.yzdev.mobiletest.model.NoticeResponse.Exhaustive getExhaustive() {
        return null;
    }
    
    public final boolean component2() {
        return false;
    }
    
    public final boolean getExhaustiveNbHits() {
        return false;
    }
    
    public final boolean component3() {
        return false;
    }
    
    public final boolean getExhaustiveTypo() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.yzdev.mobiletest.model.NoticeResponse.Hit> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.yzdev.mobiletest.model.NoticeResponse.Hit> getHits() {
        return null;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getHitsPerPage() {
        return 0;
    }
    
    public final int component6() {
        return 0;
    }
    
    public final int getNbHits() {
        return 0;
    }
    
    public final int component7() {
        return 0;
    }
    
    public final int getNbPages() {
        return 0;
    }
    
    public final int component8() {
        return 0;
    }
    
    public final int getPage() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getParams() {
        return null;
    }
    
    public final int component10() {
        return 0;
    }
    
    public final int getProcessingTimeMS() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.yzdev.mobiletest.model.NoticeResponse.ProcessingTimingsMS component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.yzdev.mobiletest.model.NoticeResponse.ProcessingTimingsMS getProcessingTimingsMS() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getQuery() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/yzdev/mobiletest/model/NoticeResponse$Exhaustive;", "", "nbHits", "", "typo", "(ZZ)V", "getNbHits", "()Z", "getTypo", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "app_debug"})
    public static final class Exhaustive {
        private final boolean nbHits = false;
        private final boolean typo = false;
        
        @org.jetbrains.annotations.NotNull()
        public final com.yzdev.mobiletest.model.NoticeResponse.Exhaustive copy(boolean nbHits, boolean typo) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Exhaustive(boolean nbHits, boolean typo) {
            super();
        }
        
        public final boolean component1() {
            return false;
        }
        
        public final boolean getNbHits() {
            return false;
        }
        
        public final boolean component2() {
            return false;
        }
        
        public final boolean getTypo() {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b5\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001EB\u009f\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0016J\t\u0010.\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010\"J\u0010\u00100\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010\"J\u000b\u00101\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u00107\u001a\u00020\u0006H\u00c6\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u00109\u001a\u00020\u0006H\u00c6\u0003J\t\u0010:\u001a\u00020\u000bH\u00c6\u0003J\u0010\u0010;\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010\"J\t\u0010<\u001a\u00020\u0006H\u00c6\u0003J\u0010\u0010=\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010\"J\u00c8\u0001\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0002\u0010?J\u0013\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010C\u001a\u00020\u000bH\u00d6\u0001J\t\u0010D\u001a\u00020\u0006H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0011\u0010\r\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001cR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\n\n\u0002\u0010#\u001a\u0004\b%\u0010\"R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\n\n\u0002\u0010#\u001a\u0004\b&\u0010\"R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\n\n\u0002\u0010#\u001a\u0004\b\'\u0010\"R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001cR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001cR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001cR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001c\u00a8\u0006F"}, d2 = {"Lcom/yzdev/mobiletest/model/NoticeResponse$Hit;", "", "_highlightResult", "Lcom/yzdev/mobiletest/model/NoticeResponse$Hit$HighlightResult;", "_tags", "", "", "author", "comment_text", "created_at", "created_at_i", "", "num_comments", "objectID", "parent_id", "points", "story_id", "story_text", "story_title", "story_url", "title", "url", "(Lcom/yzdev/mobiletest/model/NoticeResponse$Hit$HighlightResult;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "get_highlightResult", "()Lcom/yzdev/mobiletest/model/NoticeResponse$Hit$HighlightResult;", "get_tags", "()Ljava/util/List;", "getAuthor", "()Ljava/lang/String;", "getComment_text", "getCreated_at", "getCreated_at_i", "()I", "getNum_comments", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getObjectID", "getParent_id", "getPoints", "getStory_id", "getStory_text", "()Ljava/lang/Object;", "getStory_title", "getStory_url", "getTitle", "getUrl", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/yzdev/mobiletest/model/NoticeResponse$Hit$HighlightResult;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/yzdev/mobiletest/model/NoticeResponse$Hit;", "equals", "", "other", "hashCode", "toString", "HighlightResult", "app_debug"})
    public static final class Hit {
        @org.jetbrains.annotations.NotNull()
        private final com.yzdev.mobiletest.model.NoticeResponse.Hit.HighlightResult _highlightResult = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<java.lang.String> _tags = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String author = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String comment_text = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String created_at = null;
        private final int created_at_i = 0;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer num_comments = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String objectID = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer parent_id = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer points = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer story_id = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Object story_text = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String story_title = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String story_url = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String title = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String url = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.yzdev.mobiletest.model.NoticeResponse.Hit copy(@org.jetbrains.annotations.NotNull()
        com.yzdev.mobiletest.model.NoticeResponse.Hit.HighlightResult _highlightResult, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> _tags, @org.jetbrains.annotations.NotNull()
        java.lang.String author, @org.jetbrains.annotations.Nullable()
        java.lang.String comment_text, @org.jetbrains.annotations.NotNull()
        java.lang.String created_at, int created_at_i, @org.jetbrains.annotations.Nullable()
        java.lang.Integer num_comments, @org.jetbrains.annotations.NotNull()
        java.lang.String objectID, @org.jetbrains.annotations.Nullable()
        java.lang.Integer parent_id, @org.jetbrains.annotations.Nullable()
        java.lang.Integer points, @org.jetbrains.annotations.Nullable()
        java.lang.Integer story_id, @org.jetbrains.annotations.Nullable()
        java.lang.Object story_text, @org.jetbrains.annotations.Nullable()
        java.lang.String story_title, @org.jetbrains.annotations.Nullable()
        java.lang.String story_url, @org.jetbrains.annotations.Nullable()
        java.lang.String title, @org.jetbrains.annotations.Nullable()
        java.lang.String url) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Hit(@org.jetbrains.annotations.NotNull()
        com.yzdev.mobiletest.model.NoticeResponse.Hit.HighlightResult _highlightResult, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> _tags, @org.jetbrains.annotations.NotNull()
        java.lang.String author, @org.jetbrains.annotations.Nullable()
        java.lang.String comment_text, @org.jetbrains.annotations.NotNull()
        java.lang.String created_at, int created_at_i, @org.jetbrains.annotations.Nullable()
        java.lang.Integer num_comments, @org.jetbrains.annotations.NotNull()
        java.lang.String objectID, @org.jetbrains.annotations.Nullable()
        java.lang.Integer parent_id, @org.jetbrains.annotations.Nullable()
        java.lang.Integer points, @org.jetbrains.annotations.Nullable()
        java.lang.Integer story_id, @org.jetbrains.annotations.Nullable()
        java.lang.Object story_text, @org.jetbrains.annotations.Nullable()
        java.lang.String story_title, @org.jetbrains.annotations.Nullable()
        java.lang.String story_url, @org.jetbrains.annotations.Nullable()
        java.lang.String title, @org.jetbrains.annotations.Nullable()
        java.lang.String url) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.yzdev.mobiletest.model.NoticeResponse.Hit.HighlightResult component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.yzdev.mobiletest.model.NoticeResponse.Hit.HighlightResult get_highlightResult() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> get_tags() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getAuthor() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getComment_text() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCreated_at() {
            return null;
        }
        
        public final int component6() {
            return 0;
        }
        
        public final int getCreated_at_i() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component7() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getNum_comments() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component8() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getObjectID() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component9() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getParent_id() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component10() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getPoints() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component11() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getStory_id() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object component12() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getStory_text() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component13() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getStory_title() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component14() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getStory_url() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component15() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component16() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getUrl() {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001:\u0006)*+,-.B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\rH\u00c6\u0003JO\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rH\u00c6\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010%\u001a\u00020&H\u00d6\u0001J\t\u0010\'\u001a\u00020(H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006/"}, d2 = {"Lcom/yzdev/mobiletest/model/NoticeResponse$Hit$HighlightResult;", "", "author", "Lcom/yzdev/mobiletest/model/NoticeResponse$Hit$HighlightResult$Author;", "comment_text", "Lcom/yzdev/mobiletest/model/NoticeResponse$Hit$HighlightResult$CommentText;", "story_title", "Lcom/yzdev/mobiletest/model/NoticeResponse$Hit$HighlightResult$StoryTitle;", "story_url", "Lcom/yzdev/mobiletest/model/NoticeResponse$Hit$HighlightResult$StoryUrl;", "title", "Lcom/yzdev/mobiletest/model/NoticeResponse$Hit$HighlightResult$Title;", "url", "Lcom/yzdev/mobiletest/model/NoticeResponse$Hit$HighlightResult$Url;", "(Lcom/yzdev/mobiletest/model/NoticeResponse$Hit$HighlightResult$Author;Lcom/yzdev/mobiletest/model/NoticeResponse$Hit$HighlightResult$CommentText;Lcom/yzdev/mobiletest/model/NoticeResponse$Hit$HighlightResult$StoryTitle;Lcom/yzdev/mobiletest/model/NoticeResponse$Hit$HighlightResult$StoryUrl;Lcom/yzdev/mobiletest/model/NoticeResponse$Hit$HighlightResult$Title;Lcom/yzdev/mobiletest/model/NoticeResponse$Hit$HighlightResult$Url;)V", "getAuthor", "()Lcom/yzdev/mobiletest/model/NoticeResponse$Hit$HighlightResult$Author;", "getComment_text", "()Lcom/yzdev/mobiletest/model/NoticeResponse$Hit$HighlightResult$CommentText;", "getStory_title", "()Lcom/yzdev/mobiletest/model/NoticeResponse$Hit$HighlightResult$StoryTitle;", "getStory_url", "()Lcom/yzdev/mobiletest/model/NoticeResponse$Hit$HighlightResult$StoryUrl;", "getTitle", "()Lcom/yzdev/mobiletest/model/NoticeResponse$Hit$HighlightResult$Title;", "getUrl", "()Lcom/yzdev/mobiletest/model/NoticeResponse$Hit$HighlightResult$Url;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Author", "CommentText", "StoryTitle", "StoryUrl", "Title", "Url", "app_debug"})
        public static final class HighlightResult {
            @org.jetbrains.annotations.NotNull()
            private final com.yzdev.mobiletest.model.NoticeResponse.Hit.HighlightResult.Author author = null;
            @org.jetbrains.annotations.Nullable()
            private final com.yzdev.mobiletest.model.NoticeResponse.Hit.HighlightResult.CommentText comment_text = null;
            @org.jetbrains.annotations.Nullable()
            private final com.yzdev.mobiletest.model.NoticeResponse.Hit.HighlightResult.StoryTitle story_title = null;
            @org.jetbrains.annotations.Nullable()
            private final com.yzdev.mobiletest.model.NoticeResponse.Hit.HighlightResult.StoryUrl story_url = null;
            @org.jetbrains.annotations.Nullable()
            private final com.yzdev.mobiletest.model.NoticeResponse.Hit.HighlightResult.Title title = null;
            @org.jetbrains.annotations.Nullable()
            private final com.yzdev.mobiletest.model.NoticeResponse.Hit.HighlightResult.Url url = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.yzdev.mobiletest.model.NoticeResponse.Hit.HighlightResult copy(@org.jetbrains.annotations.NotNull()
            com.yzdev.mobiletest.model.NoticeResponse.Hit.HighlightResult.Author author, @org.jetbrains.annotations.Nullable()
            com.yzdev.mobiletest.model.NoticeResponse.Hit.HighlightResult.CommentText comment_text, @org.jetbrains.annotations.Nullable()
            com.yzdev.mobiletest.model.NoticeResponse.Hit.HighlightResult.StoryTitle story_title, @org.jetbrains.annotations.Nullable()
            com.yzdev.mobiletest.model.NoticeResponse.Hit.HighlightResult.StoryUrl story_url, @org.jetbrains.annotations.Nullable()
            com.yzdev.mobiletest.model.NoticeResponse.Hit.HighlightResult.Title title, @org.jetbrains.annotations.Nullable()
            com.yzdev.mobiletest.model.NoticeResponse.Hit.HighlightResult.Url url) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public HighlightResult(@org.jetbrains.annotations.NotNull()
            com.yzdev.mobiletest.model.NoticeResponse.Hit.HighlightResult.Author author, @org.jetbrains.annotations.Nullable()
            com.yzdev.mobiletest.model.NoticeResponse.Hit.HighlightResult.CommentText comment_text, @org.jetbrains.annotations.Nullable()
            com.yzdev.mobiletest.model.NoticeResponse.Hit.HighlightResult.StoryTitle story_title, @org.jetbrains.annotations.Nullable()
            com.yzdev.mobiletest.model.NoticeResponse.Hit.HighlightResult.StoryUrl story_url, @org.jetbrains.annotations.Nullable()
            com.yzdev.mobiletest.model.NoticeResponse.Hit.HighlightResult.Title title, @org.jetbrains.annotations.Nullable()
            com.yzdev.mobiletest.model.NoticeResponse.Hit.HighlightResult.Url url) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.yzdev.mobiletest.model.NoticeResponse.Hit.HighlightResult.Author component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.yzdev.mobiletest.model.NoticeResponse.Hit.HighlightResult.Author getAuthor() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.yzdev.mobiletest.model.NoticeResponse.Hit.HighlightResult.CommentText component2() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.yzdev.mobiletest.model.NoticeResponse.Hit.HighlightResult.CommentText getComment_text() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.yzdev.mobiletest.model.NoticeResponse.Hit.HighlightResult.StoryTitle component3() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.yzdev.mobiletest.model.NoticeResponse.Hit.HighlightResult.StoryTitle getStory_title() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.yzdev.mobiletest.model.NoticeResponse.Hit.HighlightResult.StoryUrl component4() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.yzdev.mobiletest.model.NoticeResponse.Hit.HighlightResult.StoryUrl getStory_url() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.yzdev.mobiletest.model.NoticeResponse.Hit.HighlightResult.Title component5() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.yzdev.mobiletest.model.NoticeResponse.Hit.HighlightResult.Title getTitle() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.yzdev.mobiletest.model.NoticeResponse.Hit.HighlightResult.Url component6() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.yzdev.mobiletest.model.NoticeResponse.Hit.HighlightResult.Url getUrl() {
                return null;
            }
            
            @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J-\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u00a8\u0006\u0017"}, d2 = {"Lcom/yzdev/mobiletest/model/NoticeResponse$Hit$HighlightResult$Author;", "", "matchLevel", "", "matchedWords", "", "value", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getMatchLevel", "()Ljava/lang/String;", "getMatchedWords", "()Ljava/util/List;", "getValue", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
            public static final class Author {
                @org.jetbrains.annotations.NotNull()
                private final java.lang.String matchLevel = null;
                @org.jetbrains.annotations.NotNull()
                private final java.util.List<java.lang.Object> matchedWords = null;
                @org.jetbrains.annotations.NotNull()
                private final java.lang.String value = null;
                
                @org.jetbrains.annotations.NotNull()
                public final com.yzdev.mobiletest.model.NoticeResponse.Hit.HighlightResult.Author copy(@org.jetbrains.annotations.NotNull()
                java.lang.String matchLevel, @org.jetbrains.annotations.NotNull()
                java.util.List<? extends java.lang.Object> matchedWords, @org.jetbrains.annotations.NotNull()
                java.lang.String value) {
                    return null;
                }
                
                @java.lang.Override()
                public boolean equals(@org.jetbrains.annotations.Nullable()
                java.lang.Object other) {
                    return false;
                }
                
                @java.lang.Override()
                public int hashCode() {
                    return 0;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public java.lang.String toString() {
                    return null;
                }
                
                public Author(@org.jetbrains.annotations.NotNull()
                java.lang.String matchLevel, @org.jetbrains.annotations.NotNull()
                java.util.List<? extends java.lang.Object> matchedWords, @org.jetbrains.annotations.NotNull()
                java.lang.String value) {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                public final java.lang.String component1() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                public final java.lang.String getMatchLevel() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                public final java.util.List<java.lang.Object> component2() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                public final java.util.List<java.lang.Object> getMatchedWords() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                public final java.lang.String component3() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                public final java.lang.String getValue() {
                    return null;
                }
            }
            
            @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r\u00a8\u0006\u001b"}, d2 = {"Lcom/yzdev/mobiletest/model/NoticeResponse$Hit$HighlightResult$CommentText;", "", "fullyHighlighted", "", "matchLevel", "", "matchedWords", "", "value", "(ZLjava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getFullyHighlighted", "()Z", "getMatchLevel", "()Ljava/lang/String;", "getMatchedWords", "()Ljava/util/List;", "getValue", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"})
            public static final class CommentText {
                private final boolean fullyHighlighted = false;
                @org.jetbrains.annotations.NotNull()
                private final java.lang.String matchLevel = null;
                @org.jetbrains.annotations.NotNull()
                private final java.util.List<java.lang.String> matchedWords = null;
                @org.jetbrains.annotations.NotNull()
                private final java.lang.String value = null;
                
                @org.jetbrains.annotations.NotNull()
                public final com.yzdev.mobiletest.model.NoticeResponse.Hit.HighlightResult.CommentText copy(boolean fullyHighlighted, @org.jetbrains.annotations.NotNull()
                java.lang.String matchLevel, @org.jetbrains.annotations.NotNull()
                java.util.List<java.lang.String> matchedWords, @org.jetbrains.annotations.NotNull()
                java.lang.String value) {
                    return null;
                }
                
                @java.lang.Override()
                public boolean equals(@org.jetbrains.annotations.Nullable()
                java.lang.Object other) {
                    return false;
                }
                
                @java.lang.Override()
                public int hashCode() {
                    return 0;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public java.lang.String toString() {
                    return null;
                }
                
                public CommentText(boolean fullyHighlighted, @org.jetbrains.annotations.NotNull()
                java.lang.String matchLevel, @org.jetbrains.annotations.NotNull()
                java.util.List<java.lang.String> matchedWords, @org.jetbrains.annotations.NotNull()
                java.lang.String value) {
                    super();
                }
                
                public final boolean component1() {
                    return false;
                }
                
                public final boolean getFullyHighlighted() {
                    return false;
                }
                
                @org.jetbrains.annotations.NotNull()
                public final java.lang.String component2() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                public final java.lang.String getMatchLevel() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                public final java.util.List<java.lang.String> component3() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                public final java.util.List<java.lang.String> getMatchedWords() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                public final java.lang.String component4() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                public final java.lang.String getValue() {
                    return null;
                }
            }
            
            @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J-\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u00a8\u0006\u0017"}, d2 = {"Lcom/yzdev/mobiletest/model/NoticeResponse$Hit$HighlightResult$StoryTitle;", "", "matchLevel", "", "matchedWords", "", "value", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getMatchLevel", "()Ljava/lang/String;", "getMatchedWords", "()Ljava/util/List;", "getValue", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
            public static final class StoryTitle {
                @org.jetbrains.annotations.NotNull()
                private final java.lang.String matchLevel = null;
                @org.jetbrains.annotations.NotNull()
                private final java.util.List<java.lang.Object> matchedWords = null;
                @org.jetbrains.annotations.NotNull()
                private final java.lang.String value = null;
                
                @org.jetbrains.annotations.NotNull()
                public final com.yzdev.mobiletest.model.NoticeResponse.Hit.HighlightResult.StoryTitle copy(@org.jetbrains.annotations.NotNull()
                java.lang.String matchLevel, @org.jetbrains.annotations.NotNull()
                java.util.List<? extends java.lang.Object> matchedWords, @org.jetbrains.annotations.NotNull()
                java.lang.String value) {
                    return null;
                }
                
                @java.lang.Override()
                public boolean equals(@org.jetbrains.annotations.Nullable()
                java.lang.Object other) {
                    return false;
                }
                
                @java.lang.Override()
                public int hashCode() {
                    return 0;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public java.lang.String toString() {
                    return null;
                }
                
                public StoryTitle(@org.jetbrains.annotations.NotNull()
                java.lang.String matchLevel, @org.jetbrains.annotations.NotNull()
                java.util.List<? extends java.lang.Object> matchedWords, @org.jetbrains.annotations.NotNull()
                java.lang.String value) {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                public final java.lang.String component1() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                public final java.lang.String getMatchLevel() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                public final java.util.List<java.lang.Object> component2() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                public final java.util.List<java.lang.Object> getMatchedWords() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                public final java.lang.String component3() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                public final java.lang.String getValue() {
                    return null;
                }
            }
            
            @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J-\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u00a8\u0006\u0017"}, d2 = {"Lcom/yzdev/mobiletest/model/NoticeResponse$Hit$HighlightResult$StoryUrl;", "", "matchLevel", "", "matchedWords", "", "value", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getMatchLevel", "()Ljava/lang/String;", "getMatchedWords", "()Ljava/util/List;", "getValue", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
            public static final class StoryUrl {
                @org.jetbrains.annotations.NotNull()
                private final java.lang.String matchLevel = null;
                @org.jetbrains.annotations.NotNull()
                private final java.util.List<java.lang.Object> matchedWords = null;
                @org.jetbrains.annotations.NotNull()
                private final java.lang.String value = null;
                
                @org.jetbrains.annotations.NotNull()
                public final com.yzdev.mobiletest.model.NoticeResponse.Hit.HighlightResult.StoryUrl copy(@org.jetbrains.annotations.NotNull()
                java.lang.String matchLevel, @org.jetbrains.annotations.NotNull()
                java.util.List<? extends java.lang.Object> matchedWords, @org.jetbrains.annotations.NotNull()
                java.lang.String value) {
                    return null;
                }
                
                @java.lang.Override()
                public boolean equals(@org.jetbrains.annotations.Nullable()
                java.lang.Object other) {
                    return false;
                }
                
                @java.lang.Override()
                public int hashCode() {
                    return 0;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public java.lang.String toString() {
                    return null;
                }
                
                public StoryUrl(@org.jetbrains.annotations.NotNull()
                java.lang.String matchLevel, @org.jetbrains.annotations.NotNull()
                java.util.List<? extends java.lang.Object> matchedWords, @org.jetbrains.annotations.NotNull()
                java.lang.String value) {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                public final java.lang.String component1() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                public final java.lang.String getMatchLevel() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                public final java.util.List<java.lang.Object> component2() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                public final java.util.List<java.lang.Object> getMatchedWords() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                public final java.lang.String component3() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                public final java.lang.String getValue() {
                    return null;
                }
            }
            
            @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r\u00a8\u0006\u001b"}, d2 = {"Lcom/yzdev/mobiletest/model/NoticeResponse$Hit$HighlightResult$Title;", "", "fullyHighlighted", "", "matchLevel", "", "matchedWords", "", "value", "(ZLjava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getFullyHighlighted", "()Z", "getMatchLevel", "()Ljava/lang/String;", "getMatchedWords", "()Ljava/util/List;", "getValue", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"})
            public static final class Title {
                private final boolean fullyHighlighted = false;
                @org.jetbrains.annotations.NotNull()
                private final java.lang.String matchLevel = null;
                @org.jetbrains.annotations.NotNull()
                private final java.util.List<java.lang.String> matchedWords = null;
                @org.jetbrains.annotations.NotNull()
                private final java.lang.String value = null;
                
                @org.jetbrains.annotations.NotNull()
                public final com.yzdev.mobiletest.model.NoticeResponse.Hit.HighlightResult.Title copy(boolean fullyHighlighted, @org.jetbrains.annotations.NotNull()
                java.lang.String matchLevel, @org.jetbrains.annotations.NotNull()
                java.util.List<java.lang.String> matchedWords, @org.jetbrains.annotations.NotNull()
                java.lang.String value) {
                    return null;
                }
                
                @java.lang.Override()
                public boolean equals(@org.jetbrains.annotations.Nullable()
                java.lang.Object other) {
                    return false;
                }
                
                @java.lang.Override()
                public int hashCode() {
                    return 0;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public java.lang.String toString() {
                    return null;
                }
                
                public Title(boolean fullyHighlighted, @org.jetbrains.annotations.NotNull()
                java.lang.String matchLevel, @org.jetbrains.annotations.NotNull()
                java.util.List<java.lang.String> matchedWords, @org.jetbrains.annotations.NotNull()
                java.lang.String value) {
                    super();
                }
                
                public final boolean component1() {
                    return false;
                }
                
                public final boolean getFullyHighlighted() {
                    return false;
                }
                
                @org.jetbrains.annotations.NotNull()
                public final java.lang.String component2() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                public final java.lang.String getMatchLevel() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                public final java.util.List<java.lang.String> component3() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                public final java.util.List<java.lang.String> getMatchedWords() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                public final java.lang.String component4() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                public final java.lang.String getValue() {
                    return null;
                }
            }
            
            @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r\u00a8\u0006\u001b"}, d2 = {"Lcom/yzdev/mobiletest/model/NoticeResponse$Hit$HighlightResult$Url;", "", "fullyHighlighted", "", "matchLevel", "", "matchedWords", "", "value", "(ZLjava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getFullyHighlighted", "()Z", "getMatchLevel", "()Ljava/lang/String;", "getMatchedWords", "()Ljava/util/List;", "getValue", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"})
            public static final class Url {
                private final boolean fullyHighlighted = false;
                @org.jetbrains.annotations.NotNull()
                private final java.lang.String matchLevel = null;
                @org.jetbrains.annotations.NotNull()
                private final java.util.List<java.lang.String> matchedWords = null;
                @org.jetbrains.annotations.NotNull()
                private final java.lang.String value = null;
                
                @org.jetbrains.annotations.NotNull()
                public final com.yzdev.mobiletest.model.NoticeResponse.Hit.HighlightResult.Url copy(boolean fullyHighlighted, @org.jetbrains.annotations.NotNull()
                java.lang.String matchLevel, @org.jetbrains.annotations.NotNull()
                java.util.List<java.lang.String> matchedWords, @org.jetbrains.annotations.NotNull()
                java.lang.String value) {
                    return null;
                }
                
                @java.lang.Override()
                public boolean equals(@org.jetbrains.annotations.Nullable()
                java.lang.Object other) {
                    return false;
                }
                
                @java.lang.Override()
                public int hashCode() {
                    return 0;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public java.lang.String toString() {
                    return null;
                }
                
                public Url(boolean fullyHighlighted, @org.jetbrains.annotations.NotNull()
                java.lang.String matchLevel, @org.jetbrains.annotations.NotNull()
                java.util.List<java.lang.String> matchedWords, @org.jetbrains.annotations.NotNull()
                java.lang.String value) {
                    super();
                }
                
                public final boolean component1() {
                    return false;
                }
                
                public final boolean getFullyHighlighted() {
                    return false;
                }
                
                @org.jetbrains.annotations.NotNull()
                public final java.lang.String component2() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                public final java.lang.String getMatchLevel() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                public final java.util.List<java.lang.String> component3() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                public final java.util.List<java.lang.String> getMatchedWords() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                public final java.lang.String component4() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                public final java.lang.String getValue() {
                    return null;
                }
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0019\u001aB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001b"}, d2 = {"Lcom/yzdev/mobiletest/model/NoticeResponse$ProcessingTimingsMS;", "", "afterFetch", "Lcom/yzdev/mobiletest/model/NoticeResponse$ProcessingTimingsMS$AfterFetch;", "fetch", "Lcom/yzdev/mobiletest/model/NoticeResponse$ProcessingTimingsMS$Fetch;", "total", "", "(Lcom/yzdev/mobiletest/model/NoticeResponse$ProcessingTimingsMS$AfterFetch;Lcom/yzdev/mobiletest/model/NoticeResponse$ProcessingTimingsMS$Fetch;I)V", "getAfterFetch", "()Lcom/yzdev/mobiletest/model/NoticeResponse$ProcessingTimingsMS$AfterFetch;", "getFetch", "()Lcom/yzdev/mobiletest/model/NoticeResponse$ProcessingTimingsMS$Fetch;", "getTotal", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "AfterFetch", "Fetch", "app_debug"})
    public static final class ProcessingTimingsMS {
        @org.jetbrains.annotations.NotNull()
        private final com.yzdev.mobiletest.model.NoticeResponse.ProcessingTimingsMS.AfterFetch afterFetch = null;
        @org.jetbrains.annotations.NotNull()
        private final com.yzdev.mobiletest.model.NoticeResponse.ProcessingTimingsMS.Fetch fetch = null;
        private final int total = 0;
        
        @org.jetbrains.annotations.NotNull()
        public final com.yzdev.mobiletest.model.NoticeResponse.ProcessingTimingsMS copy(@org.jetbrains.annotations.NotNull()
        com.yzdev.mobiletest.model.NoticeResponse.ProcessingTimingsMS.AfterFetch afterFetch, @org.jetbrains.annotations.NotNull()
        com.yzdev.mobiletest.model.NoticeResponse.ProcessingTimingsMS.Fetch fetch, int total) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public ProcessingTimingsMS(@org.jetbrains.annotations.NotNull()
        com.yzdev.mobiletest.model.NoticeResponse.ProcessingTimingsMS.AfterFetch afterFetch, @org.jetbrains.annotations.NotNull()
        com.yzdev.mobiletest.model.NoticeResponse.ProcessingTimingsMS.Fetch fetch, int total) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.yzdev.mobiletest.model.NoticeResponse.ProcessingTimingsMS.AfterFetch component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.yzdev.mobiletest.model.NoticeResponse.ProcessingTimingsMS.AfterFetch getAfterFetch() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.yzdev.mobiletest.model.NoticeResponse.ProcessingTimingsMS.Fetch component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.yzdev.mobiletest.model.NoticeResponse.ProcessingTimingsMS.Fetch getFetch() {
            return null;
        }
        
        public final int component3() {
            return 0;
        }
        
        public final int getTotal() {
            return 0;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0014B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lcom/yzdev/mobiletest/model/NoticeResponse$ProcessingTimingsMS$AfterFetch;", "", "format", "Lcom/yzdev/mobiletest/model/NoticeResponse$ProcessingTimingsMS$AfterFetch$Format;", "total", "", "(Lcom/yzdev/mobiletest/model/NoticeResponse$ProcessingTimingsMS$AfterFetch$Format;I)V", "getFormat", "()Lcom/yzdev/mobiletest/model/NoticeResponse$ProcessingTimingsMS$AfterFetch$Format;", "getTotal", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "Format", "app_debug"})
        public static final class AfterFetch {
            @org.jetbrains.annotations.NotNull()
            private final com.yzdev.mobiletest.model.NoticeResponse.ProcessingTimingsMS.AfterFetch.Format format = null;
            private final int total = 0;
            
            @org.jetbrains.annotations.NotNull()
            public final com.yzdev.mobiletest.model.NoticeResponse.ProcessingTimingsMS.AfterFetch copy(@org.jetbrains.annotations.NotNull()
            com.yzdev.mobiletest.model.NoticeResponse.ProcessingTimingsMS.AfterFetch.Format format, int total) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public AfterFetch(@org.jetbrains.annotations.NotNull()
            com.yzdev.mobiletest.model.NoticeResponse.ProcessingTimingsMS.AfterFetch.Format format, int total) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.yzdev.mobiletest.model.NoticeResponse.ProcessingTimingsMS.AfterFetch.Format component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.yzdev.mobiletest.model.NoticeResponse.ProcessingTimingsMS.AfterFetch.Format getFormat() {
                return null;
            }
            
            public final int component2() {
                return 0;
            }
            
            public final int getTotal() {
                return 0;
            }
            
            @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/yzdev/mobiletest/model/NoticeResponse$ProcessingTimingsMS$AfterFetch$Format;", "", "highlighting", "", "total", "(II)V", "getHighlighting", "()I", "getTotal", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
            public static final class Format {
                private final int highlighting = 0;
                private final int total = 0;
                
                @org.jetbrains.annotations.NotNull()
                public final com.yzdev.mobiletest.model.NoticeResponse.ProcessingTimingsMS.AfterFetch.Format copy(int highlighting, int total) {
                    return null;
                }
                
                @java.lang.Override()
                public boolean equals(@org.jetbrains.annotations.Nullable()
                java.lang.Object other) {
                    return false;
                }
                
                @java.lang.Override()
                public int hashCode() {
                    return 0;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public java.lang.String toString() {
                    return null;
                }
                
                public Format(int highlighting, int total) {
                    super();
                }
                
                public final int component1() {
                    return 0;
                }
                
                public final int getHighlighting() {
                    return 0;
                }
                
                public final int component2() {
                    return 0;
                }
                
                public final int getTotal() {
                    return 0;
                }
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\f\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000f"}, d2 = {"Lcom/yzdev/mobiletest/model/NoticeResponse$ProcessingTimingsMS$Fetch;", "", "total", "", "(I)V", "getTotal", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
        public static final class Fetch {
            private final int total = 0;
            
            @org.jetbrains.annotations.NotNull()
            public final com.yzdev.mobiletest.model.NoticeResponse.ProcessingTimingsMS.Fetch copy(int total) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public Fetch(int total) {
                super();
            }
            
            public final int component1() {
                return 0;
            }
            
            public final int getTotal() {
                return 0;
            }
        }
    }
}