package com.lucas.petros.home.data.repository

import kotlin.math.roundToInt

class IHomeRepository : HomeRepository {
    override suspend fun getRoundNumber() =
        runCatching {
            Math.random().roundToInt()
        }.onSuccess {
            Result.success(it)
        }.onFailure { throw Exception() }
}