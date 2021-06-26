package com.trello.model;

import java.util.Date;
import java.util.List;

public class Card {

	private int cardId;
	private String cardName;
	private List<Label> labels;
	private Date cardTimeStamp;
	private int columnId;

	/**
	 * @param cardId
	 * @param cardName
	 * @param labels
	 * @param cardTimeStamp
	 * @param columnId
	 */
	public Card(int cardId, String cardName, List<Label> labels, Date cardTimeStamp, int columnId) {
		super();
		this.cardId = cardId;
		this.cardName = cardName;
		this.labels = labels;
		this.cardTimeStamp = cardTimeStamp;
		this.columnId = columnId;
	}

	public Card() {
		
	}
	public int getColumnId() {
		return columnId;
	}


	public void setColumnId(int columnId) {
		this.columnId = columnId;
	}




	public Date getCardTimeStamp() {
		return cardTimeStamp;
	}


	public void setCardTimeStamp(Date cardTimeStamp) {
		this.cardTimeStamp = cardTimeStamp;
	}


	public int getCardId() {
		return cardId;
	}

	public void setCardId(int cardId) {
		this.cardId = cardId;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public List<Label> getLabels() {
		return labels;
	}

	public void setLabels(List<Label> labels) {
		this.labels = labels;
	}


	@Override
	public String toString() {
		return "Card [cardId=" + cardId + ", cardName=" + cardName + ", labels=" + labels + ", cardTimeStamp="
				+ cardTimeStamp + ", columnId=" + columnId + "]";
	}

	

}
