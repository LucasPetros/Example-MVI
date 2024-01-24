package com.lucas.petros.home.domain.usecase

import com.lucas.petros.home.data.repository.HomeRepository
import javax.inject.Inject

class GetRoundNumber @Inject constructor(private val repository: HomeRepository) {

    suspend operator fun invoke(): Int {
        return repository.getRoundNumber().getOrThrow()
    }
}