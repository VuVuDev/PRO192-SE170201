public class Excercise4 {
	public static void main(String[] args) {
		System.out.format("Sum of 1 to N : %d%n", SumtoN(Integer.parseInt(args[0])));
	}
	public static int SumtoN(int number) {
		int sum = 0;
		for (int i = 1; i <= number; i++) {
			sum += i;
		}
		return sum;
	}
}
