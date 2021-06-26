package com.trello.service;

import java.util.List;

import com.trello.model.Board;
import com.trello.model.Card;
import com.trello.model.Column;

public interface IColumnService {
	
	
	
	public List<Column> getColumns(Board board);
	
	public Column getColumn(Board board, String columnName);

}
