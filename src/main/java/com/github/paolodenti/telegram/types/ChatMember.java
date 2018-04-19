package com.github.paolodenti.telegram.types;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonInclude(Include.NON_NULL)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class ChatMember {
	private User user;

	private String status;

	private Boolean untilDate;

	private Boolean canBeEdited;

	private Boolean canChangeInfo;

	private Boolean canPostMessages;

	private Boolean canEditMessages;

	private Boolean canDdeleteMessages;

	private Boolean canInviteUsers;

	private Boolean canRestrictMembers;

	private Boolean canPinMessages;

	private Boolean canPromoteMembers;

	private Boolean canSendMessages;

	private Boolean canSendMediaMessages;

	private Boolean canSendOtherMessages;

	private Boolean canAddWebPagePreviews;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Boolean getUntilDate() {
		return untilDate;
	}

	public void setUntilDate(Boolean untilDate) {
		this.untilDate = untilDate;
	}

	public Boolean getCanBeEdited() {
		return canBeEdited;
	}

	public void setCanBeEdited(Boolean canBeEdited) {
		this.canBeEdited = canBeEdited;
	}

	public Boolean getCanChangeInfo() {
		return canChangeInfo;
	}

	public void setCanChangeInfo(Boolean canChangeInfo) {
		this.canChangeInfo = canChangeInfo;
	}

	public Boolean getCanPostMessages() {
		return canPostMessages;
	}

	public void setCanPostMessages(Boolean canPostMessages) {
		this.canPostMessages = canPostMessages;
	}

	public Boolean getCanEditMessages() {
		return canEditMessages;
	}

	public void setCanEditMessages(Boolean canEditMessages) {
		this.canEditMessages = canEditMessages;
	}

	public Boolean getCanDdeleteMessages() {
		return canDdeleteMessages;
	}

	public void setCanDdeleteMessages(Boolean canDdeleteMessages) {
		this.canDdeleteMessages = canDdeleteMessages;
	}

	public Boolean getCanInviteUsers() {
		return canInviteUsers;
	}

	public void setCanInviteUsers(Boolean canInviteUsers) {
		this.canInviteUsers = canInviteUsers;
	}

	public Boolean getCanRestrictMembers() {
		return canRestrictMembers;
	}

	public void setCanRestrictMembers(Boolean canRestrictMembers) {
		this.canRestrictMembers = canRestrictMembers;
	}

	public Boolean getCanPinMessages() {
		return canPinMessages;
	}

	public void setCanPinMessages(Boolean canPinMessages) {
		this.canPinMessages = canPinMessages;
	}

	public Boolean getCanPromoteMembers() {
		return canPromoteMembers;
	}

	public void setCanPromoteMembers(Boolean canPromoteMembers) {
		this.canPromoteMembers = canPromoteMembers;
	}

	public Boolean getCanSendMessages() {
		return canSendMessages;
	}

	public void setCanSendMessages(Boolean canSendMessages) {
		this.canSendMessages = canSendMessages;
	}

	public Boolean getCanSendMediaMessages() {
		return canSendMediaMessages;
	}

	public void setCanSendMediaMessages(Boolean canSendMediaMessages) {
		this.canSendMediaMessages = canSendMediaMessages;
	}

	public Boolean getCanSendOtherMessages() {
		return canSendOtherMessages;
	}

	public void setCanSendOtherMessages(Boolean canSendOtherMessages) {
		this.canSendOtherMessages = canSendOtherMessages;
	}

	public Boolean getCanAddWebPagePreviews() {
		return canAddWebPagePreviews;
	}

	public void setCanAddWebPagePreviews(Boolean canAddWebPagePreviews) {
		this.canAddWebPagePreviews = canAddWebPagePreviews;
	}

	@Override
	public String toString() {
		return "ChatMember [user=" + user + ", status=" + status + ", untilDate=" + untilDate + ", canBeEdited=" + canBeEdited + ", canChangeInfo=" + canChangeInfo + ", canPostMessages=" + canPostMessages + ", canEditMessages=" + canEditMessages
				+ ", canDdeleteMessages=" + canDdeleteMessages + ", canInviteUsers=" + canInviteUsers + ", canRestrictMembers=" + canRestrictMembers + ", canPinMessages=" + canPinMessages + ", canPromoteMembers=" + canPromoteMembers + ", canSendMessages="
				+ canSendMessages + ", canSendMediaMessages=" + canSendMediaMessages + ", canSendOtherMessages=" + canSendOtherMessages + ", canAddWebPagePreviews=" + canAddWebPagePreviews + "]";
	}
}
