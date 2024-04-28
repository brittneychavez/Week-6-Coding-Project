package Week6;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
//	   c.      Player
//		i.     Fields
//         1.     hand (List of Card)
//         2.     score (set to 0 in the constructor)
//         3.     name
	
	private List<Card> hand = new ArrayList<>();
	private int score;
	private String name;
	
//		ii.    Methods
//         1.     describe (prints out information about the player and calls the describe 
//				   method for each card in the Hand List)
//         2.     flip (removes and returns the top card of the Hand)
//         3.     draw (takes a Deck as an argument and calls the draw method on the deck, 
//				   adding the returned Card to the hand field)
//         4.     incrementScore (adds 1 to the Player’s score field)
	
	public void describePlayer(Player player) {
		System.out.println(player.getName());
		for (Card card: hand) {
			System.out.println(card.describeCard(card));
		}
	}
	
	public Card flip() {
		Card card = this.hand.remove(0);
		return card;
	}
	
	public Card draw() {
		Card card = this.hand.remove(0);
		return card;
	}
	
	public void incrementScore() {
		this.score++;
	}
	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
