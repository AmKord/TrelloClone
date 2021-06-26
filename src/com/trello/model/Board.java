package com.trello.model;

import java.util.List;

public class Board {

	private List<Column> columns;

	/**
	 * @param columns
	 */
	public Board(List<Column> columns) {
		super();
		this.columns = columns;
	}

	public List<Column> getColumns() {
		return columns;
	}

	public void setColumns(List<Column> columns) {
		this.columns = columns;
	}

	@Override
	public String toString() {
		return "Board [columns=" + columns + "]";
	}

}
