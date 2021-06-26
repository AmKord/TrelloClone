package com.trello.service;

import java.util.List;

import com.trello.model.Board;
import com.trello.model.Card;
import com.trello.model.Label;

public interface ICardService {
	
	
	public void addCard(Card card, List<Label> labels, int columnId) ;
		
	public List<Card> getCards(Board board, String columnId);
	
	public void addCardToColumn(Board board, String columnName, String cardName);

}
