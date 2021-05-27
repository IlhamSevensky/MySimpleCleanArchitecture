package com.app.mysimplecleanarchitecture.data

import com.app.mysimplecleanarchitecture.domain.IMessageRepository
import com.app.mysimplecleanarchitecture.domain.MessageEntity

class MessageRepository(private val messageDataSource: IMessageDataSource) : IMessageRepository {
    override fun getWelcomeMessage(name: String): MessageEntity {
        return messageDataSource.getMessageFromSource(name)
    }

}