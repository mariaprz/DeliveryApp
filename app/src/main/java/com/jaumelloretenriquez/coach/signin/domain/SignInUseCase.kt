package com.jaumelloretenriquez.coach.signin.domain

import com.jaumelloretenriquez.coach.core.security.PasswordHash
import com.jaumelloretenriquez.coach.signin.data.SignInRepository
import javax.inject.Inject

class SignInUseCase @Inject constructor(
    private val networkRepository: SignInRepository,
    private val cryptoHash: PasswordHash
) {

    suspend operator fun invoke(user: String, password: String):Boolean =
        networkRepository.doSignIn(user, password)
}