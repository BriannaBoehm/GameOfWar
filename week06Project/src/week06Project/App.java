package week06Project;

import java.util.ArrayList;
import java.util.List;

public class App {

	//ISSUES: the draw method of the deck only assigns the first card 
	public static void main(String[] args) {

		//a.      Instantiate a Deck and two Players, call the shuffle method on the deck.
		Deck deck = new Deck(); //instantiates a new deck 
		List<Card> emptyListPlayer1 = new ArrayList<Card>();//empty list to be able to instantiate a player 
		List<Card> emptyListPlayer2 = new ArrayList<Card>();//empty list to be able to instantiate a player
		Player player1 = new Player(emptyListPlayer1, "Player 1");//instantiates player known as Player 1 
		Player player2 = new Player(emptyListPlayer2, "Player 2");//instantiates player known as Player 2
		
		deck.shuffle(); //uses the shuffle method to shuffle the deck 
		
		
		//b.     Using a traditional for loop, iterate 52 times calling the Draw method on the other player each iteration using the Deck you instantiated.
		for(int i = 0; i < 52; i++) {
			if ( i % 2 == 0) {
				player1.draw(deck); //gives the first card to Player 1 and every other card after that 
			} else {
				player2.draw(deck); //gives the second card to Player 2 and every other card after that 
			}
		} 
		
		player1.describe(); //shows Player 1's initial score and hand 
		player2.describe(); //shows Player 2's initial score and hand 
		
		//c.      Using a traditional for loop, iterate 26 times and call the flip method for each player.
		//d.     Compare the value of each card returned by the two player’s flip methods. Call the incrementScore method on the player whose card has the higher value.
		
		for(int i = 1; i <= 26; i++) {
			System.out.println("Round " + i);
			System.out.print("Player 1 card: ");
			Card player1FlippedCard = player1.flip();
			player1FlippedCard.describe();
			System.out.print("Player 2 card: ");
			Card player2FlippedCard = player2.flip();
			player2FlippedCard.describe();
			if (player1.getHand().size() > 1 && player2.getHand().size() > 1) {
			player1.getHand().remove(0);
			player2.getHand().remove(0);
			}
			if(player1FlippedCard.getValue() > player2FlippedCard.getValue()) {
//				System.out.println("Player 1 card value = " + player1FlippedCard.getValue());
//				System.out.println("Player 2 card value = " + player2FlippedCard.getValue());
				player1.incrementScore();
				System.out.println("Player 1 wins this round!");
			} else if (player2FlippedCard.getValue() > player1FlippedCard.getValue()){
//				System.out.println("Player 1 card value = " + player1FlippedCard.getValue());
//				System.out.println("Player 2 card value = " + player2FlippedCard.getValue());
				player2.incrementScore();
				System.out.println("Player 2 wins this round!");
			} else {
//				System.out.println("Player 1 card value = " + player1FlippedCard.getValue());
//				System.out.println("Player 2 card value = " + player2FlippedCard.getValue());
				System.out.println("This round is a draw!");
			}
			System.out.println("Player 1 score: " + player1.getScore());
			System.out.println("Player 2 score: " + player2.getScore());
			System.out.println("--------------------------------------------------------");
		}
		
		//e.      After the loop, compare the final score from each player.

		// f.      Print the final score of each player and either “Player 1”, “Player 2”, or “Draw” depending on which score is higher or if they are both the same.
		System.out.println("Final Scores");
			System.out.println("Player 1 : " + player1.getScore());
			System.out.println("Player 2 : " + player2.getScore());
		if(player1.getScore() > player2.getScore()) {
			System.out.println("Winner : Player 1!");
		} else if (player2.getScore() > player1.getScore()){
			System.out.println("Winner : Player 2!");
		} else {
			System.out.println("Draw!");
		}
	}

}