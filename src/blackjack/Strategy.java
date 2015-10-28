package blackjack;

import static blackjack.Choice.*;

public class Strategy {
	
	private static final Choice[][]  hardHandMap = {{HIT, HIT, HIT, HIT, HIT, HIT, HIT, HIT, HIT, HIT,}, //5-8
												{HIT, DDH, DDH, DDH, DDH, HIT, HIT, HIT, HIT, HIT},  //9
												{DDH, DDH, DDH, DDH, DDH, DDH, DDH, DDH, HIT, HIT},  //10
												{DDH, DDH, DDH, DDH, DDH, DDH, DDH, DDH, DDH, HIT},  //11
												{HIT, HIT, STA, STA, STA, HIT, HIT, HIT, HIT, HIT},  //12
												{STA, STA, STA, STA, STA, HIT, HIT, HIT, HIT, HIT},  //13
												{STA, STA, STA, STA, STA, HIT, HIT, HIT, HIT, HIT},  //14
												{STA, STA, STA, STA, STA, HIT, HIT, HIT, SUR, HIT},  //15
												{STA, STA, STA, STA, STA, HIT, HIT, SUR, SUR, SUR},};//16
	
	private static final Choice[][] softHandMap = {{HIT, HIT, HIT, DDH, DDH, HIT, HIT, HIT, HIT, HIT,}, //A2
													{HIT, HIT, HIT, DDH, DDH, HIT, HIT, HIT, HIT, HIT},  //A3
													{HIT, HIT, DDH, DDH, DDH, DDS, DDS, DDS, HIT, HIT},  //A4
													{HIT, DDS, DDS, DDS, DDS, DDS, DDS, DDS, DDS, HIT},  //A5
													{HIT, HIT, STA, STA, STA, HIT, HIT, HIT, HIT, HIT},  //A6
													{STA, STA, STA, STA, STA, HIT, HIT, HIT, HIT, HIT},};  //A7
	
	
	private static final Choice[][] splitMap = new Choice[7][10];
	
	static {
		//Hard hand
	}
	
}
