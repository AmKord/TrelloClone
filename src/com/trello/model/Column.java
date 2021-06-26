package com.trello.model;

import java.util.List;

public class Column {

	private int columnId;
	private String columnName;
	private List<Card> cards;

	public int getColumnId() {
		return columnId;
	}

	public void setColumnId(int columnId) {
		this.columnId = columnId;
	}

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

	@Override
	public String toString() {
		return "Column [columnId=" + columnId + ", columnName=" + columnName + ", cards=" + cards + "]";
	}

	/**
	 * @param columnId
	 * @param columnName
	 * @param cards
	 */
	public Column(int columnId, String columnName, List<Card> cards) {
		super();
		this.columnId = columnId;
		this.columnName = columnName;
		this.cards = cards;
	}

}
