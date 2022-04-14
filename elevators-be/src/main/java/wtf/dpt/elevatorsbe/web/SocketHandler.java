package wtf.dpt.elevatorsbe.web;

import net.minidev.json.JSONObject;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.util.HashMap;
import java.util.Map;

@Component
public class SocketHandler extends TextWebSocketHandler {

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        String payload = message.getPayload();
        Map<String, String> payloadMap = new HashMap<>();
        payloadMap.put("payload", payload);
        JSONObject jsonObject = new JSONObject(payloadMap);
        session.sendMessage(new TextMessage(jsonObject.toJSONString()));
    }
}
