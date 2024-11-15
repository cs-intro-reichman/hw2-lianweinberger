// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int num = Integer.parseInt(args[0]);
		char mode = args[1].charAt(0);

		if (mode == 'v') {
			for (int i = 1; i <= num; i++) {
				int count = 1;
				int newNum = i;
				System.out.print(newNum);
				do {
					if (newNum % 2 == 0) {
						newNum /= 2;
						System.out.print(" " + newNum);
					}
					else {
						newNum = newNum * 3 + 1;
						System.out.print(" " + newNum);
					}
					count++;
				}
				while (newNum != 1);
				System.out.print(" (" + count + ")");
				System.out.println();
			}
		}
		System.out.println("Every one of the first " + num + " hailstone sequences reached 1.");
	}
}
