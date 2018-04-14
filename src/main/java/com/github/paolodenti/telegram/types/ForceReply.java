package com.github.paolodenti.telegram.types;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class ForceReply {
	private Boolean forceReply;

	private Boolean selective;

	public Boolean getForceReply() {
		return forceReply;
	}

	public void setForceReply(Boolean forceReply) {
		this.forceReply = forceReply;
	}

	public Boolean getSelective() {
		return selective;
	}

	public void setSelective(Boolean selective) {
		this.selective = selective;
	}

	@Override
	public String toString() {
		return "ForceReply [forceReply=" + forceReply + ", selective=" + selective + "]";
	}
}
