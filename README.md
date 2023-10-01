//GameOfWar contains code that will automatically run a card game of war. Each round of card draws is shown, and the player with the higher value card has one point added to their score. 
//Java language is used for this project. Editing was conducted in Eclipse. 

//The method 'draw' for the Player object draws a card from the deck. The card is gotten using a getter that returns a list of cards. The draw method from the deck hand returns the next card in the deck. The card is then added to the player's hand. 
This code required a stringent understanding of the returned values of each method. 
public void draw(Deck deck) {
		this.hand.add(deck.draw(deck.getCards()));//calls on the draw method from the deck and implements the returned List<Card> from the deck.getCards() method. Takes this and adds to the hand list. 
		// ^adds card(^returns card(^returns List<Card>))
		deck.getCards().remove(0); //removes the drawn card from the deck so that the next car drawn in that deck is not the same as the previous one 
	}

 //The method 
