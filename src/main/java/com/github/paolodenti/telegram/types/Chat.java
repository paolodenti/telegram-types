package com.github.paolodenti.telegram.types;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonInclude(Include.NON_NULL)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Chat {
	private Integer id;

	private String type;

	private String title;

	private String username;

	private String firstName;

	private String lastName;

	private Boolean allMembersAreAdministrators;

	private ChatPhoto photo;

	private String description;

	private String inviteLink;

	private String pinnedMessage;

	private String stickerSetName;

	private Boolean canSetStickerSet;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Boolean getAllMembersAreAdministrators() {
		return allMembersAreAdministrators;
	}

	public void setAllMembersAreAdministrators(Boolean allMembersAreAdministrators) {
		this.allMembersAreAdministrators = allMembersAreAdministrators;
	}

	public ChatPhoto getPhoto() {
		return photo;
	}

	public void setPhoto(ChatPhoto photo) {
		this.photo = photo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getInviteLink() {
		return inviteLink;
	}

	public void setInviteLink(String inviteLink) {
		this.inviteLink = inviteLink;
	}

	public String getPinnedMessage() {
		return pinnedMessage;
	}

	public void setPinnedMessage(String pinnedMessage) {
		this.pinnedMessage = pinnedMessage;
	}

	public String getStickerSetName() {
		return stickerSetName;
	}

	public void setStickerSetName(String stickerSetName) {
		this.stickerSetName = stickerSetName;
	}

	public Boolean getCanSetStickerSet() {
		return canSetStickerSet;
	}

	public void setCanSetStickerSet(Boolean canSetStickerSet) {
		this.canSetStickerSet = canSetStickerSet;
	}

	@Override
	public String toString() {
		return "Chat [id=" + id + ", type=" + type + ", title=" + title + ", username=" + username + ", firstName=" + firstName + ", lastName=" + lastName + ", allMembersAreAdministrators=" + allMembersAreAdministrators + ", photo=" + photo + ", description=" + description + ", inviteLink=" + inviteLink + ", pinnedMessage=" + pinnedMessage + ", stickerSetName=" + stickerSetName + ", canSetStickerSet=" + canSetStickerSet + "]";
	}
}
