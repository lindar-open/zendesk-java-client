
package org.zendesk.client.v2.chat.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class ResponseTime {

    @JsonProperty("first")
    private Integer first;
    @JsonProperty("avg")
    private Double avg;
    @JsonProperty("max")
    private Integer max;

}
