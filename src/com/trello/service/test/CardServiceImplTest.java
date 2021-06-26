package com.trello.service.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import com.trello.model.Board;
import com.trello.service.BoardServiceImpl;
import com.trello.service.CardServiceImpl;
import com.trello.service.ColumnServiceImpl;
import com.trello.service.IBoardService;
import com.trello.service.ICardService;
import com.trello.service.IColumnService;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CardServiceImplTest {

	Board board;
	ICardService cardService;
	IColumnService columnService;
	IBoardService boardService;

	
	
	@BeforeAll
	public void startTests() {
		System.out.println("Starting Tests");
	}
	@BeforeEach
	public void setup() {
		 board = new Board();
		cardService = new CardServiceImpl();
		columnService = new ColumnServiceImpl();
		boardService = new BoardServiceImpl();

	}
	@Test
	void testGetCards() {
		
		board.setColumn(boardService.addColumn("ColumnOne"));
		cardService.addCardToColumn(board, "ColumnOne", "TestCard");
		Assertions.assertFalse(cardService.getCards(board, "ColumnOne").isEmpty());
		Assertions.assertEquals(1, cardService.getCards(board, "ColumnOne").size());
		Assertions.assertTrue(cardService.getCards(board, "ColumnOne").stream()
				.filter(card -> card.getCardName().equals("TestCard")
						&& (card.getColumnId() == columnService.getColumn(board, "ColumnOne").getColumnId()))
				.findAny().isPresent());
	}

	@Test
	void testAddCardToColumn() {

		board.setColumn(boardService.addColumn("ColumnOne"));
		cardService.addCardToColumn(board, "ColumnOne", "TestCard");
		Assertions.assertFalse(cardService.getCards(board, "ColumnOne").isEmpty());
		Assertions.assertEquals(1, cardService.getCards(board, "ColumnOne").size());
		Assertions.assertTrue(cardService.getCards(board, "ColumnOne").stream()
				.filter(card -> card.getCardName().equals("TestCard")
						&& (card.getColumnId() == columnService.getColumn(board, "ColumnOne").getColumnId()))
				.findAny().isPresent());

	}
	
	@Test
	void testFailureAddCardToColumn() {

		board.setColumn(boardService.addColumn("ColumnOne"));
		
		Assertions.assertThrows(RuntimeException.class, () -> cardService.addCardToColumn(null, "ColumnOne", "TestCard"));
		

	}
	@AfterAll
	public void finishTests() {
		System.out.println("");
	}

}
