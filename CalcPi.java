// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
		int num = Integer.parseInt(args[0]);
		double pi = 0;
		double denominator = 1.0;
		for (int i = 0; i < num; i++) {
			pi = (i % 2 == 0) ? pi + (1.0 / denominator) : pi - (1.0 / denominator);
			denominator += 2.0;
		}
	    System.out.println("pi, according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + (pi * 4));

	}
}
