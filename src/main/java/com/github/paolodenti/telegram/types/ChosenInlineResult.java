package com.github.paolodenti.telegram.types;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class ChosenInlineResult {
	private String resultId;

	private User from;

	private Location location;

	private String inlineMessageId;

	private String query;

	public String getResultId() {
		return resultId;
	}

	public void setResultId(String resultId) {
		this.resultId = resultId;
	}

	public User getFrom() {
		return from;
	}

	public void setFrom(User from) {
		this.from = from;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public String getInlineMessageId() {
		return inlineMessageId;
	}

	public void setInlineMessageId(String inlineMessageId) {
		this.inlineMessageId = inlineMessageId;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	@Override
	public String toString() {
		return "ChosenInlineResult [resultId=" + resultId + ", from=" + from + ", location=" + location + ", inlineMessageId=" + inlineMessageId + ", query=" + query + "]";
	}
}
