package Chat.Application.Chat.app.Controller;

import Chat.Application.Chat.app.model.ChatMessage;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {

//    private final SimpMessageSendingOperations messagingTemplate;
//
//    public ChatController(SimpMessageSendingOperations messagingTemplate) {
//        this.messagingTemplate = messagingTemplate;
//    }

    @MessageMapping("/sendMessage")
    @SendTo("/topic/messages")
    public ChatMessage sendMessage(ChatMessage message){
        // test dev 2 commit
        return message;
    }

//    @MessageMapping ("/Private")
//    @SendTo("/Private/message")
//    public void sendPrivateMessage(PrivateMessage message){
//        messagingTemplate.convertAndSendToUser(
//                message.getReceiver(),
//                "/queue/messages",
//                message
//        );
//    }

    @GetMapping("/chat")
    public String Chat(){
        // dev 2 faature changes
        return "chat";
    }

    @GetMapping("/history")
    public ResponseEntity<String> getChatHistory() {
        return ResponseEntity.ok("Your chat history");
    }
}
