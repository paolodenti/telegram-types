package com.github.paolodenti.telegram.types;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonInclude(Include.NON_NULL)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class InputMediaVideo implements InputMedia {
	private String type;

	private String media;

	private String caption;

	private String parseMode;

	private Integer width;

	private Integer height;

	private Integer duration;

	private Boolean supportsStreaming;

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

	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public Boolean getSupportsStreaming() {
		return supportsStreaming;
	}

	public void setSupportsStreaming(Boolean supportsStreaming) {
		this.supportsStreaming = supportsStreaming;
	}

	@Override
	public String toString() {
		return "InputMediaVideo [type=" + type + ", media=" + media + ", caption=" + caption + ", parseMode=" + parseMode + ", width=" + width + ", height=" + height + ", duration=" + duration + ", supportsStreaming=" + supportsStreaming + "]";
	}
}
