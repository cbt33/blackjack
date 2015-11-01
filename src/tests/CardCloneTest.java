package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import blackjack.Card;
import blackjack.Rank;
import blackjack.Suit;

public class CardCloneTest {

	@Test
	public void test() throws CloneNotSupportedException {
		Card card = new Card(Suit.HEARTS, Rank.ACE);
		Card clone = (Card)card.clone();
		assertEquals(Suit.HEARTS, clone.getSuit());
	}

}
