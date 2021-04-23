import java.util.Scanner;
public class BenchCalculator {	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your One-Rep Max: ");
		int max = scan.nextInt();
		
		int[] sets = new int[7];

		sets[0] = max * 0.55;
		sets[1] = max * 0.65;
		sets[2] = max * 0.75;
		sets[3] = max * 0.85;
		sets[4] = max * 0.885;
		sets[5] = max * 0.925;
		sets[6] = max * 0.75;

	}
}
