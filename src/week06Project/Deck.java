package week06Project;


import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class Deck {
	
	
	private List<Card> cards;

	
	public Deck() { // Creates the Deck method
		this.cards = new ArrayList<>();
		makeTheDeck(); // Initializes the method to make the deck
	}

	private void makeTheDeck() {
		String[] suits = {"Hearts","Diamonds","Clubs","Spades"}; // Creates the suits
		for (String suit : suits) { // Enhanced For loop for all four suits
			for (int value = 2; value <= 14; value++){ // Goes through values 2 - 14, with 14 being the Ace; Creates one unit of each value with each suit
				String name = faceCards(value) + " of " + suit; // Creates the string name of the individual card
				Card card = new Card(value, name); // Creates the name and value of the card
				cards.add(card); // Adds the created card into the List of Cards
			}
		}
	}
	
	public void shuffle() {
		Collections.shuffle(cards); // Uses the Shuffle method from the Collections set to randomize the List of cards
	}
		

	private String faceCards(int value) { // Uses a Switch to change the names of values 11-14 to their respective Face cards
		if (value >= 11 && value <= 14) {
			switch(value) {
			case 11:
				return "Jack";
			case 12:
				return "Queen";
			case 13:
				return "King";
			case 14:
				return "Ace";
			}
		}
		return String.valueOf(value);
	}

	
	public Card draw() {
		if (!cards.isEmpty()) { // If Deck is not empty
			return cards.remove(0); // Remove the card at index 0 and return it as a value
		} else { 
			return null;
		}
	}
}

