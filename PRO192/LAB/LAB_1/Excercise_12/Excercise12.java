import java.util.Scanner;
public class Excercise12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("--FIND DIVISOR--");
		System.out.print("Enter number: ");
		int number = sc.nextInt();
		findDivisor(number);
	}
	
	public static void findDivisor(int number) {
		for (int i = 1; i <= number; i++ ){
			if (number % i == 0) {
				System.out.print(" " + i + " |" );
			}
		}
	}
}
