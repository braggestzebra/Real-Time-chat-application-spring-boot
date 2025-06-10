package Chat.Application.Chat.app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PrivateMessage {
        private String sender;
        private String receiver;
        private String content;

    public String getReceiver() {
        return "";
    }
    }

