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
		if (hand.isSplittable())
			splitHand = new Hand();
			splitHand.add(card[1]);
	}
	
	public int placeBet(Blackjack blackjack) {
		int bet = 0;
		return bet;
	};
	
	public void play(Blackjack blackjack) {
		Card dealerCard = blackjack.getDealer().getHand().getCards().get(0);
		while (!isStand && !isBust) {
			
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
