package week06Project;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	private List<Card> hand = new ArrayList<Card>(); //each player has their own list of cards in their hand. (A method in the app distributes the deck evenly to the two players' hands.) 
	private int score; //each player has a unique score. 
	private String name; //each player has a unique name. 
	
	
	//constructor 
	public Player(List<Card> hand, String name) { //players will be assigned a list of cards for their hand and a name. 
		this.hand = hand;
		this.score = 0; //sets the original this.score to zero for when the game starts 
		this.name = name;
	}


	public List<Card> getHand() { //getter for hand 
		return hand;
	}


	public void setHand(List<Card> hand) { //setter for hand
		this.hand = hand;
	}


	public int getScore() {//getter for score
		return score;
	}


	public void setScore(int score) {//setter for score
		this.score = score;
	}


	public String getName() {//getter for name 
		return name;
	}


	public void setName(String name) {//setter for name 
		this.name = name;
	}
	
	public void describe() { //method to describe the player's name, score, and the cards they have in their hand 
		System.out.println(this.name + ": score = " + this.score);
		System.out.println(this.name + "'s hand:");
		System.out.println("---------------");
		for (Card card : this.hand) {
			card.describe();
			}
		System.out.println("---------------");
	}
	
	public Card flip() {//returns the first card of the player's hand using the get method on the hand variable 
		return this.hand.get(0);
	}
	
	public void draw(Deck deck) {
		this.hand.add(deck.draw(deck.getCards()));//calls on the draw method from the deck and implements the returned List<Card> from the deck.getCards() method. Takes this and adds to the hand list. 
		// ^adds card(^returns card(^returns List<Card>))
		deck.getCards().remove(0); //removes the drawn card from the deck so that the next car drawn in that deck is not the same as the previous one 
	} 
	
	public int incrementScore() {
		return this.score++; //incrementsScore 
	}
}
