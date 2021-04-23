import java.util.Scanner;
public class SquatCalculator {	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your One-Rep Max: ");
		int max = scan.nextInt();
		
		int[] sets = new int[6];

		sets[0] = (int)(max * 0.60);
		sets[1] = (int)(max * 0.70);
		sets[2] = (int)(max * 0.80);
		sets[3] = (int)(max * 0.85);
		sets[4] = (int)(max * 0.875);
		sets[5] = (int)(max * 0.925);

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
	}
}
