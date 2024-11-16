// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
		int num = Integer.parseInt(args[0]);
		double pi = 0;
		double denominator = 1.0;
		for (int i = 0; i < num; i++) {
			double fraction = 1 / denominator;
			pi = i % 2 == 0 ? pi + fraction : pi - fraction;
			denominator += 2;
		}
	    System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + (pi * 4));

	}
}
