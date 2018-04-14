package com.github.paolodenti.telegram.types;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class InputMediaPhoto implements InputMedia {
	private String type;

	private String media;

	private String caption;

	private String parseMode;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMedia() {
		return media;
	}

	public void setMedia(String media) {
		this.media = media;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public String getParseMode() {
		return parseMode;
	}

	public void setParseMode(String parseMode) {
		this.parseMode = parseMode;
	}

	@Override
	public String toString() {
		return "InputMediaPhoto [type=" + type + ", media=" + media + ", caption=" + caption + ", parseMode=" + parseMode + "]";
	}
}
