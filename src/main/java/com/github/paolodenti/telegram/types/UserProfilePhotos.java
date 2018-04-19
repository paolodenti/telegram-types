package com.github.paolodenti.telegram.types;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonInclude(Include.NON_NULL)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class UserProfilePhotos {
	private Integer totalCount;

	private List<PhotoSize> photos;

	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<PhotoSize> getPhotos() {
		return photos;
	}

	public void setPhotos(List<PhotoSize> photos) {
		this.photos = photos;
	}

	@Override
	public String toString() {
		return "UserProfilePhotos [totalCount=" + totalCount + ", photos=" + photos + "]";
	}
}
