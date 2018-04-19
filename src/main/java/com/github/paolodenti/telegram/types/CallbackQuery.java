package com.github.paolodenti.telegram.types;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonInclude(Include.NON_NULL)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class CallbackQuery {
	private String id;

	private User from;

	private Message message;

	private String inlineMessageId;

	private String chatInstance;

	private String data;

	private String gameShortName;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public User getFrom() {
		return from;
	}

	public void setFrom(User from) {
		this.from = from;
	}

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}

	public String getInlineMessageId() {
		return inlineMessageId;
	}

	public void setInlineMessageId(String inlineMessageId) {
		this.inlineMessageId = inlineMessageId;
	}

	public String getChatInstance() {
		return chatInstance;
	}

	public void setChatInstance(String chatInstance) {
		this.chatInstance = chatInstance;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getGameShortName() {
		return gameShortName;
	}

	public void setGameShortName(String gameShortName) {
		this.gameShortName = gameShortName;
	}

	@Override
	public String toString() {
		return "CallbackQuery [id=" + id + ", from=" + from + ", message=" + message + ", inlineMessageId=" + inlineMessageId + ", chatInstance=" + chatInstance + ", data=" + data + ", gameShortName=" + gameShortName + "]";
	}
}
