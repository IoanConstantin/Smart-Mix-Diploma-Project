package com.licenta.Smartmix.Controller;

import com.licenta.Smartmix.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ChatController {
    @MessageMapping("/chat.send")
    @SendTo("/topic/public")
    public ChatMessage sendMessage(@Payload final ChatMessage chatMessage) {
        return chatMessage;
    }

    @MessageMapping("chat.newUser")
    @SendTo("/topic/public")
    public ChatMessage newUser(@Payload final ChatMessage chatMessage, SimpMessageHeaderAccessor headerAccessor) {
        headerAccessor.getSessionAttributes().put("username", chatMessage.getSender());
        return chatMessage;
    }

    //@RequestMapping(value = "/conversatia-8", method = RequestMethod.GET)
    //public String getChat() {
    //    return "/static/chat";
    //}
}
