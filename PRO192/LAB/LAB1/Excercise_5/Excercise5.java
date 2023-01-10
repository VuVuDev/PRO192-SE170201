public class Excercise5 {
	public static void main(String[] args) {
		int number_a = Integer.parseInt(args[0]);
		int number_b = Integer.parseInt(args[1]);	
		if (number_a < 2) {
			System.out.println("NUMBER A MUST BE GREATER 1!\nTHE PROGRAM HAS EXITED");
			System.exit(0);
		}
		System.out.println("Prime numbers from " + number_a + " to " + number_b + " is: ");
		for (int i = number_a; i <= number_b; i++) {
			if(primeCheck(i) == 1) {
				System.out.format("%d \t", i);
			};
		}
				
	}
	public static int primeCheck(int number) {
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return 0;
			}
		}
		return 1;
	}
}
