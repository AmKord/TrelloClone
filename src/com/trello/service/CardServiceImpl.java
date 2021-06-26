package com.trello.service;

import java.util.Date;
import java.util.List;

import com.trello.model.Board;
import com.trello.model.Card;
import com.trello.model.Label;

public class CardServiceImpl implements ICardService{

	private int cardId = 1;
	private IColumnService columnService = new ColumnServiceImpl();
	@Override
	public void addCard(Card card, List<Label> labels, int columnId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Card> getCards(Board board,String columnName) {
		// TODO Auto-generated method stub
		return columnService.getColumn(board, columnName).getCards();
		
	}
	
	@Override
	public void addCardToColumn(Board board, String columnName, String cardName) {
		// TODO Auto-generated method stub
		Card card = new Card();
		card.setCardId(cardId);
		card.setCardName(cardName);
		card.setCardTimeStamp(new Date());
		card.setColumnId(columnService.getColumn(board, columnName).getColumnId());
		columnService.getColumn(board, columnName).setCard(card);	
		
	}
	
	
	

}
