package com.github.paolodenti.telegram.types;

import java.util.List;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class InlineKeyboardMarkup {
	private List<List<InlineKeyboardButton>> inlineKeyboard;

	public List<List<InlineKeyboardButton>> getInlineKeyboard() {
		return inlineKeyboard;
	}

	public void setInlineKeyboard(List<List<InlineKeyboardButton>> inlineKeyboard) {
		this.inlineKeyboard = inlineKeyboard;
	}

	@Override
	public String toString() {
		return "InlineKeyboardMarkup [inlineKeyboard=" + inlineKeyboard + "]";
	}
}
