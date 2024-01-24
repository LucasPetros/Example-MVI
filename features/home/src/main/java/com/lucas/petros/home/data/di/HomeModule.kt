package com.lucas.petros.home.data.di

import com.lucas.petros.home.data.repository.HomeRepository
import com.lucas.petros.home.data.repository.IHomeRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object HomeModule {

    @Provides
    @Singleton
    fun provideRepositoryHome(): HomeRepository {
        return IHomeRepository()
    }
}