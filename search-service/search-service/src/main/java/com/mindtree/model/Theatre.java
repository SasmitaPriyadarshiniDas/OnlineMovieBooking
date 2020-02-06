package com.mindtree.model;

import java.math.BigDecimal;

public class Theatre {

	private int levelId;
	private String levelName;
	private BigDecimal price;
	private int rows;
	private int seatsInRow;
	private int screen;
	private int screenNo;

	public int getLevelId() {
		return levelId;
	}

	public void setLevelId(int levelId) {
		this.levelId = levelId;
	}

	public String getLevelName() {
		return levelName;
	}

	public void setLevelName(String levelName) {
		this.levelName = levelName;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getSeatsInRow() {
		return seatsInRow;
	}

	public void setSeatsInRow(int seatsInRow) {
		this.seatsInRow = seatsInRow;
	}

	public int getScreen() {
		return screen;
	}

	public void setScreen(int screen) {
		this.screen = screen;
	}

	public int getScreenNo() {
		return screenNo;
	}

	public void setScreenNo(int screenNo) {
		this.screenNo = screenNo;
	}

	@Override
	public String toString() {
		return "Theatre [levelId=" + levelId + ", levelName=" + levelName + ", price=" + price + ", rows=" + rows
				+ ", seatsInRow=" + seatsInRow + ", screen=" + screen + ", screenNo=" + screenNo + "]";
	}

	

}
