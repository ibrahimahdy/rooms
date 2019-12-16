package com.ut.iot.rooms.util;

import java.lang.System;

/**
 * Created by Saeed on 17/11/2019.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0006\u0010!\u001a\u00020\"J\u001a\u0010#\u001a\u00020\"2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\tH\u0016J\u0014\u0010&\u001a\u00020\"2\f\u0010\'\u001a\b\u0012\u0004\u0012\u00020\"0(J\u0014\u0010)\u001a\u00020\"2\f\u0010\'\u001a\b\u0012\u0004\u0012\u00020\"0(J\u0006\u0010*\u001a\u00020\"J\f\u0010+\u001a\u00020\"*\u00020,H\u0002J\f\u0010-\u001a\u00020\"*\u00020,H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u00020\t8\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u00020\t8\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R$\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001d\u00a8\u0006."}, d2 = {"Lcom/ut/iot/rooms/util/BannerNotification;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "_bannerContent", "", "_bannerTitle", "_leftButtonText", "_rightButtonText", "value", "bannerContent", "getBannerContent", "()Ljava/lang/String;", "setBannerContent", "(Ljava/lang/String;)V", "bannerTitle", "getBannerTitle", "setBannerTitle", "leftButtonText", "getLeftButtonText", "()I", "setLeftButtonText", "(I)V", "rightButtonText", "getRightButtonText", "setRightButtonText", "dismiss", "", "init", "setBackgroundResource", "resid", "setLeftButtonAction", "action", "Lkotlin/Function0;", "setRightButtonAction", "show", "collapse", "Landroid/view/View;", "expand", "app_debug"})
public final class BannerNotification extends androidx.coordinatorlayout.widget.CoordinatorLayout {
    private java.lang.String _bannerTitle;
    private java.lang.String _bannerContent;
    @androidx.annotation.StringRes()
    private int _rightButtonText;
    @androidx.annotation.StringRes()
    private int _leftButtonText;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBannerTitle() {
        return null;
    }
    
    public final void setBannerTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBannerContent() {
        return null;
    }
    
    public final void setBannerContent(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    public final int getRightButtonText() {
        return 0;
    }
    
    public final void setRightButtonText(int value) {
    }
    
    public final int getLeftButtonText() {
        return 0;
    }
    
    public final void setLeftButtonText(int value) {
    }
    
    private final void init(android.util.AttributeSet attrs, int defStyle) {
    }
    
    public final void dismiss() {
    }
    
    public final void show() {
    }
    
    public final void setLeftButtonAction(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> action) {
    }
    
    public final void setRightButtonAction(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> action) {
    }
    
    private final void expand(@org.jetbrains.annotations.NotNull()
    android.view.View $this$expand) {
    }
    
    @java.lang.Override()
    public void setBackgroundResource(int resid) {
    }
    
    private final void collapse(@org.jetbrains.annotations.NotNull()
    android.view.View $this$collapse) {
    }
    
    public BannerNotification(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public BannerNotification(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public BannerNotification(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs, int defStyle) {
        super(null);
    }
}