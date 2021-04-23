import java.util.Scanner;
public class BenchCalculator {	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your One-Rep Max: ");
		int max = scan.nextInt();
		
		int[] sets = new int[7];

		sets[0] = (int)(max * 0.55);
		sets[1] = (int)(max * 0.65);
		sets[2] = (int)(max * 0.75);
		sets[3] = (int)(max * 0.85);
		sets[4] = (int)(max * 0.885);
		sets[5] = (int)(max * 0.925);
		sets[6] = (int)(max * 0.75);

		for (int i = 0; i < sets.length; i++) {
			
			if (sets[i] % 5 < 2) {
				sets[i] -= sets[i] % 5;
			} else {
				sets[i] += (5 - sets[i] % 5);
			}

		}

		System.out.println("---------------------------");
		System.out.println("Set 1: " + sets[0] + " x 10");
		System.out.println("Set 2: " + sets[1] + " x 8");
		System.out.println("Set 3: " + sets[2] + " x 6");
		System.out.println("Set 4: " + sets[3] + " x 4");
		System.out.println("Set 5: " + sets[4] + " x 3");
		System.out.println("Set 6: " + sets[5] + " x 2");
		System.out.println("Set 7: " + sets[6] + " x 6");
	}
}
