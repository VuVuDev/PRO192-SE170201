import java.util.Scanner;

public class Excercise17 {
	public static int convertToDecimal(String binary) {
		long number = Long.parseLong(binary);
		long remainder = 0;
		while(number > 0) {
			remainder = number%10;
			number = number/10;
			if(remainder != 1 && remainder != 0) {
				System.out.print(" THIS IS'NT BINARY NUMBER! \n PLEASE TRY AGAIN...");
				return -1;
			}
		}
		return Integer.parseInt(binary, 2);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter string of binary: ");
		String binary = sc.nextLine();
		int decimal = convertToDecimal(binary);
		if(decimal == -1) {
			System.out.println("\n Return status " + decimal + "| Program has exited");
			System.exit(0);
		} else {
			System.out.println(" " + binary + " to Decimal is: " + decimal);
		}
	}
}
