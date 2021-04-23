public class InclineBenchCalculator {

	private int[5][2] sets;
	private int max;

	public BenchCalculator(int max) {
		sets[0][0] = (int)(max * 0.55);
		sets[1][0] = (int)(max * 0.65);
		sets[2][0] = (int)(max * 0.75);
		sets[3][0] = (int)(max * 0.85);
		sets[4][0] = (int)(max * 0.90);

		sets[0][1] = 10;
		sets[1][1] = 8;
		sets[2][1] = 6;
		sets[3][1] = 4;
		sets[4][1] = 3;

		for (int i = 0; i < sets.length; i++) {
			if (sets[i] % 5 < 2) {
				sets[i] -= sets[i] % 5;
			} else {
				sets[i] += (5 - sets[i] % 5);
			}
		}
	}
}