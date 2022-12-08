package org.zendesk.client.v2.chat;


import com.fasterxml.jackson.databind.ObjectMapper;
import feign.Feign;
import feign.Param;
import feign.QueryMap;
import feign.RequestLine;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import org.zendesk.client.v2.chat.model.Agent;
import org.zendesk.client.v2.chat.model.Chat;
import org.zendesk.client.v2.chat.model.Visitor;
import org.zendesk.client.v2.chat.model.ZendeskChatModel;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

import static org.zendesk.client.v2.Zendesk.createMapper;

public class ZendeskChat {

    private ZendeskChatApi api;

    public ZendeskChat(String token) {
        this.api = Feign
                .builder()
                .decoder(new JacksonDecoder(createMapper()))
                .encoder(new JacksonEncoder(createMapper()))
                .errorDecoder(ZendeskChatUtil::decode)
                .requestInterceptor(request -> request.header("Authorization", "Bearer " + token))
                .target(ZendeskChatApi.class, "https://www.zopim.com");
    }

    public ZendeskChatModel getChats(Instant startTime, int limit) {
        Map<String, Object> params = new HashMap<>();
        params.put("start_time", startTime.getEpochSecond());
        params.put("limit", limit);
        params.put("fields", "chats(*)");
        return api.getChats(params);
    }

    public Visitor getVisitor(String visitorId) {
        return api.getVisitor(visitorId);
    }

    public Agent getAgent(String agentId) {
        return api.getAgent(agentId);
    }

    public Chat getSingleChat(String chatId) {
        return api.getSingleChat(chatId);
    }

    private interface ZendeskChatApi {
        @RequestLine("GET /api/v2/incremental/chats")
        ZendeskChatModel getChats(@QueryMap Map<String, Object> params);

        @RequestLine("GET /api/v2/visitors/{visitorId}")
        Visitor getVisitor(@Param("visitorId") String visitorId);

        @RequestLine("GET /api/v2/agents/{agentId}")
        Agent getAgent(@Param("agentId") String agentId);

        @RequestLine("GET /api/v2/chats/{chatId}")
        Chat getSingleChat(@Param("chatId") String chatId);
    }
}
