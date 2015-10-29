package blackjack;

public class Card {

	private Suit suit;
	private Rank rank;
	
	Card(Suit s, Rank r) {
		suit = s;
		rank = r;
	}
	
	//The value of the ace depends on player's hand value
	public int getValue(Hand hand) {
		switch (rank) {
		case ACE:
			if (hand.getPoints() <= 11)
				return 10;
			else
				return 1;
		case EIGHT:
			return 8;
		case FIVE:
			return 5;
		case FOUR:
			return 4;
		case JACK:
			return 10;
		case KING:
			return 10;
		case NINE:
			return 9;
		case QUEEN:
			return 10;
		case SEVEN:
			return 7;
		case SIX:
			return 6;
		case TEN:
			return 10;
		case THREE:
			return 3;
		case TWO:
			return 2;
		default:
			return 0;
		}	
	}
	
	public int getValue() {
		switch (rank) {
		case ACE:
			return 10;
		case EIGHT:
			return 8;
		case FIVE:
			return 5;
		case FOUR:
			return 4;
		case JACK:
			return 10;
		case KING:
			return 10;
		case NINE:
			return 9;
		case QUEEN:
			return 10;
		case SEVEN:
			return 7;
		case SIX:
			return 6;
		case TEN:
			return 10;
		case THREE:
			return 3;
		case TWO:
			return 2;
		default:
			return 0;
		}	
	}
	
	public Rank getRank() {
		return rank;
	}
	
	public Suit getSuit() {
		return suit;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((rank == null) ? 0 : rank.hashCode());
		result = prime * result + ((suit == null) ? 0 : suit.hashCode());
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
		Card other = (Card) obj;
		if (rank != other.rank)
			return false;
		if (suit != other.suit)
			return false;
		return true;
	}
	
}
