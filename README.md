//GameOfWar contains code that will automatically run a card game of war. Each round of card draws is shown, and the player with the higher value card has one point added to their score. 
//Java language is used for this project. Editing was conducted in Eclipse. 

//The method 'draw' for the Player object draws a card from the deck. The card is gotten using a getter that returns a list of cards. The draw method from the deck hand returns the next card in the deck. The card is then added to the player's hand. 
This code required a stringent understanding of the returned values of each method. 
public void draw(Deck deck) {
		this.hand.add(deck.draw(deck.getCards()));//calls on the draw method from the deck and implements the returned List<Card> from the deck.getCards() method. Takes this and adds to the hand list. 
		// ^adds card(^returns card(^returns List<Card>))
		deck.getCards().remove(0); //removes the drawn card from the deck so that the next car drawn in that deck is not the same as the previous one 
	}

 //The constructor for the Deck class uses two different for loops to instantiate a deck of cards and assign values to the cards. The nested for loops were required to instantiate all four suits. 

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

 //Please reach out with questions! I can be contacted at brianna.d.boehm@gmail.com 
