package org.zendesk.client.v2.chat.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class Attachment {
    @JsonProperty("name")
    private String name;
    @JsonProperty("size")
    private int size;
    @JsonProperty("type")
    private String type;
    @JsonProperty("mime_type")
    private String mimeType;
    @JsonProperty("url")
    private String url;
    @JsonProperty("deleted")
    private boolean deleted;

}
