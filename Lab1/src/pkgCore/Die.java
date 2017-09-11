package pkgCore;

import java.util.Random;

public class Die {
	
	private int DieValue;

	public Die() {
		Random r = new Random();
		DieValue = r.nextInt(6)+1;
	}

	public int getDieValue() {
		return DieValue;
	}
}
