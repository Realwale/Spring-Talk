package net.chatapp.springtalk.controller;

import lombok.*;
import net.chatapp.springtalk.enums.MessageType;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChatMessage {

    private String content;

    private String sender;

    private MessageType type;
}
