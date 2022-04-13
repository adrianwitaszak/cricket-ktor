package com.adwi.service

import com.adwi.models.Profile
import com.adwi.repository.UserRepository

class ProfileService(
    private val userRepository: UserRepository,
) {
    fun getProfile(userId: String): Profile {
        val user = userRepository.getById(userId)
        return Profile(user)
    }
}