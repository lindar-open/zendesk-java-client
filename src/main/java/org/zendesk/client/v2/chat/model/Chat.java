
package org.zendesk.client.v2.chat.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;

import java.util.Date;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class Chat {

    @JsonProperty("response_time")
    private ResponseTime responseTime;
    @JsonProperty("count")
    private Count count;
    @JsonProperty("missed")
    private Boolean missed;
    @JsonProperty("rating")
    private String rating;
    @JsonProperty("session")
    private Session session;
    @JsonProperty("agent_ids")
    private List<String> agentIds;
    @JsonProperty("started_by")
    private String startedBy;
    @JsonProperty("history")
    private List<History> history;
    @JsonProperty("comment")
    private String comment;
    @JsonProperty("referrer_search_terms")
    private String referrerSearchTerms;
    @JsonProperty("tags")
    private List<String> tags;
    @JsonProperty("end_timestamp")
    private Date         endTimestamp;
    @JsonProperty("referrer_search_engine")
    private String       referrerSearchEngine;
    @JsonProperty("department_id")
    private Object departmentId;
    @JsonProperty("update_timestamp")
    private Date updateTimestamp;
    @JsonProperty("id")
    private String id;
    @JsonProperty("deleted")
    private Boolean deleted;
    @JsonProperty("type")
    private String type;
    @JsonProperty("duration")
    private Integer duration;
    @JsonProperty("conversions")
    private List<Object> conversions;
    @JsonProperty("triggered")
    private Boolean triggered;
    @JsonProperty("visitor")
    private Visitor visitor;
    @JsonProperty("triggered_response")
    private Object triggeredResponse;
    @JsonProperty("agent_names")
    private List<String> agentNames;
    @JsonProperty("unread")
    private Boolean unread;
    @JsonProperty("department_name")
    private Object departmentName;
    @JsonProperty("timestamp")
    private Date timestamp;
    @JsonProperty("skills_fulfilled")
    private Boolean skillsFulfilled;
    @JsonProperty("zendesk_ticket_id")
    private Integer zendeskTicketId;
    @JsonProperty("abandon_time")
    private Object abandonTime;
    @JsonProperty("dropped")
    private Boolean dropped;
    @JsonProperty("proactive")
    private Boolean proactive;
    @JsonProperty("skills_requested")
    private List<Object> skillsRequested;
    @JsonProperty("engagements")
    private List<Engagement> engagements;

}
