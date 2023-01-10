import java.util.Scanner;

public class Excercise6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		System.out.print("Input m: ");
		int number_a = sc.nextInt();
		System.out.println();
		System.out.print("Input n: ");
		int number_b = sc.nextInt();	
	
		System.out.println();
		System.out.println("Square number from " + number_a + " to " + number_b + " is: ");
		
		for (int i = number_a; i <= number_b; i++)  {
		
			isSquare(i);
			
		}
	}
	public static void isSquare(int number) {
		
		for(int i = 1; i <= Math.sqrt(number); i++) {
			if(Math.pow(i, 2) == number) {
				System.out.format("%d ", number);
			}
		} 
	}
}
