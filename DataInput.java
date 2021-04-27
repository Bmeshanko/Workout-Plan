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

	public void readFile() {
		BufferedReader br = new BufferedReader(new FileReader("input.txt"));
		
		String
		
	}

	public void writeFile(String fileName) {
		PrintWriter pw = new PrintWriter(fileName);
	

	}
}
