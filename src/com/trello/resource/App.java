package com.trello.resource;

import com.google.gson.Gson;
import com.trello.model.Board;
import com.trello.model.Column;
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
		
		
		//Creating new board
		Board board = new Board();
		
		//Adding columns to board
		board.setColumn(boardService.addColumn("ColumnOne"));
		board.setColumn(boardService.addColumn("ColumnTwo"));
		board.setColumn(boardService.addColumn("ColumnThree"));
		board.setColumn(boardService.addColumn("ColumnFour"));
		System.out.println("-----");
		System.out.println(board);
		
		//Getting all the columns in the board
		Column col = columnService.getColumn(board, "ColumnOne");
		System.out.println("-----");
		System.out.println("COLUMNS: "+columnService.getColumns(board));

		
		//Adding cards to columns
		cardService.addCardToColumn(board,"ColumnOne", "CardOne");
		cardService.addCardToColumn(board,"ColumnOne", "CardTwo");
		cardService.addCardToColumn(board,"ColumnOne", "CardThree");
		cardService.addCardToColumn(board,"ColumnTwo", "CardFour");
		cardService.addCardToColumn(board,"ColumnTwo", "CardFour");
		cardService.addCardToColumn(board,"ColumnThree", "CardFive");
		cardService.addCardToColumn(board,"ColumnThree", "CardSix");
		cardService.addCardToColumn(board,"ColumnFour", "CardSeven");
		
		
		//Getting all the cards in a column of a board
		System.out.println("-----");
		System.out.println("CARDS: "+cardService.getCards(board, "ColumnOne"));
		
		/*
		 * Label lblOne = new Label(1, "ONE"); Label lblTwo = new Label(2, "TWO"); Label
		 * lblThree = new Label(3, "THREE");
		 * 
		 * List<Label> lblList = new ArrayList<Label>(); lblList.add(lblOne);
		 * lblList.add(lblTwo);
		 * 
		 * Card cardOne = new Card(1, "CardOne", lblList, new Date(), 1); Card cardTwo =
		 * new Card(2, "CardTwo", lblList, new Date(), 1);
		 * 
		 * List<Card> cardList = new ArrayList<Card>(); cardList.add(cardOne);
		 * cardList.add(cardTwo);
		 * 
		 * Column colOne = new Column(1, "ColumnOne", cardList); Column colTwo = new
		 * Column(1, "ColumnTwo", cardList);
		 * 
		 * List<Column> colList = new ArrayList<Column>(); colList.add(colOne);
		 * colList.add(colTwo);
		 */
		
		
		
		Gson gson = new Gson();
		//Converting to JSON
		System.out.println("-----");
		System.out.println("JSON OUTPUT: "+gson.toJson(board));

		

	}

}
