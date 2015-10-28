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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aces == null) ? 0 : aces.hashCode());
		result = prime * result + ((cards == null) ? 0 : cards.hashCode());
		result = prime * result + (isSoft ? 1231 : 1237);
		result = prime * result + points;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hand other = (Hand) obj;
		if (aces == null) {
			if (other.aces != null)
				return false;
		} else if (!aces.equals(other.aces))
			return false;
		if (cards == null) {
			if (other.cards != null)
				return false;
		} else if (!cards.equals(other.cards))
			return false;
		if (isSoft != other.isSoft)
			return false;
		if (points != other.points)
			return false;
		return true;
	}

	
}
