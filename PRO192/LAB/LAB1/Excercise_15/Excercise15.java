import java.util.Scanner;
public class Excercise15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter point (A, B, C, D, F):  ");
		String strPoint = sc.nextLine(); 
		String strToUpperPoint = strPoint.toUpperCase(); 
		char charPoint = strToUpperPoint.charAt(0);
		System.out.print("\nChar point is: " + charPoint + "\n");
		int intPoint = convertToIntPoint(charPoint);
		if (intPoint == -1) System.out.println("Input don't match any cases|  __return status " + intPoint);
		else System.out.format("Input '%c' after converted is %d ", charPoint, intPoint);
	}
	public static int convertToIntPoint(char character) {
		switch (character) {
			case 'A' :
				return 4;
			case 'B' : 
				return 3;
			case 'C': 
				return 2;
			case 'D': 
				return 1;
			case 'F':
				return 0;
			default: 
				return -1;
		}
	}
}
