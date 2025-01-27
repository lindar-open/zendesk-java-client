
package org.zendesk.client.v2.chat.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class History {

    @JsonProperty("department_id")
    private Object       departmentId;
    @JsonProperty("department_name")
    private String       departmentName;
    @JsonProperty("channel")
    private String       channel;
    @JsonProperty("name")
    private String name;
    @JsonProperty("index")
    private Integer index;
    @JsonProperty("timestamp")
    private Date    timestamp;
    @JsonProperty("type")
    private String  type;
    @JsonProperty("msg")
    private String msg;
    @JsonProperty("options")
    private String options;
    @JsonProperty("msg_id")
    private String msgId;
    @JsonProperty("sender_type")
    private String senderType;
    @JsonProperty("source")
    private String source;
    @JsonProperty("agent_id")
    private String agentId;
    @JsonProperty("reason")
    private String reason;
    @JsonProperty("new_rating")
    private String newRating;
    @JsonProperty("rating")
    private String rating;
    @JsonProperty("new_comment")
    private String newComment;
    @JsonProperty("comment")
    private String comment;
    @JsonProperty("attachment")
    private Attachment   attachment;
    @JsonProperty("new_tags")
    private List<String> newTags;
}
