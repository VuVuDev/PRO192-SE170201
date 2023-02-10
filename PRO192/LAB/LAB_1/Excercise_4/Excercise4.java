import java.util.Scanner;

public class Excercise4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to calculation: ");
		int number = sc.nextInt();
		System.out.format("Sum of 1 to N : %d%n", SumtoN(number));
	}
	public static int SumtoN(int number) {
		int sum = 0;
		for (int i = 1; i <= number; i++) {
			sum += i;
		}
		return sum;
	}
}
