package com.app.mysimplecleanarchitecture.data

import com.app.mysimplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {

    fun getMessageFromSource(name: String): MessageEntity

}