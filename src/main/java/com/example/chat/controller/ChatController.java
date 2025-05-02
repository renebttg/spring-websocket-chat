package com.example.chat.controller;


import com.example.chat.models.ChatMessageModel;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * @author Rene
 */
@Controller
public class ChatController {

    @MessageMapping("/chat.send")       // cliente envia para: /app/chat.send
    @SendTo("/topic/public")            // servidor envia para: /topic/public
    public ChatMessageModel sendMessage(@Payload ChatMessageModel message) {
        return message;
    }

    @MessageMapping("/chat.newUser")
    @SendTo("/topic/public")
    public ChatMessageModel newUser(@Payload ChatMessageModel chatMessage) {
        chatMessage.setContent(chatMessage.getSender() + " entrou no chat!");
        chatMessage.setType(ChatMessageModel.MessageType.JOIN);
        return chatMessage;
    }
}
