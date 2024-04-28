package Week6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Deck {
	
//	   b.     Deck
//    i.     Fields
//		1.     cards (List of Card)
//  
//	ii.    Methods
//		1.     shuffle (randomizes the order of the cards)
//		2.     draw (removes and returns the top card of the Cards field)
//		3.     In the constructor, when a new Deck is instantiated, the Cards field 
//			   should be populated with the standard 52 cards.
	
	private List<Card> deck = new ArrayList<>();

	Deck() {
	String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
	String[] numbers = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
						"Ten", "Jack", "Queen", "King", "Ace"};
	for (String suit : suits) {
		int count = 2;
		for (String number : numbers) {
			Card card = new Card(number + " of " + suit, count);
			this.deck.add(card); 
			count++;
		}
		
	}
	} //End of deck constructor
	
	public void shuffle() {
		Collections.shuffle(this.deck);
	} //End of shuffle
	
	public Card draw() {
		Card card = this.deck.remove(0);
		return card;
	}
	
}