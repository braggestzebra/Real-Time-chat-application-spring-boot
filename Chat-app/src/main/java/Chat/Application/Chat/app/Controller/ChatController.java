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

    private final SimpMessageSendingOperations messagingTemplate123;

    public ChatController(SimpMessageSendingOperations messagingTemplate123) {
        this.messagingTemplate123 = messagingTemplate123;
    }

    @MessageMapping("/sendMessage")
    @SendTo("/topic/messages")
    public ChatMessage sendMessage(ChatMessage message){
        // test dev 2 commit
        //new change
        // dev 1 change
        System.out.println("here is dev1 change");
        System.out.println("This is test merge conflict");
        // dev 2 change
        System.out.println("this is dev2 change");
        System.out.println("dev 2 merge conflict demo");
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
        System.out.println("hello user");
        return "chat";
    }

    @GetMapping("/history")
    public ResponseEntity<String> getChatHistory() {
        System.out.println("No merge conflict changes");
        return ResponseEntity.ok("Your chat history");
    }
}
