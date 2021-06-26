package com.trello.model;

import java.util.ArrayList;
import java.util.List;

public class Board {

	private List<Column> columns = new ArrayList<Column>();

	
	

	public List<Column> getColumns() {
		return columns;
	}

	/**
	 * 
	 */
	public Board() {
		super();
	}

	
	
	public void setColumn(Column column) {
		columns.add(column);
	}

	@Override
	public String toString() {
		return "Board [columns=" + columns + "]";
	}

}
