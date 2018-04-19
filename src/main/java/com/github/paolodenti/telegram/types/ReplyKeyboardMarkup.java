package com.github.paolodenti.telegram.types;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonInclude(Include.NON_NULL)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class ReplyKeyboardMarkup implements SendMessageMarkup {
	private List<List<KeyboardButton>> keyboard;

	private Boolean resizeKeyboard;

	private Boolean oneTimeKeyboard;

	private Boolean selective;

	public List<List<KeyboardButton>> getKeyboard() {
		return keyboard;
	}

	public void setKeyboard(List<List<KeyboardButton>> keyboard) {
		this.keyboard = keyboard;
	}

	public Boolean getResizeKeyboard() {
		return resizeKeyboard;
	}

	public void setResizeKeyboard(Boolean resizeKeyboard) {
		this.resizeKeyboard = resizeKeyboard;
	}

	public Boolean getOneTimeKeyboard() {
		return oneTimeKeyboard;
	}

	public void setOneTimeKeyboard(Boolean oneTimeKeyboard) {
		this.oneTimeKeyboard = oneTimeKeyboard;
	}

	public Boolean getSelective() {
		return selective;
	}

	public void setSelective(Boolean selective) {
		this.selective = selective;
	}

	@Override
	public String toString() {
		return "ReplyKeyboardMarkup [keyboard=" + keyboard + ", resizeKeyboard=" + resizeKeyboard + ", oneTimeKeyboard=" + oneTimeKeyboard + ", selective=" + selective + "]";
	}
}
