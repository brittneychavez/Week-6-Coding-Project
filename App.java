package Week6;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1. Create the following classes:

//		       a.      Card
//		       	i.     Fields
//					1.     value (contains a value from 2-14 representing cards 2-Ace)
//					2.     name (e.g. Ace of Diamonds, or Two of Hearts)
//		      
//				ii.    Methods
//					1.     Getters and Setters
//					2.     describe (prints out information about a card)
//				
//			   b.     Deck
//		        i.     Fields
//					1.     cards (List of Card)
//		      
//				ii.    Methods
//					1.     shuffle (randomizes the order of the cards)
//					2.     draw (removes and returns the top card of the Cards field)
//					3.     In the constructor, when a new Deck is instantiated, the Cards field 
//						   should be populated with the standard 52 cards.

//			   c.      Player
//				i.     Fields
//		            1.     hand (List of Card)
//		            2.     score (set to 0 in the constructor)
//		            3.     name

//				ii.    Methods
//		            1.     describe (prints out information about the player and calls the describe 
//						   method for each card in the Hand List)
//		            2.     flip (removes and returns the top card of the Hand)
//		            3.     draw (takes a Deck as an argument and calls the draw method on the deck, 
//						   adding the returned Card to the hand field)
//		            4.     incrementScore (adds 1 to the Player’s score field)


//		2. Create a class called App with a main method.

//			a.      Instantiate a Deck and two Players, call the shuffle method on the deck.
		Deck deck = new Deck();
		Player playerOne = new Player();
		Player playerTwo = new Player();
		deck.shuffle();
		
//			b.      Using a traditional for loop, iterate 52 times calling the Draw method on the 
//					other player each iteration using the Deck you instantiated.
		
		for (int i = 0; i < 26; i++) {
			playerOne.getHand().add(deck.draw());
			playerTwo.getHand().add(deck.draw());
		}
		
//			c.      Using a traditional for loop, iterate 26 times and call the flip method for each 
//					player.
		
		for (int i = 0; i < 26; i++) {
		Card pOneFlip =	playerOne.flip();
		Card pTwoFlip = playerTwo.flip();
		System.out.println("Player one's card is: " + pOneFlip.describeCard(pOneFlip));
		System.out.println("Player two's card is: " + pTwoFlip.describeCard(pTwoFlip));
//					Compare the value of each card returned by the two player’s flip methods. Call 
//					the incrementScore method on the player whose card has the higher value.  
//					Print a message to say which player received a point.
//					Note:  If the values are equal (it is a tie), print a message saying that no 
//					point was awarded.
		
		if (pOneFlip.getValue() > pTwoFlip.getValue()) {
			System.out.println("Player one wins this round");
			playerOne.incrementScore();
		} else if (pOneFlip.getValue() < pTwoFlip.getValue()) {
			System.out.println("Player two wins this round");
			playerTwo.incrementScore();
		} else {
			System.out.println("It's a tie!");
		}
		System.out.println("Player one current score: " + playerOne.getScore());
		System.out.println("Player two current score: " + playerTwo.getScore()+ "\n");
		}
//			d.      After the loop, compare the final score from each player.
		System.out.println("Player one final score: " + playerOne.getScore());
		System.out.println("Player two final score: " + playerTwo.getScore());
		if (playerOne.getScore() > playerTwo.getScore()) {
			System.out.println("Player one wins the game!");
		} else if (playerOne.getScore() < playerTwo.getScore()) {
			System.out.println("Player two wins the game!");
		} else {
			System.out.println("The game ends in a tie");
		}
		
//			e.      Print the final score of each player and either “Player 1”, “Player 2”, or 
//					“Draw” depending on which score is higher or if they are both the same.
			
		 

//		3.  Tips:  Printing out information throughout the game adds value including easier 
//				   debugging as you progress and a better user experience.
		
		
		

//			a.  Using the Card describe() method when each card is flipped illustrates the game play.
//			b.  Printing the winner of each turn adds interest -- or a message indicating a tie.
//			c.  Printing the updated score after each turn shows game progression.
//			d.  At the end of the game: print the final score of each player and the winner’s 
//				name or “Draw” if the result is a tie.
		
	}

}
