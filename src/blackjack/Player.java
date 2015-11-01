package blackjack;

import java.util.Vector;

public class Player {
	private Hand hand;
	private Hand splitHand;
	private int chips;
	private int count;
	private boolean hasBlackjack;
	private boolean isBust;
	private boolean isStand;
	
	public Hand getHand() {
		return hand;
	}

	public void setHand(Hand hand) {
		this.hand = hand;
	}
	
	public void splitHand() {
		if (hand.canSplit())
			splitHand = new Hand();
			//splitHand.add(hand.get);
	}
	
	public int placeBet(Blackjack blackjack) {
		int bet = 0;
		return bet;
	};
	
	public void play(Blackjack blackjack) throws CloneNotSupportedException {
		Card dealerCard = blackjack.getDealer().getHand().getCards().get(0);
		while (!isStand && !isBust) {
			switch (Strategy.useStrategy(hand, dealerCard)) {
			case DDH:
				break;
			case DDS:
				break;
			case HIT:
				blackjack.getDealer().dealPlayer(this);
				break;
			case SPL:
				break;
			case STA:
				break;
			case SUR:
				break;
			default:
				break;
			}
		}
	}
	
	public void count(Card card) {
		switch (card.getRank()) {
		case THREE:
			count++;
		case FOUR:
			count++;
		case FIVE:
			count++;
		case SIX:
			count++;
		case TEN:
			count--;
		case JACK:
			count--;
		case QUEEN:
			count--;
		case KING:
			count--;
		default:
			return;
		}
	}

}
