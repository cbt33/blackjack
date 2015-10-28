package blackjack;

import java.util.Vector;

public class Hand {
	private Vector<Card> cards;
	private int points;
	private Vector<Card> aces;
	private boolean isSoft = false;
	
	public void addCard(Card card) {
		if (card.getRank() == Rank.ACE) {
			isSoft = true;
			aces.add(card);
		} else {
			cards.add(card);
		}
	}
	
	public void tallyPoints() {
		this.points = 0;
		for (Card card: cards) {
			this.points += card.getValue(this);
		}
		for (Card ace : aces) {
			this.points += ace.getValue(this);
		}
	}
	
	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public boolean isSoft() {
		return isSoft;
	}

	public void setSoft(boolean isSoft) {
		this.isSoft = isSoft;
	}

	public void setCards(Vector<Card> cards) {
		this.cards = cards;
	}

	public void setAces(Vector<Card> aces) {
		this.aces = aces;
	}

	public Vector<Card> getCards() {
		return cards;
	}
	
	public Vector<Card> getAces() {
		return aces;
	}
	
}
