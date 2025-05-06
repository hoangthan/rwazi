package com.rwazi.libraries.dynamic_background.domain.repository

import com.rwazi.libraries.dynamic_background.domain.model.ImageSource

interface ImageRepository {
    suspend fun getRandomImage(): ImageSource
}
