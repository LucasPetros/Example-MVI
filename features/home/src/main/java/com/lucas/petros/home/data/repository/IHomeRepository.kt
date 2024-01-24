package com.lucas.petros.home.data.repository

import kotlinx.coroutines.delay
import kotlin.random.Random

class IHomeRepository : HomeRepository {
    override suspend fun getRoundNumber(): Result<Int> {
        delay(500L)
        return runCatching {
            Random.nextInt()
        }.onSuccess {
            return Result.success(it)
        }.onFailure {
            Result.failure<Exception>(it)
        }
    }
}