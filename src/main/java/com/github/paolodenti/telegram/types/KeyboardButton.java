package com.github.paolodenti.telegram.types;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class KeyboardButton {
	private String text;

	private Boolean requestContact;

	private Boolean requestLocation;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Boolean getRequestContact() {
		return requestContact;
	}

	public void setRequestContact(Boolean requestContact) {
		this.requestContact = requestContact;
	}

	public Boolean getRequestLocation() {
		return requestLocation;
	}

	public void setRequestLocation(Boolean requestLocation) {
		this.requestLocation = requestLocation;
	}

	@Override
	public String toString() {
		return "KeyboardButton [text=" + text + ", requestContact=" + requestContact + ", requestLocation=" + requestLocation + "]";
	}
}
