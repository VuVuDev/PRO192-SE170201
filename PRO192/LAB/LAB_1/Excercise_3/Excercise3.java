public class Excercise3 {
	public static void main(String[] args) {
		System.out.println("---FIND x FROM a*x^2 + b*x + c = 0 ----");
		float number_1 = Float.parseFloat(args[0]);
		float number_2 = Float.parseFloat(args[1]);
		float number_3 = Float.parseFloat(args[2]);
		float x1 = 0;
		float x2 = 0;
		System.out.println();
		System.out.println("Number a: " + number_1);
		System.out.println("Number b: " + number_2);
		System.out.println("Number c: " + number_3);

		double delta = Math.pow(number_2, 2) - (float) 4*number_1*number_3;
		System.out.format("Delta = %.3f%n", delta);
		System.out.println();

		if (delta < 0) {
			System.out.println("THE EQUATION HAS NO SOLUTION!");
		} else if (delta == 0) {
			System.out.format("THE EQUATION HAS A DOUBLE SOLUTION: %.3f%n",	(float) -number_2/2*number_1);
		} else if (delta > 0) {
			delta = Math.sqrt(delta);
			x1 = (float) (-number_2 + delta) / (2*number_1);
			x2 = (float) (-number_2 - delta) / (2*number_1);
			System.out.println("THE EQUATION HAS TWO DISTINCT SOLUTION: ");
			System.out.format("SOLUTION X1: %.2f%n", x1);
			System.out.format("SOLUTION X2: %.2f%n", x2);
		}

	}
}
