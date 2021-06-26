package com.trello.service;

import java.util.List;

import com.trello.model.Card;

public interface IColumnService {
	
	public void addColumn(int columnName, List<Card> cards);

}
