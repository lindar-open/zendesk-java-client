
package org.zendesk.client.v2.chat.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class Session {

    @JsonProperty("end_date")
    private String endDate;
    @JsonProperty("country_code")
    private String countryCode;
    @JsonProperty("city")
    private String city;
    @JsonProperty("ip")
    private String ip;
    @JsonProperty("browser")
    private String browser;
    @JsonProperty("country_name")
    private String countryName;
    @JsonProperty("id")
    private String id;
    @JsonProperty("region")
    private String region;
    @JsonProperty("platform")
    private String platform;
    @JsonProperty("user_agent")
    private String userAgent;
    @JsonProperty("start_date")
    private String startDate;

}
