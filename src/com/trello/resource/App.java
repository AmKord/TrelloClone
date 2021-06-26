package com.trello.resource;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.Gson;
import com.trello.model.Board;
import com.trello.model.Card;
import com.trello.model.Column;
import com.trello.model.Label;
import com.trello.service.BoardServiceImpl;
import com.trello.service.CardServiceImpl;
import com.trello.service.ColumnServiceImpl;
import com.trello.service.IBoardService;
import com.trello.service.ICardService;
import com.trello.service.IColumnService;

public class App {
	public static void main(String[] args) {

		
		
		
		ICardService cardService = new CardServiceImpl();
		IColumnService columnService = new ColumnServiceImpl();
		IBoardService boardService = new BoardServiceImpl();
		
		
		
		Board board = new Board();
		
		board.setColumn(boardService.addColumn("ColumnOne"));
		board.setColumn(boardService.addColumn("ColumnTwo"));
		
		System.out.println(board);
		
		Label lblOne = new Label(1, "ONE");
		Label lblTwo = new Label(2, "TWO");
		Label lblThree = new Label(3, "THREE");

		List<Label> lblList = new ArrayList<Label>();
		lblList.add(lblOne);
		lblList.add(lblTwo);

		Card cardOne = new Card(1, "CardOne", lblList, new Date(), 1);
		Card cardTwo = new Card(2, "CardTwo", lblList, new Date(), 1);

		List<Card> cardList = new ArrayList<Card>();
		cardList.add(cardOne);
		cardList.add(cardTwo);

		Column colOne = new Column(1, "ColumnOne", cardList);
		Column colTwo = new Column(1, "ColumnTwo", cardList);

		List<Column> colList = new ArrayList<Column>();
		colList.add(colOne);
		colList.add(colTwo);
		
		
		
		Gson gson = new Gson();
		System.out.println(gson.toJson(board));

		

	}

}
