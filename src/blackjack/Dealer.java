package blackjack;

public class Dealer extends Player {
	private Shoe shoe;
	private DealerHand dhand;
	
	public Card dealPlayer(Player player) {
		Card card = shoe.getCards().pop();
		player.getHands()[0].addCard(card.clone());
		return (Card)card.clone();
	}
	
	public Card hitHand(Hand hand) {
		Card card = shoe.getCards().pop();
		player.getHands()[0].addCard((Card)card.clone());
		return (Card)card.clone();
	}
	
	public Card dealDealer() {
		//Hole card
		Card holeCard = shoe.getCards().pop();
		//
		dhand.setHoleCard(holeCard);
		Card card = shoe.getCards().pop();
		dhand.getCards().add(card);
		return card;
	}
	
	public void burn() {
		shoe.getCards().pop();
	}
	
}
