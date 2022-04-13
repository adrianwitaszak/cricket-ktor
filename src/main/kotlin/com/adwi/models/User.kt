package com.adwi.models

import com.adwi.util.ExpLevel
import kotlinx.serialization.Serializable

@Serializable
data class User(
    override val id: String,
    val email: String,
    val hashedPass: ByteArray,
    val expLevel: ExpLevel = ExpLevel.LOW
) : Model

@Serializable
data class UserInput(
    val email: String,
    val password: String,
)

@Serializable
data class UserResponse(
    val token: String,
    val user: User,
)


val users = mutableListOf<User>()

fun getAll() = users.toList()

fun add(user: User) {
    users += user
}