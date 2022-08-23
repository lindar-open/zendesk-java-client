
package org.zendesk.client.v2.chat.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class Engagement {

    @JsonProperty("id")
    private String id;
    @JsonProperty("started_by")
    private String startedBy;
    @JsonProperty("agent_id")
    private String agentId;
    @JsonProperty("agent_name")
    private String agentName;
    @JsonProperty("agent_full_name")
    private String agentFullName;
    @JsonProperty("department_id")
    private Object departmentId;
    @JsonProperty("assigned")
    private Boolean assigned;
    @JsonProperty("accepted")
    private Boolean accepted;
    @JsonProperty("rating")
    private String rating;
    @JsonProperty("comment")
    private String comment;
    @JsonProperty("skills_requested")
    private List<Object> skillsRequested;
    @JsonProperty("skills_fulfilled")
    private Boolean skillsFulfilled;
    @JsonProperty("timestamp")
    private String timestamp;
    @JsonProperty("duration")
    private Double duration;
    @JsonProperty("response_time")
    private ResponseTime__1 responseTime;
    @JsonProperty("count")
    private Count__1 count;
}
