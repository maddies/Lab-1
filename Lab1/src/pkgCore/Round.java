package pkgCore;

import java.util.LinkedList;

public class Round {

	private int ComeOutScore;
	private eGameResult eGameResult;
	private LinkedList<Roll> rolls = new LinkedList<Roll>();
	
	private Roll ComeOutRoll; // created

	public Round() {
				
		int ComeOutScore = ComeOutRoll.getScore();

		switch (ComeOutScore) {

		case 2:
		case 3:
		case 12:
			eGameResult = eGameResult.CRAPS;
			rolls.add(ComeOutRoll);

		case 7:
		case 11:
			eGameResult = eGameResult.NATURAL;
			rolls.add(ComeOutRoll);

		default:
			rolls.add(ComeOutRoll);
			Roll ReRoll = new Roll();
			rolls.add(ReRoll);

			while (ReRoll.getScore() != ComeOutScore || ReRoll.getScore() != 7) {
				ReRoll = new Roll();
				rolls.add(ReRoll);
			}

			if (ReRoll.getScore() == ComeOutScore) {
				eGameResult = eGameResult.POINT;

			} else {
				eGameResult = eGameResult.SEVEN_OUT;
			}
		}
	}		

	public int RollCount() {	
		return rolls.size();
	}

}
