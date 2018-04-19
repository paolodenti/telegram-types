package com.github.paolodenti.telegram.types;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonInclude(Include.NON_NULL)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class InlineKeyboardMarkup implements SendMessageMarkup {
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
