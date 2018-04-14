package com.github.paolodenti.telegram.types;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class ReplyKeyboardRemove {
	private Boolean removeKeyboard;

	private Boolean selective;

	public Boolean getRemoveKeyboard() {
		return removeKeyboard;
	}

	public void setRemoveKeyboard(Boolean removeKeyboard) {
		this.removeKeyboard = removeKeyboard;
	}

	public Boolean getSelective() {
		return selective;
	}

	public void setSelective(Boolean selective) {
		this.selective = selective;
	}

	@Override
	public String toString() {
		return "ReplyKeyboardRemove [removeKeyboard=" + removeKeyboard + ", selective=" + selective + "]";
	}
}
