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
	
	public Rank getRank() {
		return rank;
	}
	
	public Suit getSuit() {
		return suit;
	}
	
}
