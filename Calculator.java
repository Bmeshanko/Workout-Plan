public class Calculator {
	private int[][] sets;

	public int[][] getSets() {
		return this.sets;
	}

	public void round() {
		for (int i = 0; i < sets.length; i++) {
			if (sets[i] % 5 < 2) {
				sets[i] -= sets[i] % 5;
			} else {
				sets[i] += (5 - sets[i] % 5);
			}
		}
	}

	public void pyramid(int max) {
		sets = new int[7][2];
		
		sets[0][0] = (int)(max * 0.55);
		sets[1][0] = (int)(max * 0.65);
		sets[2][0] = (int)(max * 0.75);
		sets[3][0] = (int)(max * 0.85);
		sets[4][0] = (int)(max * 0.885);
		sets[5][0] = (int)(max * 0.925);
		sets[6][0] = (int)(max * 0.75);

		sets[0][1] = 10;
		sets[1][1] = 8;
		sets[2][1] = 6;
		sets[3][1] = 4;
		sets[4][1] = 3;
		sets[5][1] = 2;
		sets[6][1] = 6;
	}

	public void fivefive(int max) {
		sets = new int[5][2];

		sets[0][0] = (int)(max * 0.85);
		sets[1][0] = (int)(max * 0.85);
		sets[2][0] = (int)(max * 0.85);
		sets[3][0] = (int)(max * 0.85);
		sets[4][0] = (int)(max * 0.85);

		for (int i = 0; i < 5; i++) {
			sets[i][1] = 5;
		}
	}

	public void tenten(int max) {
		sets = new int[10][2];

		sets[0][0] = (int)(max * 0.6);
		sets[1][0] = (int)(max * 0.6);
		sets[2][0] = (int)(max * 0.6);
		sets[3][0] = (int)(max * 0.6);
		sets[4][0] = (int)(max * 0.6);
		sets[5][0] = (int)(max * 0.6);
		sets[6][0] = (int)(max * 0.6);
		sets[7][0] = (int)(max * 0.6);
		sets[8][0] = (int)(max * 0.6);
		sets[9][0] = (int)(max * 0.6);

		for (int i = 0; i < 10; i++) {
			sets[i][1] = 10;
		}
	}
	
	public void machine() {
		sets = new int[4][2];

		sets[0][0] =  
	}

	public void buildup(int max) {
		// Should maybe have possibility to change increments.

		sets = new int[6][2];
		
		sets[0][0] = (int)(max * 0.8);
		sets[1][0] = sets[0][0] + 5;
		sets[2][0] = sets[0][0] + 10;
		sets[3][0] = sets[0][0] + 15;
		sets[4][0] = sets[0][0] + 20;

		sets[0][1] = 8
		sets[1][1] = 7
		sets[2][1] = 5
		sets[3][1] = 4
		sets[4][1] = 3
	}
}
