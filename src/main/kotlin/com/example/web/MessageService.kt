package com.example.web

import org.springframework.stereotype.Service

@Service
class MessageService (val db: MessageRepository){

    fun findMessages(): List<Message> = db.findMessages()

    fun post(message: Message) {
        requireNotNull(message.text)
        db.save(message)
    }
}