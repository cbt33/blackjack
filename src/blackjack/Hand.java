package blackjack;

import java.util.ArrayList;

public class Hand {

	private ArrayList<Card> cards;
	private int points;
	
	public void addCard(Card card) {
			cards.add(card);
	}
	
	public int tallyPoints(boolean lessAces) throws CloneNotSupportedException {
		this.points = 0;
		Hand aces = new Hand();
		for (Card card: cards) {
			if (card.getRank() == Rank.ACE) {
				aces.addCard((Card)card.clone());
			}
			else {
				this.points += card.getValue(this);
			}
			
			if (!lessAces) {
				for (Card ace: aces.getCards()) {
					this.points+=ace.getValue(this);
				}
			}
			
			return this.points;
			
		}
		
		
		for (Card card: aces.getCards()) {
			this.points += card.getValue(this);
		}
		
		return this.points;
	}
	
	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {	
		this.points = points;
	}

	public boolean isSoft() {
		for (Card card: this.getCards()) {
			if (card.getRank() == Rank.ACE)
				return true;
		}
		return false;
	}
	
	public boolean canSplit() {
		if (cards.size()==2 && cards.get(0).getRank() == cards.get(1).getRank())
			return true;
		else
			return false;
	}

	public void setCards(ArrayList<Card> cards) {
		this.cards = cards;
	}


	public ArrayList<Card> getCards() {
		return cards;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cards == null) ? 0 : cards.hashCode());
		result = prime * result + (isSoft() ? 1231 : 1237);
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
		if (cards == null) {
			if (other.cards != null)
				return false;
		} else if (!cards.equals(other.cards))
			return false;
		if (points != other.points)
			return false;
		return true;
	}

	
}
