package com.github.paolodenti.telegram.types;

import java.util.List;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Message {
	private Integer messageId;

	private User from;

	private Integer date;

	private Chat chat;

	private User forwardFrom;

	private Chat forwardFromChat;

	private Integer forwardFromMessageId;

	private String forwardSignature;

	private Integer forwardDate;

	private Message replyToMessage;

	private Integer editDate;

	private String mediaGroupId;

	private String authorSignature;

	private String text;

	private List<MessageEntity> entities;

	private List<MessageEntity> captionEntities;

	private Audio audio;

	private Document document;

	private Game game;

	private List<PhotoSize> photo;

	private Sticker sticker;

	private Video video;

	private Voice voice;

	private VideoNote videoNote;

	private String caption;

	private Contact contact;

	private Location location;

	private Venue venue;

	private List<User> newChatMembers;

	private User leftChatMember;

	private String newChatTitle;

	private List<PhotoSize> newChatPhoto;

	private Boolean deleteChatPhoto;

	private Boolean groupChatCreated;

	private Boolean supergroupChatCreated;

	private Boolean channelChatCreated;

	private Integer migrateToChatId;

	private Integer migrateFromChatId;

	private Message pinnedMessage;

	private Invoice invoice;

	private SuccessfulPayment successfulPayment;

	private String connectedWebsite;

	public Integer getMessageId() {
		return messageId;
	}

	public void setMessageId(Integer messageId) {
		this.messageId = messageId;
	}

	public User getFrom() {
		return from;
	}

	public void setFrom(User from) {
		this.from = from;
	}

	public Integer getDate() {
		return date;
	}

	public void setDate(Integer date) {
		this.date = date;
	}

	public Chat getChat() {
		return chat;
	}

	public void setChat(Chat chat) {
		this.chat = chat;
	}

	public User getForwardFrom() {
		return forwardFrom;
	}

	public void setForwardFrom(User forwardFrom) {
		this.forwardFrom = forwardFrom;
	}

	public Chat getForwardFromChat() {
		return forwardFromChat;
	}

	public void setForwardFromChat(Chat forwardFromChat) {
		this.forwardFromChat = forwardFromChat;
	}

	public Integer getForwardFromMessageId() {
		return forwardFromMessageId;
	}

	public void setForwardFromMessageId(Integer forwardFromMessageId) {
		this.forwardFromMessageId = forwardFromMessageId;
	}

	public String getForwardSignature() {
		return forwardSignature;
	}

	public void setForwardSignature(String forwardSignature) {
		this.forwardSignature = forwardSignature;
	}

	public Integer getForwardDate() {
		return forwardDate;
	}

	public void setForwardDate(Integer forwardDate) {
		this.forwardDate = forwardDate;
	}

	public Message getReplyToMessage() {
		return replyToMessage;
	}

	public void setReplyToMessage(Message replyToMessage) {
		this.replyToMessage = replyToMessage;
	}

	public Integer getEditDate() {
		return editDate;
	}

	public void setEditDate(Integer editDate) {
		this.editDate = editDate;
	}

	public String getMediaGroupId() {
		return mediaGroupId;
	}

	public void setMediaGroupId(String mediaGroupId) {
		this.mediaGroupId = mediaGroupId;
	}

	public String getAuthorSignature() {
		return authorSignature;
	}

	public void setAuthorSignature(String authorSignature) {
		this.authorSignature = authorSignature;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public List<MessageEntity> getEntities() {
		return entities;
	}

	public void setEntities(List<MessageEntity> entities) {
		this.entities = entities;
	}

	public List<MessageEntity> getCaptionEntities() {
		return captionEntities;
	}

	public void setCaptionEntities(List<MessageEntity> captionEntities) {
		this.captionEntities = captionEntities;
	}

	public Audio getAudio() {
		return audio;
	}

	public void setAudio(Audio audio) {
		this.audio = audio;
	}

	public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public List<PhotoSize> getPhoto() {
		return photo;
	}

	public void setPhoto(List<PhotoSize> photo) {
		this.photo = photo;
	}

	public Sticker getSticker() {
		return sticker;
	}

	public void setSticker(Sticker sticker) {
		this.sticker = sticker;
	}

	public Video getVideo() {
		return video;
	}

	public void setVideo(Video video) {
		this.video = video;
	}

	public Voice getVoice() {
		return voice;
	}

	public void setVoice(Voice voice) {
		this.voice = voice;
	}

	public VideoNote getVideoNote() {
		return videoNote;
	}

	public void setVideoNote(VideoNote videoNote) {
		this.videoNote = videoNote;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Venue getVenue() {
		return venue;
	}

	public void setVenue(Venue venue) {
		this.venue = venue;
	}

	public List<User> getNewChatMembers() {
		return newChatMembers;
	}

	public void setNewChatMembers(List<User> newChatMembers) {
		this.newChatMembers = newChatMembers;
	}

	public User getLeftChatMember() {
		return leftChatMember;
	}

	public void setLeftChatMember(User leftChatMember) {
		this.leftChatMember = leftChatMember;
	}

	public String getNewChatTitle() {
		return newChatTitle;
	}

	public void setNewChatTitle(String newChatTitle) {
		this.newChatTitle = newChatTitle;
	}

	public List<PhotoSize> getNewChatPhoto() {
		return newChatPhoto;
	}

	public void setNewChatPhoto(List<PhotoSize> newChatPhoto) {
		this.newChatPhoto = newChatPhoto;
	}

	public Boolean getDeleteChatPhoto() {
		return deleteChatPhoto;
	}

	public void setDeleteChatPhoto(Boolean deleteChatPhoto) {
		this.deleteChatPhoto = deleteChatPhoto;
	}

	public Boolean getGroupChatCreated() {
		return groupChatCreated;
	}

	public void setGroupChatCreated(Boolean groupChatCreated) {
		this.groupChatCreated = groupChatCreated;
	}

	public Boolean getSupergroupChatCreated() {
		return supergroupChatCreated;
	}

	public void setSupergroupChatCreated(Boolean supergroupChatCreated) {
		this.supergroupChatCreated = supergroupChatCreated;
	}

	public Boolean getChannelChatCreated() {
		return channelChatCreated;
	}

	public void setChannelChatCreated(Boolean channelChatCreated) {
		this.channelChatCreated = channelChatCreated;
	}

	public Integer getMigrateToChatId() {
		return migrateToChatId;
	}

	public void setMigrateToChatId(Integer migrateToChatId) {
		this.migrateToChatId = migrateToChatId;
	}

	public Integer getMigrateFromChatId() {
		return migrateFromChatId;
	}

	public void setMigrateFromChatId(Integer migrateFromChatId) {
		this.migrateFromChatId = migrateFromChatId;
	}

	public Message getPinnedMessage() {
		return pinnedMessage;
	}

	public void setPinnedMessage(Message pinnedMessage) {
		this.pinnedMessage = pinnedMessage;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

	public SuccessfulPayment getSuccessfulPayment() {
		return successfulPayment;
	}

	public void setSuccessfulPayment(SuccessfulPayment successfulPayment) {
		this.successfulPayment = successfulPayment;
	}

	public String getConnectedWebsite() {
		return connectedWebsite;
	}

	public void setConnectedWebsite(String connectedWebsite) {
		this.connectedWebsite = connectedWebsite;
	}

	@Override
	public String toString() {
		return "Message [messageId=" + messageId + ", from=" + from + ", date=" + date + ", chat=" + chat + ", forwardFrom=" + forwardFrom + ", forwardFromChat=" + forwardFromChat + ", forwardFromMessageId=" + forwardFromMessageId + ", forwardSignature=" + forwardSignature + ", forwardDate=" + forwardDate + ", replyToMessage=" + replyToMessage + ", editDate=" + editDate + ", mediaGroupId=" + mediaGroupId + ", authorSignature=" + authorSignature + ", text=" + text + ", entities=" + entities
				+ ", captionEntities=" + captionEntities + ", audio=" + audio + ", document=" + document + ", game=" + game + ", photo=" + photo + ", sticker=" + sticker + ", video=" + video + ", voice=" + voice + ", videoNote=" + videoNote + ", caption=" + caption + ", contact=" + contact + ", location=" + location + ", venue=" + venue + ", newChatMembers=" + newChatMembers + ", leftChatMember=" + leftChatMember + ", newChatTitle=" + newChatTitle + ", newChatPhoto=" + newChatPhoto + ", deleteChatPhoto="
				+ deleteChatPhoto + ", groupChatCreated=" + groupChatCreated + ", supergroupChatCreated=" + supergroupChatCreated + ", channelChatCreated=" + channelChatCreated + ", migrateToChatId=" + migrateToChatId + ", migrateFromChatId=" + migrateFromChatId + ", pinnedMessage=" + pinnedMessage + ", invoice=" + invoice + ", successfulPayment=" + successfulPayment + ", connectedWebsite=" + connectedWebsite + "]";
	}
}
