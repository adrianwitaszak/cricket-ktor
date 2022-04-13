package com.adwi.models

import kotlinx.serialization.Serializable

@Serializable
data class Profile(
    val user: User,
)