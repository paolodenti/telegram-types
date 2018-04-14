package com.github.paolodenti.telegram.types;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class InlineKeyboardButton {
	private String text;

	private String url;

	private String callbackData;

	private String switchInlineQuery;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getCallbackData() {
		return callbackData;
	}

	public void setCallbackData(String callbackData) {
		this.callbackData = callbackData;
	}

	public String getSwitchInlineQuery() {
		return switchInlineQuery;
	}

	public void setSwitchInlineQuery(String switchInlineQuery) {
		this.switchInlineQuery = switchInlineQuery;
	}

	@Override
	public String toString() {
		return "InlineKeyboardButton [text=" + text + ", url=" + url + ", callbackData=" + callbackData + ", switchInlineQuery=" + switchInlineQuery + "]";
	}
}
