package blackjack;

public class StrategyData {
	private Card dealerUpCard;
	private Hand playerHand;
	
	public StrategyData(Card dealerUpCard, Hand playerHand) {
		super();
		this.dealerUpCard = dealerUpCard;
		this.playerHand = playerHand;
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dealerUpCard == null) ? 0 : dealerUpCard.hashCode());
		result = prime * result + ((playerHand == null) ? 0 : playerHand.hashCode());
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
		StrategyData other = (StrategyData) obj;
		if (dealerUpCard == null) {
			if (other.dealerUpCard != null)
				return false;
		} else if (!dealerUpCard.equals(other.dealerUpCard))
			return false;
		if (playerHand == null) {
			if (other.playerHand != null)
				return false;
		} else if (!playerHand.equals(other.playerHand))
			return false;
		return true;
	}



	public Card getDealerUpCard() {
		return dealerUpCard;
	}

	public void setDealerUpCard(Card dealerUpCard) {
		this.dealerUpCard = dealerUpCard;
	}

	public Hand getPlayerHand() {
		return playerHand;
	}

	public void setPlayerHand(Hand playerHand) {
		this.playerHand = playerHand;
	}
	
}
