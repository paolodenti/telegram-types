package com.github.paolodenti.telegram.types;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class MaskPosition {
	private String point;

	private Double xShift;

	private Double yShift;

	private Double scale;

	public String getPoint() {
		return point;
	}

	public void setPoint(String point) {
		this.point = point;
	}

	public Double getxShift() {
		return xShift;
	}

	public void setxShift(Double xShift) {
		this.xShift = xShift;
	}

	public Double getyShift() {
		return yShift;
	}

	public void setyShift(Double yShift) {
		this.yShift = yShift;
	}

	public Double getScale() {
		return scale;
	}

	public void setScale(Double scale) {
		this.scale = scale;
	}

	@Override
	public String toString() {
		return "MaskPosition [point=" + point + ", xShift=" + xShift + ", yShift=" + yShift + ", scale=" + scale + "]";
	}
}
