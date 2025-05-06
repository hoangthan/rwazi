package com.rwazi.libraries.dynamic_background.domain.usecase

import com.rwazi.libraries.dynamic_background.domain.model.ImageSource
import com.rwazi.libraries.dynamic_background.domain.repository.ImageRepository
import javax.inject.Inject

class GetRandomImageUseCase @Inject constructor(
    private val imageRepository: ImageRepository
) {
    suspend operator fun invoke(): ImageSource = imageRepository.getRandomImage()
}
