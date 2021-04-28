import java.io.*;

public class DataInput {
	
	// Machines with Star will be max weight.
	// Machines without Star will be 4x10 weight.

	private int[] pushLifts;
	// 0: Bench Press*
	// 1: Incline Bench Press*
	// 2: Deltoid Flex
	// 3: Tricep Extension
	// 4: Tricep Dips
	// 5: Tricep Pushdown
	// 6: Shoulder Press
	// 7: Lateral/Front Raises
	// 8: Clean and Press*
	// Not Included: Push-ups
	
	private int[] pullLifts;
	// 0: LAT Pulldown
	// 1: Deadlift*
	// 2: Low Row
	// 3: Seated Bicep Curls
	// 4: Dumbbell Row
	// 5: Standing Cable Curls
	// Not Included: Pull Ups

	private int[] legLifts;
	// 0: Squat*
	// 1: Lunge*
	// 2: Leg Press*
	// 3: Leg Curl
	// 4: Leg Extension
	// 5: Inner Thigh
	// 6: Outer Thigh
	// Not Included: Calf Raises

	public void readInputFile() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("input.txt"));
		
		int c = 0;
		int[] allLifts = new int[22];
		while(true) {
			String line = br.readLine();
			if (line == null) break;
			allLifts[c++] = Integer.parseInt(line);
		}

		for (int i = 0; i < 9; i++) {
			this.pushLifts[i] = allLifts[i];
		}

		for (int i = 0; i < 6; i++) {
			this.pullLifts[i] = allLifts[i + 9];
		}

		for (int i = 0; i < 7; i++) {
			this.legLifts[i] = allLifts[i + 15];
		}
	}

	public void writeInputFile() throws IOException {
		PrintWriter pw = new PrintWriter("input.txt");
		
		for (int i = 0; i < 9; i++) {
			pw.println(this.pushLifts[i]);
		}

		for (int i = 0; i < 6; i++) {
			pw.println(this.pullLifts[i]);
		}

		for (int i = 0; i < 7; i++) {
			pw.println(this.legLifts[i]);
		}
	}

	public void writeOutputFile() throws IOException {

	}
}
