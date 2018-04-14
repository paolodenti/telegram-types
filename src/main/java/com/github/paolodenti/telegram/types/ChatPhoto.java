package com.github.paolodenti.telegram.types;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class ChatPhoto {

	private String smallFileId;

	private String bigFileId;

	public String getSmallFileId() {
		return smallFileId;
	}

	public void setSmallFileId(String smallFileId) {
		this.smallFileId = smallFileId;
	}

	public String getBigFileId() {
		return bigFileId;
	}

	public void setBigFileId(String bigFileId) {
		this.bigFileId = bigFileId;
	}

	@Override
	public String toString() {
		return "ChatPhoto [smallFileId=" + smallFileId + ", bigFileId=" + bigFileId + "]";
	}
}
