
package org.zendesk.client.v2.chat.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class ZendeskChatModel {

    @JsonProperty("chats")
    private List<Chat> chats;
    @JsonProperty("count")
    private Integer count;
    @JsonProperty("end_id")
    private String endId;
    @JsonProperty("end_time")
    private Integer endTime;
    @JsonProperty("next_page")
    private String nextPage;
}
