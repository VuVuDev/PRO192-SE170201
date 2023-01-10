import java.util.Scanner;

public class Excercise7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = sc.nextInt(); 
		System.out.println("n = " +  n);
		System.out.println("Perfect numbers form 1 to " + n + " is: ");
		for (int i = 1; i <= n; i++) {
			if(isPerfect(i) == 1) {
				System.out.format("%d ", i);
			}
		}
	}
	public static int isPerfect(int number) {
		int sum = 0;
		for (int i = 1; i <= number/2; i++) {
			if(number % i == 0) {
				sum += i;
			}
		}
		if (number == sum) {
			return 1;
		} else {
		 	return 0; 
		}
		
	}
}	
