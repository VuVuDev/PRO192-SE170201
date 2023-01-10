import java.util.Scanner;

public class Part2 {
	public static float calculator(float number_1, float number_2, String operator) {
		switch (operator) {
			case "+" : return number_1 + number_2;
			case "-" : return number_1 - number_2;
			case "*" : return number_1 * number_2;
			case "/" : return number_1 / number_2;
			default: 
				return -1;
		}
	}

	public static void main(String[] args) {
		float number_1, number_2;
		String operator;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number 1: ");
		number_1 = sc.nextFloat();
		System.out.print("\nEnter the number 2: ");
		number_2 = sc.nextFloat();
		System.out.print("\nInput the operator(+ - * /): ");
		sc = new Scanner(System.in);
		operator = sc.nextLine();
		float result = calculator(number_1, number_2, operator);
		if(result == -1) {
			System.out.println("The operator failed, the program has exited!!!");
			System.exit(0);
		} else	System.out.format("The result of " + number_1 + " " + operator + " " + number_2 + " = " + result);
	}
}
