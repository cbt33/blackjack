package blackjack;

import java.util.ArrayList;
import java.util.Vector;

public class Player {
	private ArrayList<Hand> hands;
	private Hand splitHand;
	private int chips;
	private int count;
	private int bet;
	private boolean hasBlackjack;
	private boolean isBust;
	private boolean isStand;
	
	public ArrayList<Hand> getHands() {
		return hands;
	}
	
	public void splitHand(Hand hand) throws HandCantBeSplitException, CloneNotSupportedException {
		if (hand.canSplit()) {
			splitHand = new Hand();
			splitHand.getCards().add((Card)hand.getCards().get(0).clone());
			hands.add(splitHand);
			hand.getCards().remove(0);
			//splitHand.add(hand.get);
		} else {
			throw new HandCantBeSplitException();
			}
	}
	
	public int placeBet(Blackjack blackjack, int bet) {
		this.bet = bet;
		chips-=bet;
		return bet;
	};
	
	public void play(Blackjack blackjack, Hand hand) throws CloneNotSupportedException {
		Card dealerCard = (Card)blackjack.getDealer().getHands()[0].getCards().get(0).clone();
		while (!isStand && !isBust) {
			switch (Strategy.useStrategy(hand, dealerCard)) {
			case Choice.DDH:
				break;
			case Choice.DDS:
				
				break;
			case Choice.HIT:
				blackjack.getDealer().dealPlayer(hand);
				break;
			case Choice.SPL:
				splitHand(hand);
				break;
			case Choice.STA:
				hand.setIsStand(true);
				break;
			case Choice.SUR:
				hand.setIsBust(true);
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
