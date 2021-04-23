public class BenchCalculator {

	private int[7][2] sets;
	private int max;

	public BenchCalculator(int max) {
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
}
