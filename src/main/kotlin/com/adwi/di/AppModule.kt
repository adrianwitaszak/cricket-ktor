package com.adwi.di

import com.adwi.repository.UserRepository
import com.adwi.service.AuthService
import com.adwi.service.ProfileService
import org.koin.dsl.module
import org.litote.kmongo.KMongo

val mongoKey = System.getenv("MONGO_URI") ?: ""

val appModule = module {
    single { KMongo.createClient(mongoKey) }
    single { UserRepository(get()) }
    single { AuthService(get()) }
    single { ProfileService(get()) }
}