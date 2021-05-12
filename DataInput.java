import java.io.*;
import java.util.Scanner;

public class DataInput {
	
	// Machines with Star will be max weight.
	// Machines without Star will be 4x10 weight.

	private int[] lifts;
	// 0: Bench Press*
	// 1: Incline Bench Press*
	// 2: Deltoid Flex
	// 3: Tricep Extension
	// 4: Tricep Dips
	// 5: Tricep Pushdown
	// 6: Shoulder Press
	// 7: Lateral/Front Raises
	// 8: Clean and Press*
	// 9: LAT Pulldown
	// 10: Deadlift*
	// 11: Low Row
	// 12: Seated Bicep Curls
	// 13: Dumbbell Row
	// 14: Standing Cable Curls
	// 15: Squat*
	// 16: Lunge*
	// 17: Leg Press*
	// 18: Leg Curl
	// 19: Leg Extension
	// 20: Inner Thigh
	// 21: Outer Thigh

	public int[] getLifts() {
		return this.lifts;
	}

	public void readInputFile() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("input.txt"));
		
		int i = 0;
		this.lifts = new int[22];
		while(true) {
			String line = br.readLine();
			if (line == null) break;
			this.lifts[i++] = Integer.parseInt(line);
		}
	}

	public void writeInputFile() throws IOException {
		PrintWriter pw = new PrintWriter("input.txt");

		for (int i = 0; i < 22; i++) {
			pw.println(this.lifts[i]);
		}
		pw.close();
	}

	public void writeOutputFile(int option) throws IOException {
		PrintWriter pw = new PrintWriter("output.txt");
		Calculator calc = new Calculator();
		switch (option) {
		case 1:
			// Push Day
			
			pw.println("Push Day - Chest, Shoulders and Triceps");

			calc.pyramid(this.lifts[0]);
			pw.println("\nExercise 1: Bench Press:");
			for (int i = 0; i < calc.getSets().length; i++) {
				pw.println("Set " + i + ": " + calc.getSets()[i][0] + " x " + calc.getSets()[i][1]);
			}

			calc.fivefive(this.lifts[1]);
			pw.println("\nExercise 2: Incline Bench Press:");
			for (int i = 0; i < calc.getSets().length; i++) {
				pw.println("Set " + i + ": " + calc.getSets()[i][0] + " x " + calc.getSets()[i][1]); 
			}

			calc.machine(this.lifts[2]);
			pw.println("\nExercise 3: Deltoid Flex:");
			for (int i = 0; i < calc.getSets().length; i++) {
				pw.println("Set " + i + ": " + calc.getSets()[i][0] + " x " + calc.getSets()[i][1]); 
			}

			calc.machine(this.lifts[3]);
			pw.println("\nExercise 4: Tricep Extension:");
			for (int i = 0; i < calc.getSets().length; i++) {
				pw.println("Set " + i + ": " + calc.getSets()[i][0] + " x " + calc.getSets()[i][1]); 
			}

			

			break;
		case 2:
			// Pull Day
		
			break;
		case 3:
			// Leg Day
			
			break;
		case 4:
			// Cardio Day

			break;
		}
		pw.close();
	}

	public static void main(String[] args) throws IOException {
		DataInput data = new DataInput();
		data.readInputFile();
		
		Calculator calc = new Calculator();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome! Do you have any new weights to record? 0 - No, 1 - Yes");
		
		int newWeights = scan.nextInt();
		int weightsChanged = 0;
		if (newWeights == 1) {
			System.out.println("0. Bench Press, 1. Incline Bench Press, 2, Deltoid Flex, 3. Tricep Extension");
			System.out.println("4. Tricep Dips, 5. Tricep Pushdown, 6, Shoulder Press, 7. Lateral/Front Raises");
			System.out.println("8. Clean and Press, 9. LAT Pulldown, 10, Deadlift, 11: Low Row");
			System.out.println("12. Seated Bicep Curls, 13. Dumbbell Row, 14. Standing Cable Curls, 15. Squat");
			System.out.println("16. Lunge, 17, Leg Press, 18. Leg Curl 19. Leg Extension");
			System.out.println("20. Inner Thigh, 21. Outer Thigh");
			System.out.println("------------------------------------------");
			System.out.println("Enter new weights, first with the exercise number (0-21) and followed by the new weight. Enter -1 to stop.");

			int number = scan.nextInt();
			while (number != -1) {
				int weight = scan.nextInt();
				data.lifts[number] = weight;
				weightsChanged++;
				number = scan.nextInt();
			}
		}
		
		data.writeInputFile();

		System.out.println(weightsChanged + " Weights have been changed. What workout will you be doing today? 1 - Push, 2 - Pull, 3 - Legs, 4 - Misc + Cardio");

		int option = scan.nextInt();
		data.writeOutputFile(option);

		System.out.println("Workout Plan printed to output.txt!");
	}
}
