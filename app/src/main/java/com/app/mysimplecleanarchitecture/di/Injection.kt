package com.app.mysimplecleanarchitecture.di

import com.app.mysimplecleanarchitecture.data.IMessageDataSource
import com.app.mysimplecleanarchitecture.data.MessageDataSource
import com.app.mysimplecleanarchitecture.data.MessageRepository
import com.app.mysimplecleanarchitecture.domain.IMessageRepository
import com.app.mysimplecleanarchitecture.domain.MessageInteractor
import com.app.mysimplecleanarchitecture.domain.MessageUseCase

object Injection {

    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}