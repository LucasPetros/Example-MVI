package com.lucas.petros.home.data.repository

interface HomeRepository {

    suspend fun getRoundNumber():Result<Int>
}