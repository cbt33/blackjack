package blackjack;

import static blackjack.Choice.*;

import java.util.Hashtable;
import java.util.Map;

public class Strategy {
						     //2    3    4    5    6    7    8    9    10   A
	private static final Choice[][]  hardHand = {{HIT, HIT, HIT, HIT, HIT, HIT, HIT, HIT, HIT, HIT,}, //5-8
							{HIT, DDH, DDH, DDH, DDH, HIT, HIT, HIT, HIT, HIT},  //9
							{DDH, DDH, DDH, DDH, DDH, DDH, DDH, DDH, HIT, HIT},  //10
							{DDH, DDH, DDH, DDH, DDH, DDH, DDH, DDH, DDH, HIT},  //11
							{HIT, HIT, STA, STA, STA, HIT, HIT, HIT, HIT, HIT},  //12
							{STA, STA, STA, STA, STA, HIT, HIT, HIT, HIT, HIT},  //13
							{STA, STA, STA, STA, STA, HIT, HIT, HIT, HIT, HIT},  //14
							{STA, STA, STA, STA, STA, HIT, HIT, HIT, SUR, HIT},  //15
							{STA, STA, STA, STA, STA, HIT, HIT, SUR, SUR, SUR},};//16
	
	private static final Choice[][] softHand = {{HIT, HIT, HIT, DDH, DDH, HIT, HIT, HIT, HIT, HIT}, //A2
							{HIT, HIT, HIT, DDH, DDH, HIT, HIT, HIT, HIT, HIT},  //A3
							{HIT, HIT, DDH, DDH, DDH, DDS, DDS, DDS, HIT, HIT},  //A4
							{HIT, DDS, DDS, DDS, DDS, DDS, DDS, DDS, DDS, HIT},  //A5
							{HIT, HIT, STA, STA, STA, HIT, HIT, HIT, HIT, HIT},  //A6
							{STA, STA, STA, STA, STA, HIT, HIT, HIT, HIT, HIT},  //A7
							{STA, STA, STA, STA, STA, STA, STA, STA, STA, STA},  //A8
							{STA, STA, STA, STA, STA, STA, STA, STA, STA, STA},  //A9
							{STA, STA, STA, STA, STA, STA, STA, STA, STA, STA},}; //A10
	
	
	private static final Choice[][] split = {{SPL, SPL, SPL, SPL, SPL, SPL, HIT, HIT, HIT, HIT}, //2-2
						{SPL, SPL, SPL, SPL, SPL, SPL, HIT, HIT, HIT, HIT},  //3-3
						{HIT, HIT, HIT, SPL, SPL, HIT, HIT, HIT, HIT, HIT},  //4-4
						{DDH, DDH, DDH, DDH, DDH, DDH, DDH, DDH, HIT, HIT},  //5-5
						{SPL, SPL, SPL, SPL, SPL, HIT, HIT, HIT, HIT, HIT},  //6-6
						{SPL, SPL, SPL, SPL, SPL, SPL, HIT, HIT, HIT, HIT},  //7-7
						{STA, STA, STA, STA, STA, HIT, HIT, HIT, HIT, HIT},  //8-8
						{SPL, SPL, SPL, SPL, SPL, SPL, SPL, SPL, SPL, SPL},  //9-9
						{STA, STA, STA, STA, STA, STA, STA, STA, STA, STA}}; //10-10

	public static Hashtable<Rank, Integer> dealerCardMap = new Hashtable<Rank, Integer>();
	public static Hashtable<Integer, Integer> softHandMap = new Hashtable<Integer, Integer>();
	public static Hashtable<Integer, Integer> hardHandMap = new Hashtable<Integer, Integer>();
	public static Hashtable<Rank, Integer> splitMap = new Hashtable<Rank, Integer>();
	
	static {
		
		//Dealer Face up card
		dealerCardMap.put(Rank.TWO, 0);
		dealerCardMap.put(Rank.THREE, 1);
		dealerCardMap.put(Rank.FOUR, 2);
		dealerCardMap.put(Rank.FIVE, 3);
		dealerCardMap.put(Rank.SIX, 4);
		dealerCardMap.put(Rank.SEVEN, 5);
		dealerCardMap.put(Rank.EIGHT, 6);
		dealerCardMap.put(Rank.NINE, 7);
		dealerCardMap.put(Rank.TEN, 8);
		dealerCardMap.put(Rank.JACK, 8);
		dealerCardMap.put(Rank.QUEEN, 8);
		dealerCardMap.put(Rank.KING, 8);
		dealerCardMap.put(Rank.ACE, 9);
		
		//For hard hands
		hardHandMap.put(5, 0);
		hardHandMap.put(6, 0);
		hardHandMap.put(7, 0);
		for (int i = 0; i <=8; i++) {
			hardHandMap.put(i+8, i);
		}
		
		//For soft hands
		for (int i = 0; i <= 9; i++) {
			softHandMap.put(i+2, i);
		}
		
		//For splittable hands
		splitMap.put(Rank.TWO, 0);
		splitMap.put(Rank.THREE, 1);
		splitMap.put(Rank.FOUR, 2);
		splitMap.put(Rank.FIVE, 3);
		splitMap.put(Rank.SIX, 4);
		splitMap.put(Rank.SEVEN, 5);
		splitMap.put(Rank.EIGHT, 6);
		splitMap.put(Rank.NINE, 7);
		splitMap.put(Rank.TEN, 8);
		splitMap.put(Rank.JACK, 8);
		splitMap.put(Rank.QUEEN, 8);
		splitMap.put(Rank.KING, 8);
		
	}
	
	public static Choice useStrategy(Hand hand, Card dealerUpCard) {
		
		if (hand.canSplit()) {
			return split[splitMap.get(hand.get(0)][dealerCardMap.get(dealerUpCard)]
		}
		
		if (hand.isSoft())
		{
			return softHand[softHandMap.get(key)][dealerCardMap.get(dealerUpCard)];
		}
		
		if (hand.tallyPoints() >= 17)
			return STA;
		return hardHand[hand.getValue()][];
		
	}
	
}
