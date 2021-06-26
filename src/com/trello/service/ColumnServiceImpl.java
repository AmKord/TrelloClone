package com.trello.service;

import java.util.List;

import com.trello.model.Board;
import com.trello.model.Card;
import com.trello.model.Column;

public class ColumnServiceImpl implements IColumnService{

	

	@Override
	public List<Column> getColumns(Board board) {
		// TODO Auto-generated method stub
		return board.getColumns();
		
	}

	@Override
	public Column getColumn(Board board, String columnName) {
		// TODO Auto-generated method stub
		
		return board.getColumns().stream().filter(e->e.getColumnName().equals(columnName)).findFirst().get();
	}

}
