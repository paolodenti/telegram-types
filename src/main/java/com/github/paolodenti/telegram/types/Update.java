package com.github.paolodenti.telegram.types;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonInclude(Include.NON_NULL)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Update {
	private Long updateId;

	private Message message;

	private Message editedMessage;

	private Message channelPost;

	private Message editedChannelPost;

	private InlineQuery inlineQuery;

	private ChosenInlineResult chosenInlineResult;

	private CallbackQuery callbackQuery;

	private ShippingQuery shippingQuery;

	private PreCheckoutQuery preCheckoutQuery;

	public Long getUpdateId() {
		return updateId;
	}

	public void setUpdateId(Long updateId) {
		this.updateId = updateId;
	}

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}

	public Message getEditedMessage() {
		return editedMessage;
	}

	public void setEditedMessage(Message editedMessage) {
		this.editedMessage = editedMessage;
	}

	public Message getChannelPost() {
		return channelPost;
	}

	public void setChannelPost(Message channelPost) {
		this.channelPost = channelPost;
	}

	public Message getEditedChannelPost() {
		return editedChannelPost;
	}

	public void setEditedChannelPost(Message editedChannelPost) {
		this.editedChannelPost = editedChannelPost;
	}

	public InlineQuery getInlineQuery() {
		return inlineQuery;
	}

	public void setInlineQuery(InlineQuery inlineQuery) {
		this.inlineQuery = inlineQuery;
	}

	public ChosenInlineResult getChosenInlineResult() {
		return chosenInlineResult;
	}

	public void setChosenInlineResult(ChosenInlineResult chosenInlineResult) {
		this.chosenInlineResult = chosenInlineResult;
	}

	public CallbackQuery getCallbackQuery() {
		return callbackQuery;
	}

	public void setCallbackQuery(CallbackQuery callbackQuery) {
		this.callbackQuery = callbackQuery;
	}

	public ShippingQuery getShippingQuery() {
		return shippingQuery;
	}

	public void setShippingQuery(ShippingQuery shippingQuery) {
		this.shippingQuery = shippingQuery;
	}

	public PreCheckoutQuery getPreCheckoutQuery() {
		return preCheckoutQuery;
	}

	public void setPreCheckoutQuery(PreCheckoutQuery preCheckoutQuery) {
		this.preCheckoutQuery = preCheckoutQuery;
	}

	@Override
	public String toString() {
		return "Update [updateId=" + updateId + ", message=" + message + ", editedMessage=" + editedMessage + ", channelPost=" + channelPost + ", editedChannelPost=" + editedChannelPost + ", inlineQuery=" + inlineQuery + ", chosenInlineResult=" + chosenInlineResult + ", callbackQuery=" + callbackQuery + ", shippingQuery=" + shippingQuery + ", preCheckoutQuery=" + preCheckoutQuery + "]";
	}
}
