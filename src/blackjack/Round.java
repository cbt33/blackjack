package blackjack;

public class Round {
	
	private Blackjack blackjack;
	
	public Round(Blackjack blackjack) {
		this.blackjack = blackjack;
	}
	
	//All players count card dealt
	public void count(Card card) {
		for (Player player : blackjack.getPlayers()) {
			if (player != null)
				player.count(card);
		}		
	}
	
	//Place bets
	public void placeBets() {
		for (Player player : blackjack.getPlayers()) {
			if (player != null) {
				player.placeBet(this.blackjack);
			}
		}
	}
		
	//Dealer deals each player two cards 
	//Dealer deals self one card up, one down
	public void deal() {
		for (Player player : blackjack.getPlayers()) {
			if (player != null) {
				count(blackjack.getDealer().dealPlayer(player));
				count(blackjack.getDealer().dealPlayer(player));
			}
		}
		count(blackjack.getDealer().dealDealer());
	}
	
	//Dealer asks each player whether want to hit or stand
	//-player can double down, receives only one more card
	//-player can split if two cards received of same face value, place equal bet alongside first bet, plays each separately
	//-
	public void playerPlay() throws CloneNotSupportedException {
		for (Player player : blackjack.getPlayers()) {
			if (player != null) {
				for (Hand hand : player.getHands()) {
					if (hand != null && !hand.isBust() && !hand.isBlackjack() && !isStand())
					player.play(blackjack, hand);
				}
			}
		}
	}
	
	//Dealer reveals hole card and hits or stands
	//If player total higher than dealers, player wins
	//-If player has blackjack, dealer pays 3 to 2
	//If both get blackjack, it is push, neither loses money
	//If player has higher total, dealer matches bet
	//If player has lower total, dealer takes player bet
}
