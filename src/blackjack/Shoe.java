package blackjack;

import java.util.Stack;

public class Shoe {
	private Stack<Card> cards;
	private int numDecks;
	
	public Shoe(int n) {
		numDecks = n;
		cards = new Stack<Card>();
		Suit[] suits = {Suit.CLUBS, 
				Suit.DIAMONDS, 
				Suit.HEARTS, 
				Suit.SPADES };
		Rank[] ranks = {Rank.ACE,
						Rank.TWO,
						Rank.THREE,
						Rank.FOUR,
						Rank.FIVE,
						Rank.SIX,
						Rank.SEVEN,
						Rank.EIGHT,
						Rank.NINE,
						Rank.TEN,
						Rank.JACK,
						Rank.QUEEN,
						Rank.KING};
		for (int i=0; i < numDecks; i++){
			for (Suit suit: suits) {
				for (Rank rank: ranks) {
					cards.add(new Card(suit, rank));
				}
			}
		}
	}

	public Stack<Card> getCards() {
		return cards;
	}

	public void setCards(Stack<Card> cards) {
		this.cards = cards;
	}

	public int getNumDecks() {
		return numDecks;
	}

	public void setNumDecks(int numDecks) {
		this.numDecks = numDecks;
	}
	
}
