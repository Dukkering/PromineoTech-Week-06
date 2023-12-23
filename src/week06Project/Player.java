package week06Project;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private List<Card> hand;
	private int score;
	private String name;
	
	public Player(String name) {
		this.hand = new ArrayList<>(); // Creates a new List for the Player's hand of cards
		this.score = 0; // Initializes the score at 0
		this.name = name; // Sets the player Name
	}
	
	
	public void describe() {
		System.out.println(name + "'s hand."); // Lists the player's name and the cards in their hand using the Describe method create in the Card class and an Enhanced For loop
		for (Card card : hand) {
			card.describe();
		}
	}
	
	public Card flip() {
		if (!hand.isEmpty()) { // Same as the Draw method from the Deck Class, except it applies to the Hand list instead of the Deck list. 
			return hand.remove(0);
		} else {
			return null; 
		}
	}
	
	public void draw(Deck deck) { // Method to draw a card from the Deck list. If the value is not null (Which only happens if the list is empty), it adds that card to the Hand list for that player.
		Card drawnCard = deck.draw();
		if (drawnCard != null) {
			hand.add(drawnCard);
		}
	}
	
	public void incrementScore() {
		score++;
	}
	
	
	public int getScore() {
		return score;
	}
	public String getName() {
		return name;
	}
}
