package com.github.paolodenti.telegram.types;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class ResponseParameters {
	private Integer migrateToChatId;

	private Integer retryAfter;

	public Integer getMigrateToChatId() {
		return migrateToChatId;
	}

	public void setMigrateToChatId(Integer migrateToChatId) {
		this.migrateToChatId = migrateToChatId;
	}

	public Integer getRetryAfter() {
		return retryAfter;
	}

	public void setRetryAfter(Integer retryAfter) {
		this.retryAfter = retryAfter;
	}

	@Override
	public String toString() {
		return "ResponseParameters [migrateToChatId=" + migrateToChatId + ", retryAfter=" + retryAfter + "]";
	}
}
