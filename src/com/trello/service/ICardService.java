package com.trello.service;

import java.util.List;

import com.trello.model.Card;
import com.trello.model.Label;

public interface ICardService {
	
	
	public void addCard(Card card, List<Label> labels, int columnId) ;
		
	

}
