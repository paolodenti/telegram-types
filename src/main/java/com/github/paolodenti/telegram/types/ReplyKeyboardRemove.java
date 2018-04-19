package com.github.paolodenti.telegram.types;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonInclude(Include.NON_NULL)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class ReplyKeyboardRemove implements SendMessageMarkup  {
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
