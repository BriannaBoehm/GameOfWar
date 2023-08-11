package week06Project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	private List<Card> cards = new ArrayList<Card>(); //An object of Deck is essentially a list of cards. 

	public Deck() {
		String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"}; //array of suits for the cards 
		String[] names = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"}; //array of names of the cards 
		for(String suit: suits) {
			int count = 2;
			for(String name : names) {
				Card card = new Card(count, name + " of " + suit); //Instantiating a new card with the count as the value (type int) and the String name + " of " + suit as the name of the card (type String). 
				cards.add(card); //adding the cards to the ArrayList<Card> called cards 
				count++; //increments to give one higher value for the next card. Counter starts at 2 and the names array starts at Two, so these will coincide. 
			}
		}
	}
	
	public List<Card> getCards() { //gets the list of cards 
		return cards;
	}

	public void setCards(List<Card> cards) { //sets the list of cards 
		this.cards = cards;
	}
	
	public void shuffle() { //shuffle method returns a random shuffling of the same list of cards 
		Collections.shuffle(this.cards); //Collections have a built-in shuffle method. 
	}
	
	public Card draw(List<Card> cards) { //draw method draws the first card of the deck 
		return cards.get(0); //calls the get method on the cards list to return the card at index 0. This is the top card. 
	}
	

}
