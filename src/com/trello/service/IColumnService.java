package com.trello.service;

import java.util.List;

import com.trello.model.Board;
import com.trello.model.Card;
import com.trello.model.Column;

public interface IColumnService {
	
	public void addCardsToColumn(int columnName, List<Card> cards);
	
	public List<Column> getColumns(Board board);
	
	public List<Column> getColumn(Board board, int columnId);

}
