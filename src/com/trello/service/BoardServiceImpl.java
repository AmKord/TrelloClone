package com.trello.service;

import com.trello.model.Column;

public class BoardServiceImpl implements IBoardService{

	IColumnService columnService = new ColumnServiceImpl();
	private int columnId = 1;
	@Override
	public Column addColumn(String columnName) {
		// TODO Auto-generated method stub
		Column col = new Column();
		col.setColumnName(columnName);
		col.setColumnId(columnId++);
		
		return col;
	}
	
	

}
