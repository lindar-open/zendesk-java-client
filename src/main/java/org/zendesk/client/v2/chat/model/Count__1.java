
package org.zendesk.client.v2.chat.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class Count__1 {

    @JsonProperty("total")
    private Integer total;
    @JsonProperty("visitor")
    private Integer visitor;
    @JsonProperty("agent")
    private Integer agent;
}
