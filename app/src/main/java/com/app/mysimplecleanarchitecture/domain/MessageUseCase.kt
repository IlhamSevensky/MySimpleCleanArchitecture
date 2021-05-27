package com.app.mysimplecleanarchitecture.domain

interface MessageUseCase {

    fun getMessage(name: String): MessageEntity

}