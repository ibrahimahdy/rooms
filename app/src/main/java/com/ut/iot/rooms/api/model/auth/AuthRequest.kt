package com.ut.iot.rooms.api.model.auth


data class AuthRequest(val name: String? = null, val email: String, val password: String, @Transient val isLogin: Boolean = true)