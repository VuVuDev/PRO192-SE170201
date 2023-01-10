import java.util.Scanner;

public class Excercise16 {
	public static void convertToBinary(int number) {
		int[] binary = new int[40];
		int index = 0;
		while (number > 0) {
			binary[index++] = number%2;
			number = number/2;
		}		
		for (int i = index -1 ; i >=0 ; i--) {
			System.out.print(binary[i]);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("***CONVERT DECIMAL TO BINARY***");

		System.out.print("Enter Decimal number: ");
		int decimal = sc.nextInt();

		System.out.print("Decimal to Binary by using Logic is: "); 
		new Excercise16().convertToBinary(decimal);
		System.out.println();
		System.out.print("Decimal to Binary by using method toBinaryString() is: " + Integer.toBinaryString(decimal));
	}
}
