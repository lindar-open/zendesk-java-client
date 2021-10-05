package org.zendesk.client.v2.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

/**
 * @author stephenc
 * @since 04/04/2013 14:25
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TicketBatch extends Ticket {

    private static final long serialVersionUID = 1L;

    private List<String> additionalTags;
    private List<String> removeTags;

    public TicketBatch() {
        super();
    }

    public TicketBatch(Requester requester, String subject, Comment comment) {
        super(requester, subject, comment);
    }

    public TicketBatch(long requesterId, String subject, Comment comment) {
        super(requesterId, subject, comment);
    }

    @JsonProperty("additional_tags")
    private List<String> getAdditionalTags() {
        return additionalTags;
    }

    public void setAdditionalTags(List<String> additionalTags) {
        this.additionalTags = additionalTags;
    }

    @JsonProperty("remove_tags")
    private List<String> getRemoveTags() {
        return removeTags;
    }

    public void setRemoveTags(List<String> removeTags) {
        this.removeTags = removeTags;
    }

    @Override
    public String toString() {
        return "Ticket" +
                "{assigneeId=" + getAssigneeId() +
                ", id=" + id +
                ", url='" + url + '\'' +
                ", externalId='" + getExternalId() + '\'' +
                ", type='" + getType() + '\'' +
                ", subject='" + subject + '\'' +
                ", description='" + description + '\'' +
                ", priority='" + getPriority() + '\'' +
                ", status='" + status + '\'' +
                ", recipient='" + getRecipient() + '\'' +
                ", requesterId=" + requesterId +
                ", submitterId=" + getSubmitterId() +
                ", organizationId=" + organizationId +
                ", groupId=" + getGroupId() +
                ", collaboratorIds=" + getCollaboratorIds() +
                ", forumTopicId=" + getForumTopicId() +
                ", problemId=" + getProblemId() +
                ", hasIncidents=" + isHasIncidents() +
                ", dueAt=" + getDueAt() +
                ", tags=" + getTags() +
                ", additionalTags=" + additionalTags +
                ", removeTags=" + removeTags +
                ", via=" + via +
                ", customFields=" + getCustomFields() +
                ", satisfactionRating=" + getSatisfactionRating() +
                ", sharingAgreementIds=" + getSharingAgreementIds() +
                ", followupIds=" + getFollowupIds() +
                ", ticketFormId=" + getTicketFormId() +
                ", brandId=" + getBrandId() +
                ", isPublic=" + getIsPublic() +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }


}
