package com.github.paolodenti.telegram.types;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class VideoNote {
	private String fileId;

	private Integer length;

	private Integer duration;

	private PhotoSize thumb;

	private Integer fileSize;

	public String getFileId() {
		return fileId;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public PhotoSize getThumb() {
		return thumb;
	}

	public void setThumb(PhotoSize thumb) {
		this.thumb = thumb;
	}

	public Integer getFileSize() {
		return fileSize;
	}

	public void setFileSize(Integer fileSize) {
		this.fileSize = fileSize;
	}

	@Override
	public String toString() {
		return "VideoNote [fileId=" + fileId + ", length=" + length + ", duration=" + duration + ", thumb=" + thumb + ", fileSize=" + fileSize + "]";
	}
}
