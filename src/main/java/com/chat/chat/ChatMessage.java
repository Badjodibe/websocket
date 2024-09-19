package com.chat.chat;

import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ChatMessage {

    private  String sender;
    private String content;
    private  MessageType type;
}
