package com.app.mysimplecleanarchitecture.domain

class MessageInteractor constructor(private val messageRepository: IMessageRepository) : MessageUseCase {

    override fun getMessage(name: String): MessageEntity {
        return messageRepository.getWelcomeMessage(name)
    }
}