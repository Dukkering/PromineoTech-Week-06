package week06Project;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
	// Create a deck and two players
	Deck deck = new Deck();
	
	// Scanner implemented to get player names
	Scanner playerName1 = new Scanner(System.in);
	Scanner playerName2 = new Scanner(System.in);
	
	System.out.println("Please enter Player 1's name.");
	Player player1 = new Player(playerName1.nextLine());
	System.out.println("Please enter Player 2's name.");
	Player player2 = new Player(playerName2.nextLine());
	
	// Shuffling the deck by calling the method from the deck class
	deck.shuffle();
	
	// Splitting the shuffled deck between the two players
	for (int i = 0; i < 52; i++) {
		player1.draw(deck);
		player2.draw(deck);
	}
	
	// Main gameplay loop; Each player invokes the flip method which takes the item in position 0 in the Hand list for that player, removes it from their Hand List and declares it by name. The 
	// point values of the two cards are compared and the points are assigned based on the higher relative value. The scoreboard is then printed at the end of the iteration, and a thread.sleep is in place to
	// stagger the event and make it more visually appealing to watch progress over time instead of just being dumped out all at once as a finished product; This is a case where the journey is important, not
	// the destination.
	
	for (int i = 0; i < 26; i++) {
		Card card1 = player1.flip();
		Card card2 = player2.flip();
		
		System.out.println(player1.getName() + " flipped over " + card1.getName());
		System.out.println(player2.getName() + " flipped over " + card2.getName());
		System.out.println();
		
		if (card1.getValue() > card2.getValue()) {
			player1.incrementScore();
			System.out.println(player1.getName() + " gets a point.");
		} else if (card1.getValue() < card2.getValue()) {
			player2.incrementScore();
			System.out.println(player2.getName() + " gets a point.");
		} else {
			System.out.println("No points are awarded.");
		}
	
	System.out.println();
	System.out.println("* * * * * " + player1.getName() + " - " + player1.getScore() + " |-|-|-| " + player2.getName() + " - " + player2.getScore() + " * * * * *");
	System.out.println();
	
	// Added a Thread.sleep to add a second of delay between iterations to make the game more visually interesting to watch process instead of just dropping the entire result in one shot
	try { 
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	}
	
	// Declares the game winner based on the higher score obtained during the game.
	
	if (player1.getScore() > player2.getScore()) {
		System.out.println(player1.getName() + " wins!");
	} else if (player1.getScore() < player2.getScore()) {
		System.out.println(player2.getName() + " wins!");
	} else {
		System.out.println("It's a draw.");
		}
	
	
	}

}
