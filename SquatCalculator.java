public class SquatCalculator {

	private int[6][2] sets;
	private int max;

	public BenchCalculator(int max) {
		sets[0][0] = (int)(max * 0.60);
		sets[1][0] = (int)(max * 0.70);
		sets[2][0] = (int)(max * 0.80);
		sets[3][0] = (int)(max * 0.85);
		sets[4][0] = (int)(max * 0.885);
		sets[5][0] = (int)(max * 0.925);

		sets[0][1] = 10;
		sets[1][1] = 8;
		sets[2][1] = 6;
		sets[3][1] = 4;
		sets[4][1] = 3;
		sets[5][1] = 2;

		for (int i = 0; i < sets.length; i++) {
			if (sets[i] % 5 < 2) {
				sets[i] -= sets[i] % 5;
			} else {
				sets[i] += (5 - sets[i] % 5);
			}
		}
	}
}
