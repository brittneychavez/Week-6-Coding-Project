package Week6;

public class Card {
	
//    a.      Card
//   	i.     Fields
//		1.     value (contains a value from 2-14 representing cards 2-Ace)
//		2.     name (e.g. Ace of Diamonds, or Two of Hearts)
//  
//	ii.    Methods
//		1.     Getters and Setters
//		2.     describe (prints out information about a card)
	
	private int value;
	private String name;
	public Card(String name, int value) {
		this.name = name;
		this.value = value;
		// TODO Auto-generated constructor stub
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String describeCard(Card card) {
		return card.getName();
	}
	
	

}
